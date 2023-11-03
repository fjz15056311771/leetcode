package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Combinations{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrace(n,k,1);
        return res;
    }
    public void backtrace(int n,int k,int index){
        if(track.size()==k){
            res.add(new ArrayList<>(track));
            return;
        }
        for(int i=index;i<=n;i++){
            track.add(i);
            backtrace(n,k,i+1);
            track.remove(track.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}