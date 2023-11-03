package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CoinChange{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(i-coin<0) continue;
                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}
//class Solution {
//    int[] memo;
//    public int coinChange(int[] coins, int amount) {
//        memo = new int[amount+1];
//        Arrays.fill(memo, -888);
//        return dp(coins,amount);
//    }
//    public int dp(int[] coins,int amount){
//        if(amount==0) return 0;
//        if(amount<0) return -1;
//        if(memo[amount]!=-888) return memo[amount];
//        int res = Integer.MAX_VALUE;
//        for(int coin : coins){
//            int sub = dp(coins,amount-coin);
//            if(sub==-1) continue;
//            res = Math.min(res,sub+1);
//        }
//        memo[amount] = res==Integer.MAX_VALUE?-1:res;
//        return memo[amount];
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}