package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ConvertBstToGreaterTree{
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
    public TreeNode convertBST(TreeNode root) {
        trans(root);
        return root;

    }
    int sum = 0;
    public void trans(TreeNode root){
        if(root == null){
            return;
        }
        trans(root.right);
        sum += root.val;
        root.val = sum;
        trans(root.left);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}