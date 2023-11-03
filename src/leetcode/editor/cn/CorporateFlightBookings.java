package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class CorporateFlightBookings{
//leetcode submit region begin(Prohibit modification and deletion)
class Difference{
    int[] diff;
    public Difference(int[] nums){
        diff = new int[nums.length];
        diff[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            diff[i] = nums[i]-nums[i-1];
        }
    }
    public void increment(int i, int j, int val){
        diff[i] += val;
        if(j+1<diff.length) diff[j+1] -= val;
    }

    public int[] result(){
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for(int i=1;i<diff.length;i++){
            res[i] = res[i-1] + diff[i];
        }
        return res;
    }
}
class Solution {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        Difference df = new Difference(res);
        for(int[] book:bookings){
            int i = book[0]-1;
            int j = book[1]-1;
            int val = book[2];
            df.increment(i,j,val);
        }
        return df.result();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}