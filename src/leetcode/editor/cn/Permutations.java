package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> results = new ArrayList<List<Integer>>();
//        List<Integer> result = new ArrayList<Integer>();
//        boolean[] used = new boolean[nums.length];
//        back(results,result,nums,used,0);
//        for(int num:nums){
//            result.add(num);
//        }
//        back(results,result,nums);
//        return results;

        boolean[] used = new boolean[nums.length];
        List<Integer> result = new ArrayList<>();
        backtrace(nums,used,result);
        return results;


    }
    public void backtrace(int[] nums,boolean[] used,List<Integer> result){
        if(result.size()== nums.length){
            results.add(new ArrayList<>(result));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(used[i] == true){
                continue;
            }
            result.add(nums[i]);
            used[i] = true;
            backtrace(nums,used,result);
            used[i] = false;
            result.remove(result.size()-1);
        }
    }

//    public void back(List<List<Integer>> results,List<Integer> result,int[] nums){
//        if(index==nums.length){
//            results.add(new ArrayList<>(result));
//            return;
//        }
//        for(int i=0;i<nums.length;i++){
//            if(!used[i]){
//                result.add(nums[i]);
//                used[i] = true;
//                back(results,result,nums,used,index+1);
//                used[i] = false;
//                result.remove(result.size()-1);
//            }
//        }

//        if(index == result.size()){
//            results.add(new ArrayList<>(result));
//            return;
//        }
//        for(int i = index;i<result.size();i++){
//            Collections.swap(result,index,i);
//            back(results,result,index+1);
//            Collections.swap(result,index,i);
//        }
//        if(result.size() == nums.length){
//            results.add(new ArrayList<>(result));
//            return;
//        }
//        for(int i=0;i<nums.length;i++){
//            if(result.contains(nums[i])) continue;
//            result.add(nums[i]);
//            back(results,result,nums);
//            result.remove(result.size()-1);
//        }
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}