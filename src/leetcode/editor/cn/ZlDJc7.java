package leetcode.editor.cn;
import java.util.*;

public class ZlDJc7{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String plusone(String s,int pos){
        char[] arr = s.toCharArray();
        if(arr[pos] == '9'){
            arr[pos] = '0';
        }else{
            arr[pos] += 1;
        }
        return new String(arr);
    }
    public String minus(String s,int pos){
        char[] arr = s.toCharArray();
        if(arr[pos] == '0'){
            arr[pos] = '9';
        }else{
            arr[pos] -= 1;
        }
        return new String(arr);
    }
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        HashSet<String> dead = new HashSet<>();
        queue.offer("0000");
        visited.add("0000");
        for(String i : deadends){
            dead.add(i);
        }
        int step = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                String cur = queue.poll();
                if(cur.equals(target)) return step;
                if(dead.contains(cur)) continue;
                for(int j=0;j<4;j++){
                    String up = plusone(cur,j);
                    if(!visited.contains(up)){
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down = minus(cur,j);
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