package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class TwoSumIiInputArrayIsSorted{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int L=0,R=numbers.length-1;
        while (L<R){
            int sum = numbers[L]+numbers[R];
            int left=numbers[L],right=numbers[R];
            if(sum<target){
                while(L<R && numbers[L]==left) L++;
            }else if(sum>target){
                while(L<R && numbers[R]==right) R--;
            }else if(sum==target){
                res[0] = L+1;
                res[1] = R+1;
                while(L<R && numbers[L]==left) L++;
                while(L<R && numbers[R]==right) R--;
            }
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}