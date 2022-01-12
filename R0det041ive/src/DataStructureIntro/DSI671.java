package DataStructureIntro;

public class DSI671 {
    /**
     * @program: R0det041ive
     * @description: 二叉树中第二小的节点
     * @author: Log1c
     * @create: 2022-01-04 19:35
     **/

    public static int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if(root.left == null && root.right == null) return -1;
        int left = root.left.val;
        int right = root.right.val;
        if(left == root.val) left = findSecondMinimumValue(root.left);
        if(right == root.val) right = findSecondMinimumValue(root.right);
        if(left != -1 && right != -1) return Math.min(left, right);
        if(left !=-1) return left;
        return right;
    }

    public static void main(String[] args) {
        int[] tree = {1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(findSecondMinimumValue(root));
    }
}
