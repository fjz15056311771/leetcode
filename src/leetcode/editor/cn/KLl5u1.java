package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class KLl5u1{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L=0,R=numbers.length-1;
        while(L<R){
            int sum = numbers[L]+numbers[R];
            if(target>sum){
                L++;
            }else if(target<sum){
                R--;
            }else{
                return new int[]{L,R};
            }
        }
        return null;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}