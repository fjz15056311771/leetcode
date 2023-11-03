package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class Ygoe9J{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrace(candidates,target,0);
        return res;
    }
    public void backtrace(int[] candidates,int target,int index){
        if(sum == target){
            res.add(new ArrayList<>(track));
            return;
        }
        if(sum>target) return;
        for(int i=index;i<candidates.length;i++){
            track.add(candidates[i]);
            sum += candidates[i];
            backtrace(candidates,target,i);
            sum -= candidates[i];
            track.remove(track.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}