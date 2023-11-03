package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class BinarySearch{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }
        }
        return -1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}