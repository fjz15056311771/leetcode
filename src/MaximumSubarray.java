//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//子数组 是数组中的一个连续部分。
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。

//输入：nums = [1]
//输出：1

//输入：nums = [5,4,-1,7,8]
//输出：23

public class MaximumSubarray {
    public static int solution(int [] nums){
        int res = nums[0];
        int curMax = 0;
        for(int i: nums){
            curMax = Math.max(curMax+i,i);
            res = Math.max(curMax,res);
        }
        return res;
    }

    public static void main(String[] args){
        int[] data = {1,-2,3,-4,5,6,7,-1,8,9,-10};
        int result = solution(data);
        System.out.println(result);
    }

}
