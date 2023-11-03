package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ErChaShuDeShenDuLcof{
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxleft=maxDepth(root.left);
        int maxright=maxDepth(root.right);
        return Math.max(maxleft,maxright)+1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}