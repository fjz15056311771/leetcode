package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for(int num : nums){
//            set.add(num);
//        }
//        int longest = 0;
//        for(int num : nums){
//            if(!set.contains(num-1)){
//                int currentnum = num;
//                int currentlong = 1;
//                while(set.contains(currentnum+1)){
//                    currentnum += 1;
//                    currentlong += 1;
//                }
//                longest = Math.max(longest,currentlong);
//            }
//        }
//        return longest;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int i=0;i<nums.length;i++){
            int tmp = 0;
            int index = nums[i];
            if(!set.contains(nums[i]-1)){
                while(set.contains(index)){
                    index++;
                    tmp++;
                }
            }
            longest = Math.max(longest,tmp);
        }
        return longest;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}