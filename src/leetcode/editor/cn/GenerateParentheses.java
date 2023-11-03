package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class GenerateParentheses{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String > res = new ArrayList<>();
        backtrace(res,new StringBuffer(),0,0,n);
        return res;
    }

    public void backtrace(List<String> results,StringBuffer result,int open_num,int close_num,int max){
//        if(result.length()==max*2){
//            results.add(result.toString());
//            return;
//        }
//        if(open_num<max){
//            result.append('(');
//            backtrace(results,result,open_num+1,close_num,max);
//            result.deleteCharAt(result.length()-1);
//        }
//        if(close_num<open_num){
//            result.append(')');
//            backtrace(results,result,open_num,close_num+1,max);
//            result.deleteCharAt(result.length()-1);
//        }
        if(result.length()==max*2){
            results.add(result.toString());
        }else{
            if(open_num<max){
                result.append('(');
                backtrace(results,result,open_num+1,close_num,max);
                result.deleteCharAt(open_num);
            }
            if(close_num<open_num){
                result.append(')');
                backtrace(results,result,open_num,close_num+1,max);
                result.deleteCharAt(close_num);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}