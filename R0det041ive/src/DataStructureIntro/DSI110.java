package DataStructureIntro;

public class DSI110 {
    /**
     * @program: R0det041ive
     * @description: 平衡二叉树
     * @author: Log1c
     * @create: 2021-12-28 18:44
     **/

    private static boolean res = true;

    public static boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return res;
    }

    public static int maxDepth(TreeNode root){
        if (root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(Math.abs(left - right)>1) res = false;
        return 1+ Math.max(left, right);
    }

    public static void main(String[] args) {
        int[] tree1 = {3,9,20,0,0,15,7};
        int[] tree2 = {1,2,2,3,3,0,0,4,4};

        TreeNode root = new TreeNode(tree2[0]);
        root = root.createTree(tree2);

        System.out.println(isBalanced(root));
    }
}
