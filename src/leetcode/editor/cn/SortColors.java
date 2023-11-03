package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SortColors{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
//        int n = nums.length;
//        int point = 0;
//        for(int i=0; i<n; i++){
//            if(nums[i]==0){
//                int tmp = nums[i];
//                nums[i] = nums[point];
//                nums[point] = tmp;
//                point++;
//            }
//        }
//        for(int i=0; i<n; i++){
//            if(nums[i]==1){
//                int tmp = nums[i];
//                nums[i] = nums[point];
//                nums[point] = tmp;
//                point++;
//            }
//        }
        int n = nums.length;
        int p = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                swap(nums,i,p);
                p++;
            }
        }
        for (int j=p;j<n;j++){
            if(nums[j] == 1){
                swap(nums,j,p);
                p++;
            }
        }

    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}