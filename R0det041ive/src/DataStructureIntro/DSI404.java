package DataStructureIntro;

import java.util.Arrays;

public class DSI404 {
    /**
     * @program: R0det041ive
     * @description: 左叶子之和
     * @author: Log1c
     * @create: 2021-12-29 02:59
     **/

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root==null) return 0;
        if(isLeaf(root.left)) return root.left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    private static boolean isLeaf(TreeNode node){
        if (node==null) return false;
        return node.left==null && node.right==null;
    }


    public static void main(String[] args) {
        int[] tree = {3,9,20,0,0,15,7};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(sumOfLeftLeaves(root));
    }
}
