import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Backtrace {
    //电话号码组合
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
        if(digits.length()==index){
            results.add(result.toString());
        }else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            for(int i=0;i<letters.length();i++){
                result.append(letters.charAt(i));
                back(results,phoneMap,digits,index+1,result);
                result.deleteCharAt(index);
            }
        }
    }

    //括号生成
    public List<String> generateParenthesis(int n) {
        List<String > res = new ArrayList<>();
        backtrace(res,new StringBuffer(),0,0,n);
        return res;
    }
    public void backtrace(List<String> results,StringBuffer result,int open_num,int close_num,int max){
        if(result.length()==max*2){
            results.add(result.toString());
            return;
        }
        if(open_num<max){
            result.append('(');
            backtrace(results,result,open_num+1,close_num,max);
            result.deleteCharAt(result.length()-1);
        }
        if(close_num<open_num){
            result.append(')');
            backtrace(results,result,open_num,close_num+1,max);
            result.deleteCharAt(result.length()-1);
        }
    }

    //
}
