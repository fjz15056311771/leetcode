package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class CountCompleteTreeNodes{
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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        TreeNode l = root,r = root;
        int left = 0;
        while(l!=null){
            l = l.left;
            left++;
        }
        int right = 0;
        while(r!=null){
            r = r.right;
            right++;
        }
        if(left==right){
            return (int)Math.pow(2,left)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}