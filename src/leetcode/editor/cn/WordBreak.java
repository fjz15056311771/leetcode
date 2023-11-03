package leetcode.editor.cn;
import java.util.*;

public class WordBreak{
//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
////        Set<String> wordset = new HashSet<>(wordDict);
////        boolean[] dp = new boolean[s.length()+1];
////        dp[0] = true;
////        for(int i=1;i<=s.length();i++){
////            for(int j=0;j<i;j++){
////                if(dp[j] && wordset.contains(s.substring(j,i))){
////                    dp[i] = true;
////                }
////            }
////        }
////        return dp[s.length()];
//        Set<String> set = new HashSet<>(wordDict);
//        boolean[] dp = new boolean[s.length()+1];
//        dp[0] = true;
//        for(int i=1;i<=s.length();i++){
//            for(int j=0;j<i;j++){
//                if(dp[j]&&set.contains(s.substring(j,i))){
//                    dp[i] = true;
//                }
//            }
//        }
//        return dp[s.length()];
//    }
//}
//class Solution {
//    List<String> worddict;
//    boolean found = false;
//    List<String> track = new ArrayList<>();
//    public boolean wordBreak(String s, List<String> wordDict) {
//        worddict = wordDict;
//        backtrack(s,0);
//        return found;
//    }
//
//    public void backtrack(String s,int i){
//        if(i == s.length()){
//            found = true;
//            return;
//        }
//        for(int len=1;i+len<=s.length();len++){
//            String sub = s.substring(i,i+len);
//            if(worddict.contains(sub)){
//                track.add(sub);
//                backtrack(s,i+len);
//                track.remove(track.size()-1);
//            }
//        }
//    }
//}
class Solution {
    List<String> worddict;
    int[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        worddict = wordDict;
        memo = new int[s.length()];
        Arrays.fill(memo,-1);
        return dp(s,0);
    }

    public boolean dp(String s,int i){
        if(i == s.length()){
            return true;
        }
        if(memo[i]!=-1){
            return memo[i]==0?false:true;
        }
        for(int len=1;i+len<=s.length();len++){
            String sub = s.substring(i,i+len);
            if(worddict.contains(sub)){
                boolean subres = dp(s,i+len);
                if(subres){
                    memo[i]=1;
                    return true;
                }
            }
        }
        memo[i]=0;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}