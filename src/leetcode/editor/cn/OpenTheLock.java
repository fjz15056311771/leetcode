package leetcode.editor.cn;
import java.util.*;

public class OpenTheLock{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    String plusone(String s,int i){
        char[] arr = s.toCharArray();
        if(arr[i] == '9'){
            arr[i] = '0';
        }else{
            arr[i] += 1;
        }
        return new String(arr);
    }
    String minusone(String s,int i){
        char[] arr = s.toCharArray();
        if(arr[i] == '0'){
            arr[i] = '9';
        }else{
            arr[i] -= 1;
        }
        return new String(arr);
    }

    public int openLock(String[] deadends, String target) {
        HashSet<String> dead = new HashSet<>();
        for(String i : deadends){
            dead.add(i);
        }
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        visited.add("0000");
        int step = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                String cur = queue.poll();
                if(dead.contains(cur)) continue;
                if(cur.equals(target)) return step;
                for (int j=0;j<4;j++){
                    String up = plusone(cur,j);
                    if(!visited.contains(up)){
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down = minusone(cur,j);
                    if(!visited.contains(down)){
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            step++;
        }
        return -1;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}