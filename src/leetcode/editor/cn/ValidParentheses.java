package leetcode.editor.cn;
import java.util.*;

public class ValidParentheses{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.peek()!=map.get(s.charAt(i))){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}