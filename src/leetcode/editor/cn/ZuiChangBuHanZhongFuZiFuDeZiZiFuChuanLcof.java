package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> window = new HashMap<>();
        int left=0,right=0,res=0;
        while(right<s.length()){
            char c = s.charAt(right);
            right++;
            window.put(c,window.getOrDefault(c,0)+1);
            while(window.get(c)>1){
                char r = s.charAt(left);
                left++;
                window.put(r,window.getOrDefault(r,0)-1);
            }
            res = Math.max(right-left,res);
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}