package AlgorithmIntro;

import java.util.Arrays;

public class AI283 {
    /**
     * @program: R0det041ive
     * @description: move zero
     * @author: Log1c
     * @create: 2021-12-06 16:28
     **/
    public static void moveZeroes(int[] nums) {
//        int count = 0;
//        for (int i=0; i<nums.length-count;){
//            if (nums[i]==0){
//                for (int j=i; j<nums.length-1; j++){
//                    int temp = nums[j+1];
//                    nums[j+1]= nums[j];
//                    nums[j] = temp;
//                }
//                count++;
//            }
//            if (nums[i]!=0 && count < nums.length){
//                i++;
//            }
//        }

        int r=0, l=0;
        while (r<nums.length){
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
            r++;
        }

        for (int j=0; j<nums.length; j++){
            System.out.println(nums[j]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1};
        moveZeroes(nums);
    }
}
