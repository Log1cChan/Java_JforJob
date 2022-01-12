package DataStructureIntro;

public class DSI687 {
    /**
     * @program: R0det041ive
     * @description: 最长同值路径
     * @author: Log1c
     * @create: 2022-01-04 17:15
     **/

    private static int path = 0;

    public static int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return path;
    }

    private static int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int leftPath = root.left != null && root.left.val == root.val ? left+1 : 0;
        int rightPath = root.right != null && root.right.val == root.val ? right+1 : 0;
        path = Math.max(path, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }

    public static void main(String[] args) {
        int[] tree = {5,4,5,1,1,0,5};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(longestUnivaluePath(root));
    }
}
