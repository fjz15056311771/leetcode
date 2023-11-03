package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees{
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
    Map<String,Integer> map = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        String serString = findsametree(root);
        return res;
    }
    public String findsametree(TreeNode root){
        if(root == null){
            return "#";
        }
        String left = findsametree(root.left);
        String right = findsametree(root.right);
        String myself = left + "," + right + "," + String.valueOf(root.val);
        int freq = map.getOrDefault(myself,0);
        if(freq == 1){
            res.add(root);
        }
        map.put(myself,freq+1);
        return myself;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}