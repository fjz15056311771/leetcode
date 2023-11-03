package leetcode.editor.cn;
public class MaximalSquare{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxside = 0;
        if(matrix==null) return maxside;
        int row=matrix.length,column=matrix[0].length;
        int[][] dp = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]=='1'){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                    maxside = Math.max(maxside,dp[i][j]);
                }
            }
        }
        return maxside*maxside;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}