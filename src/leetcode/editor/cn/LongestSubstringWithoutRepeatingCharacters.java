package leetcode.editor.cn;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
//        Set<Character> set = new HashSet<Character>();
//        int n = s.length(),ans=0,rk=-1;
//        for(int i=0;i<n;i++){
//            if(i!=0){
//                set.remove(s.charAt(i-1));
//            }
//            while(rk+1<n && !set.contains(s.charAt(rk+1))){
//                set.add(s.charAt(rk+1));
//                rk++;
//            }
//            ans = Math.max(ans,rk-i+1);
//        }
//        return ans;
//        int ans=0;
//        HashMap<Character,Integer> window = new HashMap<>();
//        int left=0,right=0;
//        while(right<s.length()){
//            char c = s.charAt(right);
//            right++;
//            window.put(c,window.getOrDefault(c,0)+1);
//            while(window.get(c)>1){
//                char r = s.charAt(left);
//                left++;
//                window.put(r,window.getOrDefault(r,0)-1);
//            }
//            ans = Math.max(ans,right-left);
//        }
//        return ans;
        int res=0,left=0,right=0;
        HashMap<Character,Integer> window = new HashMap<>();
        while(right<s.length()){
            char c = s.charAt(right);
            right++;
            window.put(c,window.getOrDefault(c,0)+1);
            while(window.get(c)>1){
                char r = s.charAt(left);
                left++;
                window.put(r,window.getOrDefault(r,0)-1);
            }
            res = Math.max(res,right-left);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}