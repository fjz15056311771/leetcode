package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SevenP8L0Z{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> track = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrace(nums,used);
        return res;
    }
    public void backtrace(int[] nums,boolean[] used){
        if(track.size() == nums.length){
            res.add(new ArrayList<>(track));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            track.add(nums[i]);
            used[i] = true;
            backtrace(nums,used);
            used[i] = false;
            track.remove(track.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}