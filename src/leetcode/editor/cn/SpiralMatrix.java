package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int up = 0,low = m-1,left = 0,right = n-1;
        while(res.size()<m*n){
            if(up<=low){
                for(int i=left;i<=right;i++){
                    res.add(matrix[up][i]);
                }
                up++;
            }
            if(right>=left){
                for(int i=up;i<=low;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            if(up<=low){
                for(int i=right;i>=left;i--){
                    res.add(matrix[low][i]);
                }
                low--;
            }
            if(right>=left){
                for(int i=low;i>=up;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}