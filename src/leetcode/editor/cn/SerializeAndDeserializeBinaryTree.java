package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class SerializeAndDeserializeBinaryTree{
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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root,sb);
        return sb.toString();
    }

    public void traverse(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("#").append(",");
            return;
        }
        sb.append(String.valueOf(root.val)).append(",");
        traverse(root.left,sb);
        traverse(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> node = new LinkedList<>();
        for(String c : data.split(",")){
            node.add(c);
        }
        return traverse2(node);
    }
    public TreeNode traverse2(LinkedList<String> node){
        if(node.isEmpty()) return null;
        String s = node.removeFirst();
        if(s.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = traverse2(node);
        root.right = traverse2(node);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}