package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> edgs = new ArrayList<List<Integer>>();
    int[] indeg;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        indeg = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            edgs.add(new ArrayList<Integer>());
        }
        for(int[] info : prerequisites){
            edgs.get(info[1]).add(info[0]);
            ++indeg[info[0]];
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                queue.add(i);
            }
        }
        int visited=0;
        while(!queue.isEmpty()){
            ++visited;
            int u = queue.poll();
            for(int v : edgs.get(u)){
                --indeg[v];
                if(indeg[v]==0){
                    queue.add(v);
                }
            }
        }
        return visited==numCourses;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}