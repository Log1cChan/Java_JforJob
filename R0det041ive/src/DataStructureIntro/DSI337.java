package DataStructureIntro;

import java.util.HashMap;
import java.util.Map;

public class DSI337 {
    /**
     * @program: R0det041ive
     * @description: 打家劫舍III
     * @author: Log1c
     * @create: 2022-01-04 17:29
     **/

    private static Map<TreeNode, Integer> cache = new HashMap<>();

    public static int rob(TreeNode root) {
        if(root == null) return 0;
        if(cache.containsKey(root)) return cache.get(root);
        int val1 = root.val;
        if(root.left!=null) val1 += rob(root.left.left) + rob(root.left.right);
        if(root.right!=null) val1 += rob(root.right.left) + rob(root.right.right);
        int val2 = rob(root.left) + rob(root.right);
        int res = Math.max(val1, val2);
        cache.put(root, res);
        return res;
    }


    public static void main(String[] args) {
        int[] tree = {3,2,3,0,3,0,1};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        System.out.println(rob(root));
    }
}
