package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class PalindromeNumber{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        int reversNum = 0;
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }else{
            while(x>reversNum){
                reversNum = reversNum*10+x%10;
                x /=10;
            }
            return reversNum==x || reversNum/10==x;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}