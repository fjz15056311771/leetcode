package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class HeWeiSdeLiangGeShuZiLcof{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int L=0,R=nums.length-1;
        while (L<R){
            int sum = nums[L]+nums[R];
            int left=nums[L],right=nums[R];
            if(sum<target){
                while(L<R && nums[L]==left) L++;
            }else if(sum>target){
                while(L<R && nums[R]==right) R--;
            }else if(sum==target){
                res[0] = nums[L];
                res[1] = nums[R];
                while(L<R && nums[L]==left) L++;
                while(L<R && nums[R]==right) R--;
            }
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}