package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i=0;i<nums.length;i++){
//            if(map.containsKey(target-nums[i])){
//                return new int[]{map.get(target-nums[i]),i};
//            }
//            map.put(nums[i],i);
//        }
//        return new int[]{0};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}