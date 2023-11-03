package leetcode.editor.cn;
import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfBinaryTree{
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
    public int maxDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }else{
//            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
//        }
//        int res = 0;
//        if(root == null) return res;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            for(int i=0;i<size;i++){
//                TreeNode node = queue.poll();
//                if(node.left!=null){
//                    queue.add(node.left);
//                }
//                if(node.right!=null){
//                    queue.add(node.right);
//                }
//            }
//            res++;
//        }
//        return res;
//        if(root==null){
//            return 0;
//        }
//        int maxleft = maxDepth(root.left);
//        int maxright = maxDepth(root.right);
//        return Math.max(maxleft,maxright)+1;
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}