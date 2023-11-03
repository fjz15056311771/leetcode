package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class SearchInABinarySearchTree{
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
    public TreeNode searchBST(TreeNode root, int val) {
//        if(root == null) return null;
//        if(root.val == val) return root;
//        TreeNode left = null;
//        TreeNode right = null;
//        if(root.val>=val){
//            left = searchBST(root.left,val);
//        }else{
//            right = searchBST(root.right,val);
//        }
//        return left==null?right:left;
        if(root==null) return null;
        if(root.val>val){
            return searchBST(root.left,val);
        }
        if(root.val<val){
            return searchBST(root.right,val);
        }
        return root;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}