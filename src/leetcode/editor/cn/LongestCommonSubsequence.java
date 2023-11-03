package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class LongestCommonSubsequence{
//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int longestCommonSubsequence(String text1, String text2) {
//        int m = text1.length(),n = text2.length();
//        int[][] dp = new int[m+1][n+1];
//        for(int i=0;i<=m;i++){
//            dp[i][0] = 0;
//        }
//        for(int j=0;j<=n;j++){
//            dp[0][j] = 0;
//        }
//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++){
//                char c1 = text1.charAt(i-1);
//                char c2 = text2.charAt(j-1);
//                if(c1==c2){
//                    dp[i][j] = dp[i-1][j-1]+1;
//                }else{
//                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//                }
//            }
//        }
//        return dp[m][n];
//
//    }
//}
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(),n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            dp[i][0] = 0;
        }
        for(int j=1;j<=n;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}