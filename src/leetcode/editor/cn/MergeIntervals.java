package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class MergeIntervals{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
//        List<int[]> merge = new ArrayList<int[]>();
//        int n = intervals.length;
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0];
//            }
//        });
//        for(int i=0;i<n;i++){
//            int L = intervals[i][0],R = intervals[i][1];
//            if(merge.size()==0 || merge.get(merge.size()-1)[1]<L){
//                merge.add(new int[]{L,R});
//            }else{
//                merge.get(merge.size()-1)[1] = Math.max(merge.get(merge.size()-1)[1],R);
//            }
//        }
//        return merge.toArray(new int[merge.size()][]);
        List<int[]> merge = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i=0;i<n;i++){
            if(i==0){
                merge.add(intervals[i]);
            }else{
                if(intervals[i][0]>merge.get(merge.size()-1)[1]){
                    merge.add(intervals[i]);
                }else{
                    int L = merge.get(merge.size()-1)[0];
                    int R = Math.max(intervals[i][1],merge.get(merge.size()-1)[1]);
                    merge.get(merge.size()-1)[1] = R;
                }
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}