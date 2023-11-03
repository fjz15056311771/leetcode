package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FourSjJUc{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrace(candidates,target,0);
        return res;
    }
    public void backtrace(int[] candidates,int target,int index){
        if(sum == target){
            res.add(new ArrayList<>(track));
            return;
        }
        if(sum>target) return;
        for(int i=index;i< candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            sum += candidates[i];
            track.add(candidates[i]);
            backtrace(candidates,target,i+1);
            track.remove(track.size()-1);
            sum -= candidates[i];

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}