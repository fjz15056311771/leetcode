package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CombinationSumIii{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candi = new int[]{1,2,3,4,5,6,7,8,9};
        backtrace(candi,k,n,0);
        return res;

    }
    public void backtrace(int[] candi,int k,int n,int index) {
        if(track.size()==k && sum==n){
            res.add(new ArrayList<>(track));
            return;
        }
        for(int i=index;i<candi.length;i++){
            sum += candi[i];
            track.add(candi[i]);
            backtrace(candi,k,n,i+1);
            track.remove(track.size()-1);
            sum -= candi[i];
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}