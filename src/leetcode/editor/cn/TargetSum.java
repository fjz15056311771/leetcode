package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class TargetSum{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        back(nums,target,0,0);
        return count;

    }
    public void back(int[] nums,int target,int index,int sum){
        if(index==nums.length){
            if(target==sum){
                count++;
            }
        }else{
            back(nums,target,index+1,sum+nums[index]);
            back(nums,target,index+1,sum-nums[index]);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}