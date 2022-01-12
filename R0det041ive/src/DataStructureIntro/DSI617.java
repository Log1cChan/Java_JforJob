package DataStructureIntro;

public class DSI617 {
    /**
     * @program: R0det041ive
     * @description: 合并二叉树
     * @author: Log1c
     * @create: 2021-12-28 19:36
     **/

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();
        if (root1==null) return root2;
        if (root2==null) return root1;
        root.val = root1.val+root2.val;
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }

    public static void main(String[] args) {
        int[] tree1 = {1,3,2,5};
        int[] tree2 = {2,1,3,0,4,0,7};
        TreeNode root1 = new TreeNode(tree1[0]);
        TreeNode root2 = new TreeNode(tree2[0]);

        root1 = root1.createTree(tree1);
        root2 = root2.createTree(tree2);

        TreeNode root = mergeTrees(root1, root2);
    }
}
