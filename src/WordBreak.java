//给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
//注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
//输入: s = "leetcode", wordDict = ["leet", "code"]
//输出: true
//解释: 返回 true 因为 "leetcode" 可以由 "leet" 和 "code" 拼接成。
//
//输入: s = "applepenapple", wordDict = ["apple", "pen"]
//输出: true
//解释: 返回 true 因为 "applepenapple" 可以由 "apple" "pen" "apple" 拼接成。
//注意，你可以重复使用字典中的单词。
//
//输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
//输出: false

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static boolean solution(String s, List<String> wordDict){
        boolean[] dp = new boolean[s.length()+1];
        Set<String> worddict = new HashSet<>(wordDict);
        dp[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && worddict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args){
        String s = "applepenapple";
        List<String> dict = new ArrayList<>();
        dict.add("apple");
        dict.add("pen");
        System.out.println(solution(s,dict));
    }
}
