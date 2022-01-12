package Sorting;

public class BubbleSort {
    /**
     * @program: CS-Notes
     * @description: 实现冒泡排序
     * @author: Log1c
     * @create: 2021-12-22 02:02
     **/

    public static int[] bubbleSort(int[] nums){
        int n = nums.length;
//        加入isSorted判断是否已经有序
        boolean isSorted = false;
        for (int i=0; i<n-1 && !isSorted; i++){
            isSorted = true;
            for (int j=0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    isSorted = false;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6, 8};
//        int[] nums = {1, 2, 3, 4};
        nums = bubbleSort(nums);
        for (int i : nums){
            System.out.println(i);
        }
    }
}
