package DynamicProgramming;

public class DP53 {
    /**
     * @program: R0det041ive
     * @description: 最大子数组和
     * @author: Log1c
     * @create: 2021-12-23 03:09
     **/

    public static int maxSubArray(int[] nums){
        int max = nums[0];
        int n = nums.length;
        int pre = nums[0];
        for(int i=1; i<n; i++){
            pre = Math.max(pre+nums[i], nums[i]);
            max = Math.max(pre, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
}
