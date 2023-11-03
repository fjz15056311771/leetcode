package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class FindFirstAndLastPositionOfElementInSortedArray{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=left_bound(nums,target);
        int right=right_bound(nums,target);
        return new int[]{left,right};
//        int left = binaryfindint(nums,target,true);
//        int right = binaryfindint(nums,target,false)-1;
//        if(left<=right&&right<nums.length&&nums[left]==target&&nums[right]==target){
//            return new int[]{left,right};
//        }
//        return new int[]{-1,-1};
    }
    public int binaryfindint(int[] nums,int target,boolean flag){
        int left = 0,right = nums.length-1, ans = nums.length;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]>target || (flag&&nums[mid]>=target)){
                right = mid-1;
                ans = mid;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public int left_bound(int[] nums,int target){
//        int left=0,right=nums.length-1;
//        while(left<=right){
//            int mid=left+(right-left)/2;
//            if(nums[mid]>target){
//                right=mid-1;
//            }else if(nums[mid]<target){
//                left=mid+1;
//            }else if(nums[mid]==target){
//                right=mid-1;
//            }
//        }
//        if(left==nums.length) return -1;
//        return nums[left]==target ? left:-1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else if(target==nums[mid]){
                right = mid-1;
            }
        }
        if(left == nums.length) return -1;
        return nums[left]==target?left:-1;
    }
    public int right_bound(int[] nums,int target){
//        int left=0,right=nums.length-1;
//        while(left<=right){
//            int mid=left+(right-left)/2;
//            if(nums[mid]>target){
//                right=mid-1;
//            }else if(nums[mid]<target){
//                left=mid+1;
//            }else if(nums[mid]==target){
//                left=mid+1;
//            }
//        }
//        if(left-1<0) return -1;
//        return nums[left-1]==target ? left-1 : -1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else if(target==nums[mid]){
                left = mid+1;
            }
        }
        if(left-1<0) return -1;
        return nums[left-1]==target?left-1:-1;
    }

}

//leetcode submit region end(Prohibit modification and deletion)

}