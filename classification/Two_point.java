import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_point {
    //盛最多水的容器
    public int maxArea(int[] height) {
        int l = 0,r = height.length-1,ans = 0;
        while(l<r){
            int maxarea = java.lang.Math.min(height[l],height[r])*(r-l);
            ans = java.lang.Math.max(maxarea,ans);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }

    //三数之和
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int first=0;first<n;first++){
            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }
            int third = n-1,target = -nums[first];
            for(int second=first+1;second<n;second++){
                if(second>first+1&&nums[second]==nums[second-1]){
                    continue;
                }
                while(second<third&&nums[second]+nums[third]>target){
                    third--;
                }
                if(second==third) break;
                if(nums[first]+nums[second]+nums[third]==0){
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[first]);
                    tmp.add(nums[second]);
                    tmp.add(nums[third]);
                    ans.add(tmp);
                }
            }
        }
        return ans;
    }

    //下一个排列
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(j>=0&&nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void reverse(int[] nums,int i){
        int left=i,right=nums.length-1;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    //
}
