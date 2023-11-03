package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class MaximumSubarray{
//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int maxSubArray(int[] nums) {
////        int[] dp = new int[nums.length];
////        dp[0]=nums[0];
////        int max = dp[0];
////        for(int i=1;i<nums.length;i++){
////            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
////            max = Math.max(max,dp[i]);
////        }
////        return max;
//        int[] dp = new int[nums.length];
//        int max = nums[0];
//        dp[0] = nums[0];
//        for(int i=1;i<nums.length;i++){
//            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
//            if(dp[i]>max){
//                max = dp[i];
//            }
//        }
//        return max;
//
//    }
//}
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int n = nums.length,left = 0,right = 0,windowsum = 0,res = Integer.MIN_VALUE;
//        while(right<n){
//            windowsum += nums[right];
//            right++;
//            res = windowsum>res?windowsum:res;
//            while(windowsum<0){
//                windowsum -= nums[left];
//                left++;
//            }
//        }
//
//        return res;
//    }
//}
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i=1;i<n;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
        }
        int res = Integer.MIN_VALUE;
        for(int i:dp){
            res = Math.max(i,res);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}