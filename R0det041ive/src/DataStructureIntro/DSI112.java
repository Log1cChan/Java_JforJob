package DataStructureIntro;

public class DSI112 {
    /**
     * @program: R0det041ive
     * @description: 路径总和
     * @author: Log1c
     * @create: 2021-12-28 20:18
     **/

    private static boolean hasSum = false;
    private static int sum = 0;

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null) return hasSum;
        sum+=root.val;
        if (sum==targetSum && root.left==null && root.right==null){
            hasSum = true;
        }
        hasPathSum(root.left, targetSum);
        hasPathSum(root.right, targetSum);
        sum-=root.val;
        return hasSum;
    }

    public static void main(String[] args) {
        int[] tree = {1,2,3};
        int target = 5;
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(hasPathSum(root, target));
    }
}
