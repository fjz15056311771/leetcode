//给定一个二叉树，检查它是否是镜像对称的。
//例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的。

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SymmetricTree {
    public static boolean solution(TreeNode root){
        return checksam(root,root);
    }

    public static boolean checksam(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val==q.val && checksam(p.left,q.right) && checksam(p.right,q.left);
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(2,a,b);
        TreeNode f = new TreeNode(2,c,d);
        TreeNode root = new TreeNode(1,e,f);
        System.out.println(solution(root));

    }
}
