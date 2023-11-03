package leetcode.editor.cn;
import java.util.*;

public class BinaryTreeLevelOrderTraversal{
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
    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        if(root != null){
//            queue.add(root);
//        }
//
//        while(!queue.isEmpty()){
//            List<Integer> level = new ArrayList<>();
//            int n = queue.size();
//            for(int i=0;i<n;i++){
//                TreeNode node = queue.poll();
//                level.add(node.val);
//                if(node.left != null){
//                    queue.add(node.left);
//                }
//                if(node.right != null){
//                    queue.add(node.right);
//                }
//            }
//            res.add(level);
//        }
//        return res;

//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        if(root != null){
//            queue.add(root);
//        }
//        while(!queue.isEmpty()){
//            int n = queue.size();
//            List<Integer> level = new ArrayList<>();
//            for(int i=0;i<n;i++){
//                TreeNode node = queue.poll();
//                level.add(node.val);
//                if(node.left!=null){
//                    queue.add(node.left);
//                }
//                if(node.right!=null){
//                    queue.add(node.right);
//                }
//            }
//            res.add(level);
//        }
//        return res;
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}