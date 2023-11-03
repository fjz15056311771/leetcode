package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PalindromePartitioning{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<String>> res = new ArrayList<>();
    List<String> subres = new ArrayList<>();
    int n;
    boolean[][] dp;
    public List<List<String>> partition(String s) {
        n = s.length();
        dp = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(s.charAt(i)==s.charAt(j) && (i-j<2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                }
            }
        }
        dfs(s,0);
        return res;
    }
    public void dfs(String s,int i){
        if(i==n){
            res.add(new ArrayList<String>(subres));
            return;
        }
        for(int j=i;j<n;j++){
            if(dp[i][j]){
                subres.add(s.substring(i,j+1));
                dfs(s,j+1);
                subres.remove(subres.size()-1);
            }
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}