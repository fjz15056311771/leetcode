package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class PermutationInString{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(char t : s1.toCharArray()){
            need.put(t,need.getOrDefault(t,0)+1);
        }
        int left=0,right=0,valid=0;
        while(right<s2.length()){
            char c = s2.charAt(right);
            right++;

            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            while(right-left>=s1.length()){
                if(valid == need.size()){
                    return true;
                }
                char r = s2.charAt(left);
                left++;

                if(need.containsKey(r)){
                    if(window.get(r).equals(need.get(r))){
                        valid--;
                    }
                    window.put(r,window.getOrDefault(r,0)-1);
                }
            }
        }
        return false;
//        HashMap<Character,Integer> need = new HashMap<>();
//        HashMap<Character,Integer> window = new HashMap<>();
//        for(char i : s1.toCharArray()){
//            need.put(i,need.getOrDefault(i,0)+1);
//        }
//        int left=0,right=0,valid=0;
//        while(right<s2.length()){
//            char c = s2.charAt(right);
//            right++;
//            if(need.containsKey(c)){
//                window.put(c,window.getOrDefault(c,0)+1);
//                if(window.get(c).equals(need.get(c))) valid++;
//            }
//            while (right-left>=s1.length()){
//                if(valid==need.size()) return true;
//                char r = s2.charAt(left);
//                left++;
//                if(need.containsKey(r)){
//                    if(window.get(r).equals(need.get(r))) valid--;
//                    window.put(r,window.getOrDefault(r,0)-1);
//                }
//            }
//        }
//        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}