package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfIslands{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIslands(char[][] grid) {
        //bfs
        if(grid == null || grid[0].length == 0){
            return 0;
        }
        int h = grid.length,w = grid[0].length,res = 0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(grid[i][j]=='1'){
                    ++res;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i*w+j);
                    grid[i][j]='0';
                    while(!queue.isEmpty()){
                        int num = queue.poll(),row = num/w,col = num%w;
                        if(row-1>=0 && row-1<h && grid[row-1][col]=='1'){
                            queue.add((row-1)*w+col);
                            grid[row-1][col]='0';
                        }
                        if(row+1>=0 && row+1<h && grid[row+1][col]=='1'){
                            queue.add((row+1)*w+col);
                            grid[row+1][col]='0';
                        }
                        if(col-1>=0 && col-1<w && grid[row][col-1]=='1'){
                            queue.add(row*w+col-1);
                            grid[row][col-1]='0';
                        }
                        if(col+1>=0 && col+1<w && grid[row][col+1]=='1'){
                            queue.add(row*w+col+1);
                            grid[row][col+1]='0';
                        }

                    }
                }
            }
        }
        return res;











        //dfs
//        if(grid == null || grid.length==0){
//            return 0;
//        }
//        int h = grid.length,w = grid[0].length;
//        int res = 0;
//        for(int i=0;i<h;i++){
//            for(int j=0;j<w;j++){
//                if(grid[i][j]=='1'){
//                    ++res;
//                    dfs(grid,i,j);
//                }
//            }
//        }
//        return res;
    }
    public void dfs(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}