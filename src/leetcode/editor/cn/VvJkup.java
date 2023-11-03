package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class VvJkup{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

        boolean[] used = new boolean[nums.length];
        List<Integer> result = new ArrayList<>();
        backtrace(nums,used,result);
        return results;
    }
    public void backtrace(int[] nums,boolean[] used,List<Integer> result){
        if(result.size()== nums.length){
            results.add(new ArrayList<>(result));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(used[i] == true){
                continue;
            }
            result.add(nums[i]);
            used[i] = true;
            backtrace(nums,used,result);
            used[i] = false;
            result.remove(result.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}