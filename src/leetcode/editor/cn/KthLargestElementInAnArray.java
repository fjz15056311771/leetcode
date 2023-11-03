package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KthLargestElementInAnArray{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quicksort(nums,0,nums.length-1,nums.length-k);
    }
    public int quicksort(int[] nums,int l,int r,int index){
        int pos = truepos(nums,l,r);
        if(pos==index){
            return nums[pos];
        }else{
            return pos<index ? quicksort(nums,pos+1,r,index) : quicksort(nums,l,pos-1,index);
        }
    }
    public int truepos(int[] nums,int l,int r){
        int i = new Random().nextInt(r-l+1)+l;
        swap(nums,i,r);
        return partition(nums,l,r);
    }

    public int partition(int[] nums,int l,int r){
        int pivot = nums[r];
        int i = l-1;
        for(int j=l;j<r;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,r);
        return i+1;

    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}