package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SearchA2dMatrixIi{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*for(int[] row:matrix){
            int index = search(row,target);
            if(index>=0) return true;
        }
        return false;*/
        int m=matrix.length,n=matrix[0].length;
        int x=0,y=n-1;
        while(x<m&&y>=0){
            if(matrix[x][y]==target) return true;
            if(matrix[x][y]>target){
                y--;
            }else{
                x++;
            }
        }
        return false;
    }
    /*public int search(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}