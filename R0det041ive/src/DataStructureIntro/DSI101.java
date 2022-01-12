package DataStructureIntro;

public class DSI101 {
    /**
     * @program: R0det041ive
     * @description: 对称二叉树
     * @author: Log1c
     * @create: 2021-12-29 02:31
     **/

    public static boolean isSymmetric(TreeNode root) {
        return childrenSymmetric(root.left, root.right);
    }

    private static boolean childrenSymmetric(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return childrenSymmetric(left.left, right.right)&&childrenSymmetric(left.right, right.left);
    }

    public static void main(String[] args) {
        int tree[] = {1,3,3,4,3,3,4};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);

        System.out.println(isSymmetric(root));
    }
}
