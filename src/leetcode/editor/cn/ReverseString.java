package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ReverseString{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
        int slow=0,fast=s.length-1;
        while(slow < fast){
            char tmp = s[fast];
            s[fast] = s[slow];
            s[slow] = tmp;
            slow++;
            fast--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}