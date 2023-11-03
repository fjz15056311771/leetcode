package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Subsets{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> track = new ArrayList<Integer>();
    public List<List<Integer>> subsets(int[] nums) {
        back(nums,0);
        return res;


    }

    public void back(int[] nums,int index){
        res.add(new ArrayList<>(track));
        for(int i=index;i<nums.length;i++){
            track.add(nums[i]);
            back(nums,i+1);
            track.remove(track.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}