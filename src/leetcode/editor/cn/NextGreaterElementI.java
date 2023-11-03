package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class NextGreaterElementI{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res2 = generate(nums2);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums2.length;i++){
            map.put(nums2[i],res2[i]);
        }
        int[] res1 = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res1[i] = map.get(nums1[i]);
        }
        return res1;

    }

    public int[] generate(int[] nums){
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=nums[i]){
                s.pop();
            }
            res[i] = s.isEmpty()?-1:s.peek();
            s.push(nums[i]);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}