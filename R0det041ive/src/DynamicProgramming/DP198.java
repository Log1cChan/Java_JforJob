package DynamicProgramming;

public class DP198 {
    /**
     * @program: R0det041ive
     * @description: 打家劫舍
     * @author: Log1c
     * @create: 2021-12-19 01:55
     **/

    public static int rob(int[] nums) {
        int n = nums.length;
//        判断边界
        if (n<=2){
            if (n==1){
                return nums[0];
            }else{
                return Math.max(nums[0], nums[1]);
            }
        }
//        正式DP
        int[] dp = new int[n];
        dp[0] = nums[0]; dp[1] = Math.max(nums[0], nums[1]); // 初始状态
        for (int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }
}
