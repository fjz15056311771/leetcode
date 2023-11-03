package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ConstructBinaryTreeFromInorderAndPostorderTraversal{
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return built(inorder,postorder,0,n-1,0,n-1);

    }
    public TreeNode built(int[] inoder,int[] postorder,int in_start,int in_end,int post_start,int post_end){
        if(in_end<in_start) return null;
        int rootval = postorder[post_end];
        int index = -1;
        for(int i=in_start;i<=in_end;i++){
            if(inoder[i]==rootval){
                index = i;
                break;
            }
        }
        int size = index-in_start;
        TreeNode root = new TreeNode(rootval);
        root.left = built(inoder,postorder,in_start,index-1,post_start,post_start+size-1);
        root.right = built(inoder,postorder,index+1,in_end,post_start+size,post_end-1);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}