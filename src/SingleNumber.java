//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//输入: [2,2,1] 输出: 1
//输入: [4,1,2,1,2] 输出: 4

public class SingleNumber {
    public static int solution(int[] nums){
        int singlenum = 0;
        for(int num:nums){
            singlenum ^= num;
        }
        return singlenum;
    }
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.println(solution(nums));
    }
}
