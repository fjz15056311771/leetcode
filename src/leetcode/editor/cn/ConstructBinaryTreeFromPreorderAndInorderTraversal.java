package leetcode.editor.cn;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal{
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
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        int n = preorder.length;
//        for(int i=0;i<n;i++){
//            map.put(inorder[i],i);
//        }
//        return build(preorder,inorder,0,n-1,0,n-1);
        int n = preorder.length;
        return build(preorder,inorder,0,n-1,0,n-1);
    }
    public TreeNode build(int[] preorder,int[]inorder,int pre_left,int pre_right,int in_left,int in_right){
//        if(pre_left>pre_right){
//            return null;
//        }
//        int preroot = pre_left;
//        int inroot = map.get(preorder[preroot]);
//        int left_size = inroot-in_left;
//        TreeNode root = new TreeNode(preorder[pre_left]);
//        root.left = build(preorder,inorder,pre_left+1,pre_left+left_size,in_left,inroot-1);
//        root.right = build(preorder,inorder,pre_left+left_size+1,pre_right,inroot+1,in_right);
//        return root;
//        if(pre_left>pre_right){
//            return null;
//        }
//        TreeNode root = new TreeNode(preorder[pre_left]);
//        int preroot = pre_left;
//        int inroot = map.get(preorder[pre_left]);
//        int size = inroot-in_left;
//        root.left = build(preorder,inorder,pre_left+1,pre_left+size,in_left,inroot-1);
//        root.right = build(preorder,inorder,pre_left+size+1,pre_right,inroot+1,in_right);
//        return root;
        if(pre_right<pre_left) return null;
        int rootval = preorder[pre_left];
        int index = -1;

        for(int i=in_left;i<=in_right;i++){
            if(inorder[i]==rootval){
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootval);
        int size = index-in_left;
        root.left = build(preorder,inorder,pre_left+1,pre_left+size,in_left,index-1);
        root.right = build(preorder,inorder,pre_left+size+1,pre_right,index+1,in_right);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}