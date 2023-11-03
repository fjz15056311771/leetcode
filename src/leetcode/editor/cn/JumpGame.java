package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class JumpGame{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
//        int maxhop = 0;
//        for(int i=0;i<nums.length;i++){
//            if(i<=maxhop){
//                maxhop = Math.max(maxhop,i+nums[i]);
//                if(maxhop>=nums.length-1){
//                    return true;
//                }
//            }
//        }
//        return false;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i<=max){
                max = Math.max(i+nums[i],max);
                if(max>= nums.length-1){
                    return true;
                }
            }
        }
        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}