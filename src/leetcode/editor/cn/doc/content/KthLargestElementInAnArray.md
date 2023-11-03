<p>给定整数数组 <code>nums</code> 和整数 <code>k</code>，请返回数组中第 <code><strong>k</strong></code> 个最大的元素。</p>

<p>请注意，你需要找的是数组排序后的第 <code>k</code> 个最大的元素，而不是第 <code>k</code> 个不同的元素。</p>

<p> </p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> <code>[3,2,1,5,6,4] 和</code> k = 2
<strong>输出:</strong> 5
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> <code>[3,2,3,1,2,4,5,5,6] 和</code> k = 4
<strong>输出:</strong> 4</pre>

<p> </p>

<p><strong>提示： </strong></p>

<ul>
	<li><code>1 <= k <= nums.length <= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>分治</li><li>快速选择</li><li>排序</li><li>堆（优先队列）</li></div></div><br><div><li>👍 1492</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V2.1，[手把手刷二叉树系列课程](https://aep.xet.tech/s/3YGcq3) 上线。[第 18 期每日打卡](https://aep.xet.tech/s/2PLO1n) 最后一天报名。**



<p><strong><a href="https://labuladong.github.io/article?qno=215" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

二叉堆的解法比较简单，实际写算法题的时候，推荐大家写这种解法。

可以把小顶堆 `pq` 理解成一个筛子，较大的元素会沉淀下去，较小的元素会浮上来；当堆大小超过 `k` 的时候，我们就删掉堆顶的元素，因为这些元素比较小，而我们想要的是前 `k` 个最大元素嘛。

当 `nums` 中的所有元素都过了一遍之后，筛子里面留下的就是最大的 `k` 个元素，而堆顶元素是堆中最小的元素，也就是「第 `k` 个最大的元素」。

二叉堆插入和删除的时间复杂度和堆中的元素个数有关，在这里我们堆的大小不会超过 `k`，所以插入和删除元素的复杂度是 `O(logK)`，再套一层 for 循环，总的时间复杂度就是 `O(NlogK)`。

当然，这道题可以有效率更高的解法叫「快速选择算法」，只需要 `O(N)` 的时间复杂度。

快速选择算法不用借助二叉堆结构，而是稍微改造了快速排序的算法思路，有兴趣的读者可以看详细题解。

**详细题解：[快速排序详解及应用](https://labuladong.github.io/article/fname.html?fname=快速排序)**

**标签：二叉堆，快速选择算法，[数组](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)**

## 解法代码

```java
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 小顶堆，堆顶是最小元素
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int e : nums) {
            // 每个元素都要过一遍二叉堆
            pq.offer(e);
            // 堆中元素多于 k 个时，删除堆顶元素
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // pq 中剩下的是 nums 中 k 个最大元素，
        // 堆顶是最小的那个，即第 k 个最大元素
        return pq.peek();
    }
}
```

**类似题目**：
  - [347. 前 K 个高频元素 🟠](/problems/top-k-frequent-elements)
  - [703. 数据流中的第 K 大元素 🟢](/problems/kth-largest-element-in-a-stream)
  - [912. 排序数组 🟠](/problems/sort-an-array)
  - [剑指 Offer 40. 最小的k个数 🟢](/problems/zui-xiao-de-kge-shu-lcof)
  - [剑指 Offer II 059. 数据流的第 K 大数值 🟢](/problems/jBjn9C)
  - [剑指 Offer II 060. 出现频率最高的 k 个数字 🟠](/problems/g5c51o)

</details>
</div>

