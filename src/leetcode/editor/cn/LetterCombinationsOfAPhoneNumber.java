package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<String>();
        if(digits.length()==0) return results;
        Map<Character,String> phoneMap = new HashMap<Character,String>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }};
        back(results,phoneMap,digits,0,new StringBuffer());
        return results;

    }
    public void back(List<String> results,Map<Character,String> phoneMap,String digits,int index,StringBuffer result){
//        if(digits.length()==index){
//            results.add(result.toString());
//        }else {
//            char digit = digits.charAt(index);
//            String letters = phoneMap.get(digit);
//            for(int i=0;i<letters.length();i++){
//                result.append(letters.charAt(i));
//                back(results,phoneMap,digits,index+1,result);
//                result.deleteCharAt(index);
//            }
//        }
        if(digits.length()==index){
            results.add(result.toString());
        }else{
            char i = digits.charAt(index);
            String letters = phoneMap.get(i);
            for(int j=0;j<letters.length();j++){
                result.append(letters.charAt(j));
                back(results,phoneMap,digits,index+1,result);
                result.deleteCharAt(index);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}