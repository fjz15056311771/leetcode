package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class M1oyTv{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();
        for(char i : t.toCharArray()){
            need.put(i,need.getOrDefault(i,0)+1);
        }
        int left=0,right=0,len=Integer.MAX_VALUE,start=0,valid=0;
        while(right < s.length()){
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))) valid++;
            }
            while(valid == need.size()){
                if(right-left<len){
                    start = left;
                    len = right-left;
                }
                char r = s.charAt(left);
                left++;
                if(need.containsKey(r)){
                    if(window.get(r).equals(need.get(r))) valid--;
                    window.put(r,window.getOrDefault(r,0)-1);

                }
            }
        }
        return len == Integer.MAX_VALUE ? "" :s.substring(start,start+len);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}