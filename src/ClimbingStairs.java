//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//注意：给定 n 是一个正整数。

//输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶

//输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶

public class ClimbingStairs {
    public static int solution(int n){
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                dp[i] = 1;
            }else if(i==1){
                dp[i] = 2;
            }else dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }

    public static int solution2(int n) {
        int p;
        int q = 0;
        int r = 1;
        for(int i=1;i<=n;i++){
            p = q;
            q = r;
            r = p+q;
        }
        return r;
    }

    public static void main(String[] args){
        int result = solution(10);
        int result2 = solution2(10);
        System.out.println(result);
        System.out.println(result2);
    }
}
