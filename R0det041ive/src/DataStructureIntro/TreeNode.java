package DataStructureIntro;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    /**
     * @program: R0det041ive
     * @description: 树节点
     * @author: Log1c
     * @create: 2021-12-28 17:13
     **/
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode createTree(int[] tree){
        List<TreeNode> list = new ArrayList<TreeNode>();
        for(int i : tree){
            list.add(new TreeNode(i));
        }
        TreeNode root = list.get(0);
        for(int i=0;i<list.size()/2;i++){
            if((i*2+1)<list.size()){
                if(list.get(i*2+1).val==0) list.get(i).left = null;
                else list.get(i).left = list.get(i*2+1);
            }
            if((i*2+2)<list.size()){
                if(list.get(i*2+2).val==0) list.get(i).right = null;
                else list.get(i).right = list.get(i*2+2);
            }
        }

        return root;
    }
}
