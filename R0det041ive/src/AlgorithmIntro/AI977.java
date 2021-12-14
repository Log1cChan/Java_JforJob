package AlgorithmIntro;

import java.util.Arrays;
import java.util.Map;

import static java.util.Arrays.sort;

public class AI977 {
    /**
     * @program: R0det041ive
     * @description: ordered array's squre
     * @author: Log1c
     * @create: 2021-12-01 18:18
     **/
    public int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return (nums);
    }

    public static void main(String[] args) {
//        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums = {-7,-3,2,3,11};
        AI977 a = new AI977();
        int[] num = a.sortedSquares(nums);
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
