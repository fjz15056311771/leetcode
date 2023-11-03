package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class DeleteNodeInABst{
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val==key){
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            if(root.left!=null && root.right!=null){
                TreeNode min = getmin(root.right);
                root.val = min.val;
                root.right = deleteNode(root.right,min.val);
            }

        }
        if(root.val<key) root.right = deleteNode(root.right,key);
        if(root.val>key) root.left = deleteNode(root.left,key);
        return root;

    }
    public TreeNode getmin(TreeNode root){
        while (root.left!=null) root=root.left;
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}