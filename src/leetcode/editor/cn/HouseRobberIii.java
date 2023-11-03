package leetcode.editor.cn;
import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HouseRobberIii{
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
//    Map<TreeNode,Integer> includecur = new HashMap<TreeNode,Integer>();
//    Map<TreeNode,Integer> nincludecur = new HashMap<TreeNode,Integer>();
    Map<TreeNode,Integer> memo = new HashMap<>();
    public int rob(TreeNode root) {
//        dfs(root);
//        return Math.max(includecur.getOrDefault(root,0),nincludecur.getOrDefault(root,0));
        if(root == null) return 0;
        if(memo.containsKey(root)) return memo.get(root);
        int not_do = rob(root.left)+rob(root.right);
        int doit = root.val + (root.left == null ? 0:rob(root.left.left)+rob(root.left.right))
                +(root.right == null ? 0:rob(root.right.left)+rob(root.right.right));
        int res = Math.max(not_do,doit);
        memo.put(root,res);
        return res;
    }
//    public void dfs(TreeNode node){
//        if(node == null) return;
//        dfs(node.left);
//        dfs(node.right);
//        includecur.put(node,node.val+nincludecur.getOrDefault(node.left,0)+nincludecur.getOrDefault(node.right,0));
//        nincludecur.put(node,Math.max(includecur.getOrDefault(node.left,0),nincludecur.getOrDefault(node.left,0))+Math.max(includecur.getOrDefault(node.right,0),nincludecur.getOrDefault(node.right,0)));
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}