package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class LongestPalindromicSubstring{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public String Palindrome(String s,int i,int j){
//        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
//            i--;
//            j++;
//        }
//        return s.substring(i+1,j);
//    }
    public String Palindrome(String s,int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
//        int n = s.length();
//        boolean dp[][] = new boolean[n][n];
//        String res = "";
//        for(int l=0;l<n;l++){
//            for(int i=0;i+l<n;i++){
//                int j = i+l;
//                if(l==0){
//                    dp[i][j] = true;
//                }else if(l==1){
//                    dp[i][j] = (s.charAt(i)==s.charAt(j));
//                }else{
//                    dp[i][j] = dp[i+1][j-1]&&s.charAt(i)==s.charAt(j);
//                }
//                if(dp[i][j]&&l+1>res.length()){
//                    res = s.substring(i,j+1);
//                }
//            }
//        }
//        return res;
//        int n = s.length();
//        boolean[][] dp = new boolean[n][n];
//        String res = "";
//        for(int l=0;l<n;l++){
//            for(int i=0;i+l<n;i++){
//                int j = i+l;
//                if(l==0){
//                    dp[i][j] = true;
//                }else if(l==1){
//                    dp[i][j] = s.charAt(i)==s.charAt(j);
//                }else {
//                    dp[i][j] = dp[i+1][j-1]&&s.charAt(i)==s.charAt(j);
//                }
//                if(dp[i][j]&&l+1>res.length()){
//                    res = s.substring(i,j+1);
//                }
//            }
//        }
//        return res;
//        String res = "";
//        for(int i=0;i<s.length();i++){
//            String s1 = Palindrome(s,i,i);
//            String s2 = Palindrome(s,i,i+1);
//            if(s1.length()>res.length()) res=s1;
//            if(s2.length()>res.length()) res=s2;
//        }
//        return res;
        String res = "";
        for(int i=0;i<s.length();i++){
            String s1 = Palindrome(s,i,i);
            String s2 = Palindrome(s,i,i+1);
            res = s1.length()>res.length() ? s1:res;
            res = s2.length()>res.length() ? s2:res;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}