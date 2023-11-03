package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class FibonacciNumber{
//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int fib(int n) {
//        if(n==0) return 0;
//        int dpi_2 = 0,dpi_1 = 1;
//        int dpi = dpi_2 + dpi_1;
//        for(int i=2;i<=n;i++){
//            dpi = dpi_2 + dpi_1;
//            dpi_2 = dpi_1;
//            dpi_1 = dpi;
//        }
//        return dpi;
//
//    }
//}
//class Solution {
//    int[] memo;
//    public int fib(int n) {
//        memo = new int[n+1];
//        return dp(n);
//    }
//    public int dp(int n){
//        if(n==0 || n==1) return n;
//        if(memo[n]!=0) return memo[n];
//        int res = dp(n-1)+dp(n-2);
//        memo[n] = res;
//        return res;
//    }
//}
class Solution {
    public int fib(int n) {
        if(n==0 ||n==1) return n;
        int dp_1=1,dp_2=0,dp=0;
        for(int i=2;i<=n;i++){
            dp = dp_1 + dp_2;
            dp_2 = dp_1;
            dp_1 = dp;
        }
        return dp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}