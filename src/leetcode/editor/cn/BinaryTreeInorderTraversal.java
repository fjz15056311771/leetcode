package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class BinaryTreeInorderTraversal{
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

    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<Integer>();
//        if(root == null) return result;
//        inOrder(result,root);
//        return result;
        List<Integer> results = new ArrayList<>();
        if(root == null) return results;
        inOrder(results,root);
        return results;
    }
    public void inOrder(List<Integer> result,TreeNode root){
//        if(root==null) return;
//        inOrder(result,root.left);
//        result.add(root.val);
//        inOrder(result,root.right);
        if(root == null){
            return;
        }
        inOrder(result,root.left);
        result.add(root.val);
        inOrder(result,root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}