//给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
//输入: [2,3,-2,4]
//输出: 6
//解释: 子数组 [2,3] 有最大乘积 6。

//输入: [-2,0,-1]
//输出: 0
//解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。

public class MaximumProductSubarray {
    public static int solution(int[] nums){
        int n = nums.length;
        int[] maxDp = new int[n];
        int[] minDp = new int[n];
        int res = nums[0];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        for(int i =1;i<n;i++){
            maxDp[i] = Math.max(Math.max(maxDp[i-1]*nums[i],minDp[i-1]*nums[i]),nums[i]);
            minDp[i] = Math.min(Math.min(minDp[i-1]*nums[i],maxDp[i-1]*nums[i]),nums[i]);
            res = Math.max(maxDp[i],res);
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {5,6,-3,4,-3};
        System.out.println(solution(nums));
    }
}
