package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DistinctSubsequences{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int memo[][];
    public int numDistinct(String s, String t) {
        memo = new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(memo[i],-1);
        }
        return dp(s,0,t,0);

    }
    public int dp(String s,int i,String t,int j){
        if(j == t.length()){
            return 1;
        }
        if(s.length()-i < t.length()-j){
            return 0;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        int res=0;
        for(int k=i;k<s.length();k++){
            if(s.charAt(k) == t.charAt(j)){
                res += dp(s,k+1,t,j+1);
            }
        }
        memo[i][j] = res;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}