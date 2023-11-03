package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GaM7Ch{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=1;i<amount+1;i++){
            for(int coin : coins){
                if(i-coin<0){
                    continue;
                }
                dp[i] = Math.min(dp[i],dp[i-coin]+1);
            }
        }
        int res = dp[amount]==amount+1 ? -1:dp[amount];
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}