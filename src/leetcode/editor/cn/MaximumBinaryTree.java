package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class MaximumBinaryTree{
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);

    }
    public TreeNode build(int[] nums,int left,int right){
        if(right<left) return null;
        int maxval = Integer.MIN_VALUE;
        int index = -1;
        for(int i=left;i<=right;i++){
            if(nums[i]>maxval){
                maxval = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(maxval);
        root.left = build(nums,left,index-1);
        root.right = build(nums,index+1,right);
        return root;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}