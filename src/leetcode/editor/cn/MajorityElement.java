package leetcode.editor.cn;

import java.util.Random;

public class MajorityElement{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    private int randomNum(Random rand, int min, int max){
//        return rand.nextInt(max-min)+min;
//    }
    private int rand(Random random,int min,int max){
        return random.nextInt(max-min)+min;
    }
//    private int countCadidate(int[] nums,int n){
//        int count=0;
//        for(int i:nums){
//            if(i==n) count++;
//        }
//        return count;
//    }
    private int counter(int[] nums,int cadi){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==cadi) count++;
        }
        return count;
    }
    public int majorityElement(int[] nums) {
//        Random rand = new Random();
//        while(true){
//            int cadidate = nums[randomNum(rand,0,nums.length)];
//            int count = countCadidate(nums,cadidate);
//            if(count>nums.length/2) return cadidate;
//        }
        Random random = new Random();
        int halflen = nums.length/2;
        while(true){
            int cadi = nums[rand(random,0,nums.length)];
            int count = counter(nums,cadi);
            if(count>halflen) return cadi;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}