package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class NextPermutation{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void nextPermutation(int[] nums) {
//        int i = nums.length-2;
//        while(i>=0&&nums[i]>=nums[i+1]){
//            i--;
//        }
//        if(i>=0){
//            int j = nums.length-1;
//            while(j>=0&&nums[i]>=nums[j]){
//                j--;
//            }
//            swap(nums,i,j);
//        }
//        reverse(nums,i+1);
        int i = nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(j>=0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);


    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void reverse(int[] nums,int i){
        int left=i,right=nums.length-1;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}