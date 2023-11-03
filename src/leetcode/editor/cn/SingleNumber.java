package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SingleNumber{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}