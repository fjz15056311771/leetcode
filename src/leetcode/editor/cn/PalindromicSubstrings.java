package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class PalindromicSubstrings{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        boolean dp[][] = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(s.charAt(i)==s.charAt(j) && (i-j<2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    ans++;
                }
            }
        }
        return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}