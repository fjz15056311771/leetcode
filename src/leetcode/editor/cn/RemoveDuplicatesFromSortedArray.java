package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicatesFromSortedArray{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0,fast=0;
        while(fast < nums.length-1){
            if(nums[fast+1] != nums[fast]){
                slow++;
                nums[slow] = nums[fast+1];
            }
            fast++;
        }
        return slow+1;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}