package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
public class BinaryTreeZigzagLevelOrderTraversal{
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList();
        boolean flag = true;
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int n = queue.size();
            Deque<Integer> level = new LinkedList<>();
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                if(flag){
                    level.offerLast(node.val);
                }else{
                    level.offerFirst(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            flag = !flag;
            res.add(new LinkedList<Integer>(level));
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}