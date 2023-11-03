package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int ans=0;
        for(int i=0;i<s.length();i++){
            int value = map.get(s.charAt(i));
            if(i<s.length()-1 && map.get(s.charAt(i+1))>value){
                ans -= value;
            }else{
                ans += value;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}