package DataStructureIntro;

public class DSI104 {
    /**
     * @program: R0det041ive
     * @description: 二叉树的最大深度
     * @author: Log1c
     * @create: 2021-12-28 17:17
     **/

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 1;
        depth += Math.max(maxDepth(root.left), maxDepth(root.right));
        return depth;
    }

    public static void main(String[] args) {
        int [] tree = {3,9,20, 0, 0, 15, 7};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(maxDepth(root));
    }
}
