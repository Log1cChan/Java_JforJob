package DynamicProgramming;

import java.util.Arrays;

public class DP740 {
    /**
     * @program: R0det041ive
     * @description: 删除并获得点数
     * @author: Log1c
     * @create: 2021-12-20 17:32
     **/

    public static int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int[] sum = new int[nums[nums.length-1]+1];
        for (int i=0; i< nums.length; i++){
            sum[nums[i]] += nums[i];
        }
//      初始状态
        int first = sum[0], second = Math.max(sum[0], sum[1]);
        for (int i=2; i<sum.length; i++){
            int temp = second;
            second = Math.max(second, sum[i] + first);
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2};
        System.out.println(deleteAndEarn(nums));
    }
}
