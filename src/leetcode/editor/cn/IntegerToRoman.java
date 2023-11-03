package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class IntegerToRoman{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String intToRoman(int num) {
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer result = new StringBuffer();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                num -= values[i];
                result.append(symbols[i]);
            }
            if(num == values[i]){
                break;
            }
        }
        return result.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}