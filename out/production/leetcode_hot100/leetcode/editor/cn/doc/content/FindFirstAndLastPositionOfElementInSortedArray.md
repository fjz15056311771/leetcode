<p>给定一个按照升序排列的整数数组 <code>nums</code>，和一个目标值 <code>target</code>。找出给定目标值在数组中的开始位置和结束位置。</p>

<p>如果数组中不存在目标值 <code>target</code>，返回 <code>[-1, -1]</code>。</p>

<p><strong>进阶：</strong></p>

<ul>
	<li>你可以设计并实现时间复杂度为 <code>O(log n)</code> 的算法解决此问题吗？</li>
</ul>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [<code>5,7,7,8,8,10]</code>, target = 8
<strong>输出：</strong>[3,4]</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [<code>5,7,7,8,8,10]</code>, target = 6
<strong>输出：</strong>[-1,-1]</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>nums = [], target = 0
<strong>输出：</strong>[-1,-1]</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>0 <= nums.length <= 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
	<li><code>nums</code> 是一个非递减数组</li>
	<li><code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>二分查找</li></div></div><br><div><li>👍 1485</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V2.1，[手把手刷二叉树系列课程](https://aep.xet.tech/s/3YGcq3) 上线，第 17 期刷题打卡 [开始报名](https://aep.xet.tech/s/2jPp5X)。**



<p><strong><a href="https://labuladong.github.io/article?qno=34" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

> 本文有视频版：[二分搜索核心框架套路](https://www.bilibili.com/video/BV1Gt4y1b79Q)

PS：这道题在[《算法小抄》](https://mp.weixin.qq.com/s/tUSovvogbR9StkPWb75fUw) 的第 71 页。

二分搜索的难点就在于如何搜索左侧边界和右侧边界，代码的边界的控制非常考验你的微操，这也是很多人知道二分搜索原理但是很难写对代码的原因。

[二分搜索框架详解](https://labuladong.github.io/article/fname.html?fname=二分查找详解) 专门花了很大篇幅讨论如何写对二分搜索算法，总结来说：

写对二分搜索的关键在于搞清楚搜索边界，到底是开区间还是闭区间？到底应该往左侧收敛还是应该往右侧收敛？

深入的探讨请看详细题解。

**详细题解：[我写了首诗，把二分搜索算法变成了默写题](https://labuladong.github.io/article/fname.html?fname=二分查找详解)**

**标签：[二分搜索](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)**

## 解法代码

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{left_bound(nums, target), right_bound(nums, target)};
    }

    int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // 搜索区间为 [left, right]
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // 搜索区间变为 [mid+1, right]
                left = mid + 1;
            } else if (nums[mid] > target) {
                // 搜索区间变为 [left, mid-1]
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 收缩右侧边界
                right = mid - 1;
            }
        }
        // 检查出界情况
        if (left >= nums.length || nums[left] != target) {/**<extend up -300>

![](https://labuladong.gitee.io/pictures/二分查找/2.jpg)
*/
            return -1;
        }
        return left;
    }

    int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 这里改成收缩左侧边界即可
                left = mid + 1;
            }
        }
        // 这里改为检查 right 越界的情况，见下图
        if (right < 0 || nums[right] != target) {/**<extend up -300>

![](https://labuladong.gitee.io/pictures/二分查找/4.jpg)
*/
            return -1;
        }
        return right;
    }
}
```

**类似题目**：
  - [704. 二分查找 🟢](/problems/binary-search)
  - [剑指 Offer 53 - I. 在排序数组中查找数字 I 🟢](/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof)

</details>
</div>



