package Sorting;

public class ShellSort {
    /**
     * @program: CS-Notes
     * @description: 实现希尔排序
     * @author: Log1c
     * @create: 2021-12-22 02:21
     **/

    public static int[] shellSort(int[] nums){
        int n = nums.length;
//      排序间隔
        int h = 1;
//      寻找合适排序间隔
        while(h<n/3){
            h = 3*h+1;
        }
//      开始排序
        while(h>=1){
            for (int i=h; i<n; i++){
                for (int j=i; j>=h; j-=h){
                    if(nums[j]<nums[j-h]){
                        int temp = nums[j];
                        nums[j] = nums[j-h];
                        nums[j-h] = temp;
                    }
                }
            }
            //                缩减间隔
            h = h/3;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6, 8};
//        int[] nums = {1, 2, 3, 4};
        nums = shellSort(nums);
        for (int i : nums){
            System.out.println(i);
        }
    }
}
