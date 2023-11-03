package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class MaximumProductSubarray{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        int[] dpmax = new int[nums.length];
        int[] dpmin = new int[nums.length];
        dpmax[0] = nums[0];
        dpmin[0] = nums[0];
        int max = nums[0];
        for (int i=1;i<nums.length;i++){
            dpmax[i] = Math.max(Math.max(dpmax[i-1]*nums[i],nums[i]),dpmin[i-1]*nums[i]);
            dpmin[i] = Math.min(Math.min(dpmax[i-1]*nums[i],nums[i]),dpmin[i-1]*nums[i]);
            if(dpmax[i]>max) max=dpmax[i];
        }
        return max;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}