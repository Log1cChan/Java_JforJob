package DataStructureIntro;

public class DSI543 {
    /**
     * @program: R0det041ive
     * @description: 二叉树的直径
     * @author: Log1c
     * @create: 2021-12-28 19:16
     **/

    private static int max = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(left+right, max);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        int[] tree = {1,2};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);

        System.out.println(diameterOfBinaryTree(root));
    }
}
