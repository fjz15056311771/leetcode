//给定一个整数数组 nums 和一个整数目标值 target，
//请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

import java.util.Arrays;
public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args){
        int[] a ={2,7,11,15};
        int t = 9;
        int[] res = new int[2];
        res = solution(a,t);
        System.out.println(Arrays.toString(res));

    }
}

