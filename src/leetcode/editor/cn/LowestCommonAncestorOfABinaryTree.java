package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class LowestCommonAncestorOfABinaryTree{
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(contain(root.left,p)&&contain(root.left,q)) return lowestCommonAncestor(root.left,p,q);
//        if(contain(root.right,p)&&contain(root.right,q)) return lowestCommonAncestor(root.right,p,q);
//        return root;
        return find(root,p,q);
    }
    public TreeNode find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        TreeNode left = find(root.left,p,q);
        TreeNode right = find(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        return left==null?right:left;
    }

//    public boolean contain(TreeNode root, TreeNode cur){
//        if(root == null){
//            return false;
//        }
//        if(root == cur){
//            return true;
//        }
//        return contain(root.left,cur) || contain(root.right,cur);
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}