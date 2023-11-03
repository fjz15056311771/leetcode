package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class FindAllAnagramsInAString{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();
        for(char i : p.toCharArray()) need.put(i,need.getOrDefault(i,0)+1);
        int left=0,right=0,valid=0;
        while(right<s.length()){
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))) valid++;
            }
            while(right-left>=p.length()){
                if(valid == need.size()){
                    res.add(left);
                }
                char r = s.charAt(left);
                left++;
                if(need.containsKey(r)){
                    if(need.get(r).equals(window.get(r))) valid--;
                    window.put(r,window.getOrDefault(r,0)-1);
                }
            }
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}