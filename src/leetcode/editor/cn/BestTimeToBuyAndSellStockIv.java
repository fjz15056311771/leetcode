package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class BestTimeToBuyAndSellStockIv{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int k, int[] prices) {
        int max_k=k,n=prices.length;
        int[][][] dp = new int[n][max_k+1][2];
        for(int i=0; i<n; i++){
            for(int j=max_k; j>=1; j--){
                if(i == 0){
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[n-1][max_k][0];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}