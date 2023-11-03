package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class OneFGaJU{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> twoSum(int[] nums,int start,int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int L = start,R = nums.length-1;
        while(L<R){
            int left = nums[L],right = nums[R];
            int sum = nums[L] + nums[R];
            if(sum<target){
                while(L<R && nums[L]==left) L++;
            }else if(sum>target){
                while(L<R && nums[R]==right) R--;
            }else if(sum == target){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(left);
                tmp.add(right);
                res.add(tmp);
                while(L<R && nums[L]==left) L++;
                while(L<R && nums[R]==right) R--;
            }
        }
        return res;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            List<List<Integer>> twores = twoSum(nums,i+1,-nums[i]);
            for(int j=0; j<twores.size(); j++){
                twores.get(j).add(nums[i]);
                res.add(twores.get(j));
            }
            while(i+1<nums.length && nums[i]==nums[i+1]) i++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}