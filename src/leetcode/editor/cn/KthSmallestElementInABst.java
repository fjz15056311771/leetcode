package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class KthSmallestElementInABst{
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
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        find(root,k);
        return res;
    }
    int rank=0;
    public void find(TreeNode root,int k){
        if(root == null){
            return;
        }
        find(root.left,k);
        rank++;
        if(rank == k){
            res = root.val;
            return;
        }
        find(root.right,k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}