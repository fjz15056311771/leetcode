<p>给你一个由 <code>n</code> 个整数组成的数组&nbsp;<code>nums</code> ，和一个目标值 <code>target</code> 。请你找出并返回满足下述全部条件且<strong>不重复</strong>的四元组&nbsp;<code>[nums[a], nums[b], nums[c], nums[d]]</code>&nbsp;（若两个四元组元素一一对应，则认为两个四元组重复）：</p>

<ul> 
 <li><code>0 &lt;= a, b, c, d&nbsp;&lt; n</code></li> 
 <li><code>a</code>、<code>b</code>、<code>c</code> 和 <code>d</code> <strong>互不相同</strong></li> 
 <li><code>nums[a] + nums[b] + nums[c] + nums[d] == target</code></li> 
</ul>

<p>你可以按 <strong>任意顺序</strong> 返回答案 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,0,-1,0,-2,2], target = 0
<strong>输出：</strong>[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [2,2,2,2,2], target = 8
<strong>输出：</strong>[[2,2,2,2]]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 200</code></li> 
 <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li> 
 <li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 双指针 | 排序</details><br>

<div>👍 1446, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://mp.weixin.qq.com/s/NF8mmVyXVfC1ehdMOsO7Cw' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.github.io/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V2.0，2022 年最后一期打卡训练营 [最后一天报名](https://mp.weixin.qq.com/s/eUG2OOzY3k_ZTz-CFvtv5Q)。**



<p><strong><a href="https://labuladong.github.io/article?qno=18" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

PS：这道题在[《算法小抄》](https://mp.weixin.qq.com/s/tUSovvogbR9StkPWb75fUw) 的第 319 页。

nSum 系列问题的核心思路就是**排序 + 双指针**。

先给数组从小到大排序，然后双指针 `lo` 和 `hi` 分别在数组开头和结尾，这样就可以控制 `nums[lo]` 和 `nums[hi]` 这两数之和的大小：

如果你想让它俩的和大一些，就让 `lo++`，如果你想让它俩的和小一些，就让 `hi--`。

基于两数之和可以得到一个万能函数 `nSumTarget`，扩展出 n 数之和的解法，具体分析见详细题解。

**详细题解：[一个方法团灭 nSum 问题](https://labuladong.github.io/article/fname.html?fname=nSum)**

**标签：[数组双指针](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)，递归**

## 解法代码

```cpp
class Solution {
    public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        // n 为 4，从 nums[0] 开始计算和为 target 的四元组
        return nSumTarget(nums, 4, 0, target);
    }

    /* 注意：调用这个函数之前一定要先给 nums 排序 */
    // n 填写想求的是几数之和，start 从哪个索引开始计算（一般填 0），target 填想凑出的目标和
    vector<vector<int>> nSumTarget(
            vector<int>& nums, int n, int start, int target) {

        int sz = nums.size();
        vector<vector<int>> res;
        // 至少是 2Sum，且数组大小不应该小于 n
        if (n < 2 || sz < n) return res;
        // 2Sum 是 base case
        if (n == 2) {
            // 双指针那一套操作
            int lo = start, hi = sz - 1;
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                int left = nums[lo], right = nums[hi];
                if (sum < target) {
                    while (lo < hi && nums[lo] == left) lo++;
                } else if (sum > target) {
                    while (lo < hi && nums[hi] == right) hi--;
                } else {
                    res.push_back({left, right});
                    while (lo < hi && nums[lo] == left) lo++;
                    while (lo < hi && nums[hi] == right) hi--;
                }
            }
        } else {
            // n > 2 时，递归计算 (n-1)Sum 的结果
            for (int i = start; i < sz; i++) {
                vector<vector<int>>
                        sub = nSumTarget(nums, n - 1, i + 1, target - nums[i]);
                for (vector<int>& arr : sub) {
                    // (n-1)Sum 加上 nums[i] 就是 nSum
                    arr.push_back(nums[i]);
                    res.push_back(arr);
                }
                while (i < sz - 1 && nums[i] == nums[i + 1]) i++;
            }
        }
        return res;
    }
};
```

**类似题目**：
  - [1. 两数之和 🟢](/problems/two-sum)
  - [15. 三数之和 🟠](/problems/3sum)
  - [167. 两数之和 II - 输入有序数组 🟢](/problems/two-sum-ii-input-array-is-sorted)
  - [剑指 Offer II 007. 数组中和为 0 的三个数 🟠](/problems/1fGaJU)

</details>
</div>



