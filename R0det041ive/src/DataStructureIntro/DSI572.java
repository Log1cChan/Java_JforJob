package DataStructureIntro;

public class DSI572 {
    /**
     * @program: R0det041ive
     * @description: 另一棵树的子树
     * @author: Log1c
     * @create: 2021-12-29 01:57
     **/
    
    
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        return isSubtreeWithRoot(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean isSubtreeWithRoot(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;
        return  isSubtreeWithRoot(root.left, subRoot.left)&&isSubtreeWithRoot(root.right, subRoot.right);
    }

    public static void main(String[] args) {
        int[] tree = {3,4,5,1,2};
        int[] subTree = {4,1,2};

        TreeNode root = new TreeNode(tree[0]);
        TreeNode subRoot = new TreeNode(subTree[0]);

        root = root.createTree(tree);
        subRoot = subRoot.createTree(subTree);

        System.out.println(isSubtree(root, subRoot));
    }
}
