import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Strings {
    //无重复字符的最长字串
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length(),ans=0,rk=-1;
        for(int i=0;i<n;i++){
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while(rk+1<n && !set.contains(s.charAt(rk+1))){
                set.add(s.charAt(rk+1));
                rk++;
            }
            ans = Math.max(ans,rk-i+1);
        }
        return ans;
    }

    //Z字型变换
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
        List<StringBuffer> rows = new ArrayList<StringBuffer>();
        StringBuffer result = new StringBuffer();
        for(int i=0;i<numRows;i++) rows.add(new StringBuffer());
        int i = 0,flag=-1;
        for(char c:s.toCharArray()){
            rows.get(i).append(c);
            if(i==0||i==numRows-1) flag = -flag;
            i += flag;
        }
        for(StringBuffer row:rows){
            result.append(row);
        }
        return result.toString();
    }

    //整数转罗马数字
    public String intToRoman(int num) {
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer result = new StringBuffer();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                num -= values[i];
                result.append(symbols[i]);
            }
            if(num == values[i]){
                break;
            }
        }
        return result.toString();

    }

    //最长公共前缀
    public String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }
        int n = strs[0].length(),m = strs.length;
        for(int i=0;i<n;i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<m;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    //
}
