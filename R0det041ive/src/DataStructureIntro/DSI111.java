package DataStructureIntro;

public class DSI111 {
    /**
     * @program: R0det041ive
     * @description: 二叉树的最小深度
     * @author: Log1c
     * @create: 2021-12-29 02:45
     **/

    private static int min = Integer.MAX_VALUE;

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null) return 1+minDepth(root.right);
        if(root.right == null) return 1+minDepth(root.left);

        return Math.min(1+minDepth(root.left), 1+minDepth(root.right));
    }

    public static void main(String[] args) {
        int[] tree = {2,0,3,0,4,0,5,0,6};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(minDepth(root));
    }
}
