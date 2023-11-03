package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class RotateImage{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {
//        int n = matrix.length;
//        for(int i=0;i<n/2;i++){
//            for(int j=0;j<(n+1)/2;j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[n-1-j][i];
//                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
//                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
//                matrix[j][n-1-i] = temp;
//            }
//        }
//        int n = matrix.length;
//        for(int i=0;i<n/2;i++){
//            for(int j=0;j<(n+1)/2;j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[n-1-j][i];
//                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
//                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
//                matrix[j][n-1-i] = temp;
//            }
//        }
        int m = matrix.length,n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int[] row : matrix){
            reverse(row);
        }

    }
    public void reverse(int[] row){
        int i = 0;
        int j = row.length-1;
        while(i<j){
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            i++;
            j--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}