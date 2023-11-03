package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SquaresOfASortedArray{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length,neg = -1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg = i;
            }else{
                break;
            }
        }
        int i=neg,j=neg+1,index=0;
        int[] ans = new int[n];
        while(i>=0 || j<n){
            if(i<0){
                ans[index] = nums[j]*nums[j];
                j++;
            }else if(j==n){
                ans[index] = nums[i]*nums[i];
                i--;
            }else if(nums[i]*nums[i]>nums[j]*nums[j]){
                ans[index] = nums[j]*nums[j];
                j++;
            }else {
                ans[index] = nums[i]*nums[i];
                i--;
            }
            index++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}