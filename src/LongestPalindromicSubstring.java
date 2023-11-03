//给你一个字符串 s，找到 s 中最长的回文子串。
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。

//输入：s = "cbbd"
//输出："bb"

//输入：s = "a"
//输出："a"

//输入：s = "ac"
//输出："a"

public class LongestPalindromicSubstring {
    public static String solution(String s){
        int n = s.length();
        boolean [][] dp = new boolean[n][n];
        String res = "";
        for(int l=0;l<n;l++){
            for(int i=0;i+l<n;i++){
                int j=i+l;
                if(l==0){
                    dp[i][j]=true;
                }else if(l==1){
                    dp[i][j] = (s.charAt(i)==s.charAt(j));
                }else{
                    dp[i][j] = (s.charAt(i)==s.charAt(j)) && dp[i+1][j-1];
                }
                if(dp[i][j] && l+1>res.length()){
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        String demo = "babadqwer";
        String result = solution(demo);
        System.out.println(result);
    }
}
