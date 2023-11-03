package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int random(Random rand,int min,int max){
        return rand.nextInt(max-min)+min;
    }
    public int countnum(int[] nums,int candi){
        int count=0;
        for(int num:nums){
            if(num==candi){
                count++;
            }
        }
        return count;
    }
    public int majorityElement(int[] nums) {
        Random rand = new Random();
        int half = nums.length/2;
        while(true){
            int candi = nums[random(rand,0,nums.length)];
            if(countnum(nums,candi)>half){
                return candi;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}