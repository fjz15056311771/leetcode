package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class FlattenBinaryTreeToLinkedList{
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
    public void flatten(TreeNode root) {
//        List<TreeNode> list = new ArrayList<>();
//        preorder(root,list);
//        for(int i=1;i<list.size();i++){
//            TreeNode pre = list.get(i-1),cur = list.get(i);
//            pre.left = null;
//            pre.right = cur;
//        }
//        List<TreeNode> list = new ArrayList<>();
//        preorder(root,list);
//        for(int i=1;i<list.size();i++){
//            TreeNode cur = list.get(i);
//            TreeNode pre = list.get(i-1);
//            pre.left = null;
//            pre.right = cur;
//        }
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;
        TreeNode p = root;
        while(p.right!=null){
            p = p.right;
        }
        p.right = right;


    }

    public void preorder(TreeNode node,List<TreeNode> list){
//        if(node != null){
//            list.add(node);
//            preorder(node.left,list);
//            preorder(node.right,list);
//        }
        if(node == null) return;
        list.add(node);
        preorder(node.left,list);
        preorder(node.right,list);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}