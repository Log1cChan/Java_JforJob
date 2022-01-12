package DataStructureIntro;

import java.util.List;

public class DSI637 {
    /**
     * @program: R0det041ive
     * @description: 二叉树的层平均值
     * @author: Log1c
     * @create: 2022-01-04 21:05
     **/
    public static List<Double> averageOfLevels(TreeNode root) {

    }

    public static void main(String[] args) {
        int[] tree = {3,9,20,0,0,15,7};
        TreeNode root = new TreeNode(tree[0]);
        root = root.createTree(tree);
        List<Double> list = averageOfLevels(root);
        for (Double item : list){
            System.out.println(item);
        }
    }
}
