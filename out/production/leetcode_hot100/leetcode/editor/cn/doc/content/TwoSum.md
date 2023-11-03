<p>给定一个整数数组 <code>nums</code> 和一个整数目标值 <code>target</code>，请你在该数组中找出 <strong>和为目标值 </strong><em><code>target</code></em>  的那 <strong>两个</strong> 整数，并返回它们的数组下标。</p>

<p>你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。</p>

<p>你可以按任意顺序返回答案。</p>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [2,7,11,15], target = 9
<strong>输出：</strong>[0,1]
<strong>解释：</strong>因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,2,4], target = 6
<strong>输出：</strong>[1,2]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,3], target = 6
<strong>输出：</strong>[0,1]
</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>2 <= nums.length <= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code></li>
	<li><strong>只会存在一个有效答案</strong></li>
</ul>

<p><strong>进阶：</strong>你可以想出一个时间复杂度小于 <code>O(n<sup>2</sup>)</code> 的算法吗？</p>
<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li></div></div><br><div><li>👍 13640</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V2.0，2022 年最后一期打卡训练营 [最后一天报名](https://mp.weixin.qq.com/s/eUG2OOzY3k_ZTz-CFvtv5Q)。**



<p><strong><a href="https://labuladong.github.io/article?qno=1" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

大家都喜欢幽默的人，如果你想调侃自己经常拖延，可以这样调侃下自己（手动狗头）：

背单词背了半年还是 abandon, abandon，刷题刷了半年还是 two sum, two sum...

言归正传，这道题不难，但由于它是 LeetCode 第一题，所以名气比较大，解决这道题也可以有多种思路，我这里说两种最常见的思路。

第一种思路就是靠排序，把 `nums` 排序之后就可以用 [数组双指针技巧汇总](https://labuladong.github.io/article/fname.html?fname=双指针技巧) 中讲到的左右指针来求出和为 `target` 的两个数。

不过因为题目要求我们返回元素的索引，而排序会破坏元素的原始索引，所以要记录值和原始索引的映射。

进一步，如果题目拓展延伸一下，让你求三数之和、四数之和，你依然可以用双指针技巧，我在 [一个函数秒杀 nSum 问题](https://labuladong.github.io/article/fname.html?fname=nSum) 中写一个函数来解决所有 N 数之和问题。

第二种思路是用哈希表辅助判断。对于一个元素 `nums[i]`，你想知道有没有另一个元素 `nums[j]` 的值为 `target - nums[i]`，这很简单，我们用一个哈希表记录每个元素的值到索引的映射，这样就能快速判断数组中是否有一个值为 `target - nums[i]` 的元素了。

简单说，数组其实可以理解为一个「索引 -> 值」的哈希表映射，而我们又建立一个「值 -> 索引」的映射即可完成此题。

**详细题解：[一个方法团灭 nSum 问题](https://labuladong.github.io/article/fname.html?fname=nSum)**

**标签：[双指针](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120596033251475465)，哈希表，[数组](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)**

## 解法代码

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 维护 val -> index 的映射
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 查表，看看是否有能和 nums[i] 凑出 target 的元素
            int need = target - nums[i];
            if (valToIndex.containsKey(need)) {
                return new int[]{valToIndex.get(need), i};
            }
            // 存入 val -> index 的映射
            valToIndex.put(nums[i], i);
        }
        return null;
    }
}
```

**类似题目**：
  - [15. 三数之和 🟠](/problems/3sum)
  - [167. 两数之和 II - 输入有序数组 🟢](/problems/two-sum-ii-input-array-is-sorted)
  - [18. 四数之和 🟠](/problems/4sum)
  - [剑指 Offer 57. 和为s的两个数字 🟢](/problems/he-wei-sde-liang-ge-shu-zi-lcof)
  - [剑指 Offer II 007. 数组中和为 0 的三个数 🟠](/problems/1fGaJU)

</details>
</div>





