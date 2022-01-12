package Sorting;

public class QuickSort {
    /**
     * @program: CS-Notes
     * @description: 实现快速排序
     * @author: Log1c
     * @create: 2021-12-22 16:49
     **/

    public static void quickSort(int[] nums, int l, int r){
//        子数组长度为1时停止递归
        if(l>=r) return;
//        哨兵划分
        int i = partition(nums, l, r);
//        递归子数组执行哨兵划分
        quickSort(nums, l, i-1);
        quickSort(nums, i+1, r);
    }

    public static int partition(int[] nums, int l, int r){
//        以nums[l]作为基准数
        int i = l, j = r;
        while (i<j){
            while(i<j && nums[j] >= nums[l]) j--;
            while(i<j && nums[i] <= nums[l]) i++;
            swap(nums, i, j);
        }
        swap(nums, i, l);
        return l;
    }

    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6, 8};
//        int[] nums = {1, 2, 3, 4};
        quickSort(nums, 0, nums.length-1);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
