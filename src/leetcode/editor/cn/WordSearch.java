package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class WordSearch{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {
//        int h = board.length,w = board[0].length;
//        boolean[][] visited = new boolean[h][w];
//        for(int i=0;i<h;i++){
//            for(int j=0;j<w;j++){
//                boolean flag = check(board,word,visited,i,j,0);
//                if(flag){
//                    return true;
//                }
//            }
//        }
//        return false;
        int m = board.length,n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                boolean flag = check(board,word,visited,i,j,0);
                if(flag) return true;
            }
        }
        return false;
    }
    public boolean check(char[][] board,String word,boolean[][] visited,int i,int j,int index){
//        if(board[i][j]!=word.charAt(index)){
//            return false;
//        }else if(index==word.length()-1){
//            return true;
//        }
//        visited[i][j] = true;
//        boolean result = false;
//        int[][] bias = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
//        for(int[] unit : bias){
//            int newi = i+unit[0],newj = j+unit[1];
//            if(newi>=0&&newi<board.length&&newj>=0&&newj<board[0].length){
//                if(!visited[newi][newj]){
//                    boolean flag = check(board,word,visited,newi,newj,index+1);
//                    if(flag){
//                        result = true;
//                        break;
//                    }
//                }
//            }
//        }
//        visited[i][j] = false;
//        return result;
        if(board[i][j]!=word.charAt(index)){
            return false;
        }else if(index == word.length()-1){
            return true;
        }
        visited[i][j] = true;
        boolean result = false;
        int[][] directs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        for(int[] direct : directs){
            int newi = i+direct[0],newj = j+direct[1];
            if(newi>=0&&newi<board.length&&newj>=0&&newj<board[0].length){
                if(!visited[newi][newj]){
                    result = check(board,word,visited,newi,newj,index+1);
                    if(result){
                        result = true;
                        break;
                    }

                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}