package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class UniqueBinarySearchTrees{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] memo;

    public int numTrees(int n) {
        memo = new int[n+1][n+1];
        return count(1,n);

//        int[] dp = new int[n+1];
//        dp[0] = 1;dp[1]=1;
//        for(int i=2;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                dp[i] += dp[j-1]*dp[i-j];
//            }
//        }
//        return dp[n];
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for(int i=2;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                dp[i] += dp[j-1]*dp[i-j];
//            }
//        }
//        return dp[n];
    }
    public int count(int lo,int lh){
        if(lo>lh) return 1;
        if(memo[lo][lh]!=0) return memo[lo][lh];
        int res = 0;
        for(int i=lo;i<=lh;++i){
            int left = count(lo,i-1);
            int right = count(i+1,lh);
            res += left*right;
        }
        memo[lo][lh] = res;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}