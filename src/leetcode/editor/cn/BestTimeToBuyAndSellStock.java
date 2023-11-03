package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class BestTimeToBuyAndSellStock{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
//        int min = Integer.MAX_VALUE;
//        int max = 0;
//        for(int i=0;i<prices.length;i++){
//            if(prices[i]<min){
//                min = prices[i];
//            }else if((prices[i]-min)>max){
//                max = prices[i]-min;
//            }
//        }
//        return max;
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int i=0;i<n;i++){
            if(i == 0){
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[n-1][0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}