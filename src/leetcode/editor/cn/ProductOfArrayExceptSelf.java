package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ProductOfArrayExceptSelf{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        int R = 1;
        for(int j=n-1;j>=0;j--){
            ans[j] = ans[j] * R;
            R = R * nums[j];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}