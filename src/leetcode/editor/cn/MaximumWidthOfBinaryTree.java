package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumWidthOfBinaryTree{
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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int w = 0,maxw = 0;
        while(!queue.isEmpty()){
            w = queue.size();
            maxw = Math.max(maxw,queue.getLast().val-queue.getFirst().val+1);
            while(w>0){
                --w;
                TreeNode node = queue.poll();
                if(node.left != null){
                    node.left.val = node.val*2+1;
                    queue.add(node.left);
                }
                if(node.right != null){
                    node.right.val = node.val*2+2;
                    queue.add(node.right);
                }

            }
        }
        return maxw;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}