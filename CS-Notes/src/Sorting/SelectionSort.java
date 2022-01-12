package Sorting;

public class SelectionSort {
    /**
     * @program: CS-Notes
     * @description: 选择排序我的实现
     * @author: Log1c
     * @create: 2021-12-22 01:51
     **/

    public static int[] selectSort(int[] nums){
        int n = nums.length;
        for(int i = 0; i<n-1; i++){
            int min = i;
            for (int j=i+1; j<n; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6, 9};
        nums = selectSort(nums);
        for (int i : nums){
            System.out.println(i);
        }
    }
}
