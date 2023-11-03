package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal{
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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        return build(preorder,postorder,0,n-1,0,n-1);

    }
    public TreeNode build(int[] preorder,int[] postorder,int pre_start,int pre_end,int post_start,int post_end){
        if(pre_start>pre_end) return null;
        if(pre_start==pre_end) return new TreeNode(preorder[pre_start]);
        int rootval = preorder[pre_start];
        int rootleft = preorder[pre_start+1];
        int index = -1;
        TreeNode root = new TreeNode(rootval);
        for(int i=post_start;i<=post_end;i++){
            if(postorder[i] == rootleft){
                index = i;
                break;
            }
        }
        int size = index-post_start;
        root.left = build(preorder,postorder,pre_start+1,pre_start+size+1,post_start,index);
        root.right = build(preorder,postorder,pre_start+size+2,pre_end,index+1,post_end-1);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}