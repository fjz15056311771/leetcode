package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class RangeSumQuery2dImmutable{
//leetcode submit region begin(Prohibit modification and deletion)
class NumMatrix {
    int[][] matrixpre;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        matrixpre = new int[m+1][n+1];
        matrixpre[0][0] = 0;
        for(int i=1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                 matrixpre[i][j] = matrixpre[i-1][j]+matrixpre[i][j-1]-matrixpre[i-1][j-1]+matrix[i-1][j-1];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrixpre[row2+1][col2+1]-matrixpre[row1][col2+1]-matrixpre[row2+1][col1]+matrixpre[row1][col1];

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
//leetcode submit region end(Prohibit modification and deletion)

}