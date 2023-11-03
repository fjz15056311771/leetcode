package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class DiameterOfBinaryTree{
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
class Solution{
    int ans = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans-1;
    }
    public int depth(TreeNode node){
//        if(node==null){
//            return 0;
//        }
//        int L = depth(node.left);
//        int R = depth(node.right);
//        ans = Math.max(ans,L+R+1);
//        return Math.max(L,R)+1;
        if(node==null){
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        ans = Math.max(ans,left+right+1);
        return Math.max(left,right)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}