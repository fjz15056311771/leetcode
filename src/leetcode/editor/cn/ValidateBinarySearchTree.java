package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ValidateBinarySearchTree{
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
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
//        return isvalid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        if(root == null) return true;
        boolean l = isValidBST(root.left);
        int cur = root.val;
        if(cur<=pre){
            return false;
        }
        pre = cur;
        boolean r = isValidBST(root.right);
        return l&&r;

    }
//    public boolean isvalid(TreeNode node){
//        if(node == null){
//            return true;
//        }
//        if(node.val<=lower || node.val>=upper){
//            return false;
//        }
//        return isvalid(node.left,lower,node.val) && isvalid(node.right,node.val,upper);
//        if(node == null ) return true;
//        boolean l = isvalid(node.left);
//        int cur = node.val;
//        if(cur<=pre) return false;
//        pre = cur;
//
//        boolean r = isvalid(node.right);
//        return l&&r;

//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}