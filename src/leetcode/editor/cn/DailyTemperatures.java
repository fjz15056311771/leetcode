package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DailyTemperatures{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            res[i] = s.isEmpty()?0:s.peek()-i;
            s.push(i);
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}