package leetcode.editor.cn;
public class ContainerWithMostWater{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int l = 0,r = height.length-1,ans = 0;
        while(l<r){
            int maxarea = Math.min(height[l],height[r])*(r-l);
            ans = Math.max(maxarea,ans);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}