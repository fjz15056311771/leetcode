package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class NQueens{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        List<StringBuilder> board = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder tmp = new StringBuilder();
            for(int k=0;k<n;k++){
                tmp.append('.');
            }
            board.add(tmp);
        }
        backtrace(board,0,n);
        return res;


    }
    public void backtrace(List<StringBuilder> board,int index,int n){
        if(index==board.size()){
            List<String> result = new ArrayList<>();
            for(int i=0;i< board.size();i++){
                result.add(board.get(i).toString());
            }
            res.add(new ArrayList<>(result));
            return;
        }
        for(int col=0;col<n;col++){
            if(!isvalid(board,index,col)){
                continue;
            }
            board.get(index).setCharAt(col,'Q');
            backtrace(board,index+1,n);
            board.get(index).setCharAt(col,'.');
        }
    }

    public boolean isvalid(List<StringBuilder> board,int index,int col){
        for(int i=index-1;i>=0;i--){
            if(board.get(i).charAt(col) == 'Q'){
                return false;
            }
        }
        for(int i=col-1;i>=0;i--){
            if(board.get(index).charAt(i) == 'Q'){
                return false;
            }
        }
        for(int i=index-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        for(int i=index-1,j=col+1;i>=0&&j<board.size();i--,j++){
            if(board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}