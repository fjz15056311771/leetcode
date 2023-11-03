package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ZigzagConversion{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
        List<StringBuffer> rows = new ArrayList<StringBuffer>();
        StringBuffer result = new StringBuffer();
        for(int i=0;i<numRows;i++) rows.add(new StringBuffer());
        int i = 0,flag=-1;
        for(char c:s.toCharArray()){
            rows.get(i).append(c);
            if(i==0||i==numRows-1) flag = -flag;
            i += flag;
        }
        for(StringBuffer row:rows){
            result.append(row);
        }
        return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}