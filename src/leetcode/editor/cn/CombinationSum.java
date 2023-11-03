package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> track = new ArrayList<Integer>();
    int sum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrace(candidates,target,0);
        return res;
    }
    public void backtrace(int[] candidates,int target,int index){
        if(sum == target){
            res.add(new ArrayList<>(track));
            return;
        }
        if(sum>target) return;
        for(int i=index;i<candidates.length;i++){
            sum += candidates[i];
            track.add(candidates[i]);
            backtrace(candidates,target,i);
            track.remove(track.size()-1);
            sum -= candidates[i];
        }
    }
//    public void dfs(int[] candidates,int target,List<List<Integer>> results,List<Integer> result,int index){
//        if(candidates.length==index) return;
//        if(target==0){
//            results.add(new ArrayList<>(result));
//            return;
//        }
//        dfs(candidates,target,results,result,index+1);
//        if(target-candidates[index]>=0){
//            result.add(candidates[index]);
//            dfs(candidates,target-candidates[index],results,result,index);
//            result.remove(result.size()-1);
//        }
//        if(index == candidates.length) return;
//        if(target == 0){
//            results.add(new ArrayList<>(result));
//            return;
//        }
//
//        if(target-candidates[index]>=0){
//            result.add(candidates[index]);
//            dfs(candidates,target-candidates[index],results,result,index);
//            result.remove(result.size()-1);
//        }
//        dfs(candidates,target,results,result,index+1);
//
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}