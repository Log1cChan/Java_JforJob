package Sorting;

public class InsertSorting {
    /**
     * @program: CS-Notes
     * @description: 实现插入排序
     * @author: Log1c
     * @create: 2021-12-22 02:12
     **/

    public static int[] insertSort(int[] nums){
        int n = nums.length;
        for (int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
//        int[] nums = {9, 3, 1, 8, 1, 2, 5, 6, 8};
        int[] nums = {1, 2, 3, 4};
        nums = insertSort(nums);
        for (int i : nums){
            System.out.println(i);
        }
    }
}
