//给定一个二叉树，找出其最大深度
//二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//说明:叶子节点是指没有子节点的节点。
//示例：
//给定二叉树 [3,9,20,null,null,15,7]，返回它的最大深度 3


public class MaximumDepthofBinarTree {
    public static int solution(TreeNode root){
        if(root==null){
            return 0;
        }else{
            int maxleft = solution(root.left);
            int maxright = solution(root.right);
            return Math.max(maxleft,maxright)+1;
        }
    }
    public static void main(String[] args){
        TreeNode a = null;
        TreeNode b = null;
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        TreeNode e = new TreeNode(9,a,b);
        TreeNode f = new TreeNode(20,c,d);
        TreeNode root = new TreeNode(3,e,f);
        System.out.println(solution(root));
    }
}
