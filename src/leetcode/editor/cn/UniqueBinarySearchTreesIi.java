package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class UniqueBinarySearchTreesIi{
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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return null;
        return build(1,n);
    }
    List<TreeNode> build(int lo,int lh){
        List<TreeNode> res = new LinkedList<>();
        if(lo>lh){
            res.add(null);
            return res;
        }
        for(int i=lo;i<=lh;++i){
            List<TreeNode> left = build(lo,i-1);
            List<TreeNode> right = build(i+1,lh);
            for(TreeNode nodel : left){
                for(TreeNode noder : right){
                    TreeNode root = new TreeNode(i);
                    root.left = nodel;
                    root.right = noder;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}