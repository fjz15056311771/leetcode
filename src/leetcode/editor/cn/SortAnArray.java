package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortAnArray{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[] temp;
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
//        temp = new int[nums.length];
//        mergesort(nums,0,nums.length-1);
//        return nums;

    }
    public void mergesort(int[] nums,int left,int right){
        if(left == right) return;
        int mid = left + (right-left)/2;
        mergesort(nums,left,mid);
        mergesort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public void merge(int[] nums,int left,int mid,int right){
        int i=left,j=mid+1;
        for(int p=left;p<=right;p++){
            temp[p] = nums[p];
        }
        for(int q=left;q<=right;q++){
            if(i == mid+1){
                nums[q] = temp[j++];
            }else if(j == right+1){
                nums[q] = temp[i++];
            }else if(temp[i]>temp[j]){
                nums[q] = temp[j++];
            }else {
                nums[q] = temp[i++];
            }
        }
    }
    public void quicksort(int[] nums,int lo,int lh){
        if(lo<lh){
            int p = truepos(nums,lo,lh);
            quicksort(nums,lo,p);
            quicksort(nums,p+1,lh);
        }

    }
    public int truepos(int[] nums,int l,int r){
        int i = new Random().nextInt(r-l+1)+l;
        swap(nums,i,r);
        return partition(nums,l,r);
    }
    public int partition(int[] nums,int l,int r){
        int pos = nums[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(nums[j]<pos){
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,r);
        return i+1;
    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
//    public void quicksort(int[] nums,int l,int r){
//        if(l<r){
//            int pos = truepos(nums,l,r);
//            quicksort(nums,l,pos-1);
//            quicksort(nums,pos+1,r);
//        }
//    }
//    public int truepos(int[] nums,int l,int r){
//        int i = new Random().nextInt(r-l+1)+l;
//        swap(nums,i,r);
//        return partition(nums,l,r);
//    }
//
//    public int partition(int[] nums,int l,int r){
//        int pivot = nums[r];
//        int i = l-1;
//        for(int j=l;j<r;j++){
//            if(nums[j]<pivot){
//                i++;
//                swap(nums,i,j);
//            }
//        }
//        swap(nums,i+1,r);
//        return i+1;
//
//    }
//
//    public void swap(int[] nums,int i,int j){
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}