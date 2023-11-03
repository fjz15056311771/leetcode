package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class FindTheDuplicateNumber{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int left=1,right=n-1;
        while(left<right){
            int cnt = 0;
            int mid = (left+right)/2;
            for(int num:nums){
                if(num<=mid){
                    cnt+=1;
                }
            }
            if(cnt>mid){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}