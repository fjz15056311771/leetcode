package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class HouseRobberIi{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        return Math.max(rob_common(nums,0,nums.length-2),
                rob_common(nums,1,nums.length-1));

    }
    public int rob_common(int[] nums,int start,int end){
        int n = nums.length;
        int[] dp = new int[n];
        if(n == 0) return 0;
        dp[start] = nums[start];
        if(n == 1) return dp[start];
        dp[start+1] = Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[end];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}