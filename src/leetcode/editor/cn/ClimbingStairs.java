package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ClimbingStairs{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
//        int[] dp = new int[n];
//        if(n==1)
//            return 1;
//        dp[0] = 1;
//        dp[1] = 2;
//        for(int i=2;i<n;i++){
//            dp[i] = dp[i-1]+dp[i-2];
//        }
//        return dp[n-1];
        int[] dp = new int[n];
        if(n==1) return 1;
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}