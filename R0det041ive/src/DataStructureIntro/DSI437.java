package DataStructureIntro;

public class DSI437 {
    /**
     * @program: R0det041ive
     * @description: 路径总和III
     * @author: Log1c
     * @create: 2021-12-29 01:36
     **/


    public static int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int res = sumOfPath(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        return res;
    }

    private static int sumOfPath(TreeNode root, int targetSum){
        if(root==null) return 0;
        int res = 0;
        if(root.val == targetSum) res++;
        res += sumOfPath(root.left, targetSum-root.val) + sumOfPath(root.right, targetSum-root.val);
        return res;
    }

    public static void main(String[] args) {
        int[] tree = {10,5,-3,3,2,0,11,3,-2,0,1};
        int targetSum = 8;
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(pathSum(root, targetSum));
    }

}
