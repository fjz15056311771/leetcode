package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class BalancedBinaryTree{
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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }else{
            return Math.abs(maxh(root.left)-maxh(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
        }

    }
    public int maxh(TreeNode root){
        if(root==null){
            return 0;
        }else{
            return Math.max(maxh(root.left),maxh(root.right))+1;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}