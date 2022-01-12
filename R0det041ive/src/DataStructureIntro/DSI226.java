package DataStructureIntro;

public class DSI226 {
    /**
     * @program: R0det041ive
     * @description: 反转二叉树
     * @author: Log1c
     * @create: 2021-12-28 19:26
     **/

    public static TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        int[] tree = {4,2,7,1,3,6,9};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        root = invertTree(root);
    }
}
