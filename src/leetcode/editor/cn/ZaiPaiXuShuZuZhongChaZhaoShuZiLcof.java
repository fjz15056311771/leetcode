package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left = left_bound(nums,target);
        int right =  right_bound(nums,target);
        if(left==-1) return 0;
        return right-left+1;
    }
    public int left_bound(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                right=mid-1;
            }
        }
        if(left==nums.length) return -1;
        return nums[left]==target ? left:-1;
    }
    public int right_bound(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                left=mid+1;
            }
        }
        if(left-1<0) return -1;
        return nums[left-1]==target ? left-1 : -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}