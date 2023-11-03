package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrixIi{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0,right = n-1,up = 0,low = n-1;
        int num = 1;
        while(num<=n*n){
            if(up<=low){
                for(int i=left;i<=right;i++){
                    res[up][i] = num++;
                }
                up++;
            }
            if(left<=right){
                for(int i=up;i<=low;i++){
                    res[i][right] = num++;
                }
                right--;
            }
            if(up<=low){
                for(int i=right;i>=left;i--){
                    res[low][i] = num++;
                }
                low--;
            }
            if(left<=right){
                for(int i=low;i>=up;i--){
                    res[i][left] = num++;
                }
                left++;
            }
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}