package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class TVdhkn{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrace(nums,0);
        return res;

    }
    public void backtrace(int[] nums,int index){
        res.add(new ArrayList<>(track));
        for (int i=index;i<nums.length;i++){
            track.add(nums[i]);
            backtrace(nums,i+1);
            track.remove(track.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}