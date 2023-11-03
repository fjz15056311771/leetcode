package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class AddDigits{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int res = 0;
            while(num!=0){
                res += num%10;
                num /= 10;
            }
            res += num%10;
            num = res;
        }

        return num;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}