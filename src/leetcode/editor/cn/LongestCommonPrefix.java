package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class LongestCommonPrefix{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }
        int n = strs[0].length(),m = strs.length;
        for(int i=0;i<n;i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<m;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}