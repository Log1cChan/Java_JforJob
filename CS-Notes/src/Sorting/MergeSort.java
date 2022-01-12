package Sorting;


public class MergeSort {
    /**
     * @program: CS-Notes
     * @description: 实现归并排序
     * @author: Log1c
     * @create: 2021-12-22 16:05
     **/

    public static void mergeSort(int[] nums, int l, int r) {
//        终止条件
        if (l >= r) return;
//        递归划分
        int m = (l + r) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);
//        合并子数组
//        暂存数组
        int[] temp = new int[r - l + 1];
        for (int k = l; k <= r; k++) {
            temp[k - l] = nums[k];
        }
        int i = 0, j = m - l + 1;
        for (int k = l; k <= r; k++) {
            if (i == m - l + 1) {
                nums[k] = temp[j++];
            } else if (j == r - l + 1 || temp[i] <= temp[j]) {
                nums[k] = temp[i++];
            } else {
                nums[k] = temp[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6, 8};
//        int[] nums = {1, 2, 3, 4};
        mergeSort(nums, 0, nums.length-1);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
