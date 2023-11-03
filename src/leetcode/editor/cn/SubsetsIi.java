package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubsetsIi{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrace(nums,0);
        return res;
    }
    public void backtrace(int[] nums,int index){
        res.add(new ArrayList<>(track));
        for(int i=index;i< nums.length;i++){
            if(i>index && nums[i] == nums[i-1]) continue;
            track.add(nums[i]);
            backtrace(nums,i+1);
            track.remove(track.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}