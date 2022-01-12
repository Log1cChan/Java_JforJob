package DataStructureIntro;

public class DSI75 {
    /**
     * @program: R0det041ive
     * @description: 颜色分类、荷兰国旗
     * @author: Log1c
     * @create: 2021-12-20 19:38
     **/

    public static void sortColors(int[] nums) {
//        先对2进行排序
        int n = nums.length;
        int left = 0, right = n-1;

//        for (int i = 0; i<=right; i++){
//            while
//        }

        for (int i : nums){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}
