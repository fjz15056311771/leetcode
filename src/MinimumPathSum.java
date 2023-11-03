//给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
//说明：每次只能向下或者向右移动一步。

//输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
//输出：7
//解释：因为路径 1→3→1→1→1 的总和最小。

//输入：grid = [[1,2,3],[4,5,6]]
//输出：12

public class MinimumPathSum {
    public static int solution(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            if(i==0){
                dp[0][i] = grid[0][0];
            }else{
                dp[0][i] = dp[0][i-1] + grid[0][i];
            }
        }
        for(int j=0;j<n;j++){
            if(j==0){
                dp[j][0] = grid[0][0];
            }else{
                dp[j][0] = dp[j-1][0] + grid[j][0];
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i][j-1]+grid[i][j],dp[i-1][j]+grid[i][j]);
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int result = solution(grid);
        System.out.println(result);
    }
}
