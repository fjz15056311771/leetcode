package leetcode.editor.cn;
import java.util.*;

public class TopKFrequentElements{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<int[]> list = new ArrayList<int[]>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int num=e.getKey(),count=e.getValue();
            list.add(new int[]{num,count});
        }
        int[] res = new int[k];
        qsort(list,0,list.size()-1,res,0,k);
        return res;
    }
    public void qsort(List<int[]> nums,int start,int end,int[] res,int t,int k){
        int rand = (int)Math.random()*(end-start+1)+start;
        Collections.swap(nums,start,rand);
        int p = nums.get(start)[1];
        int index = start;
        for(int i=start+1;i<=end;i++){
            if(nums.get(i)[1]>=p){
                Collections.swap(nums,index+1,i);
                index++;
            }
        }
        Collections.swap(nums,index,start);
        if(index-start>=k){
            qsort(nums,start,index-1,res,t,k);
        }else{
            for(int i=start;i<=index;i++){
                res[t++] = nums.get(i)[0];
            }
            if(k>index-start+1){
                qsort(nums,index+1,end,res,t,k-(index-start+1));
            }
        }

    }


}
//leetcode submit region end(Prohibit modification and deletion)

}