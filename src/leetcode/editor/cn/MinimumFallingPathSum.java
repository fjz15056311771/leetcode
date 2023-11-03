package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinimumFallingPathSum{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] memo;
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        memo = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], 10001);
        }
        int res = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            res = Math.min(dp(matrix,m-1,j),res);
        }
        return res;
    }
    public int dp(int[][] matrix,int i,int j){
        if(i<0 || i>matrix.length-1 || j<0 || j>matrix[0].length-1){
            return 10002;
        }
        if(i==0){
            memo[i][j] = matrix[i][j];
            return memo[i][j];
        }
        if(memo[i][j]!=10001) return memo[i][j];
        memo[i][j] = matrix[i][j] + min(dp(matrix,i-1,j-1),dp(matrix,i-1,j),dp(matrix,i-1,j+1));
        return memo[i][j];
    }
    public int min(int a,int b,int c){
        return(Math.min(Math.min(a,b),c));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}