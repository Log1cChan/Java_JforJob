package DynamicProgramming;

public class DP213 {
    /**
     * @program: R0det041ive
     * @description: 打家劫舍II
     * @author: Log1c
     * @create: 2021-12-20 17:12
     **/

    public static int rob(int[] nums) {
        int n = nums.length;
//        判断边界
        if(n<=2){
            if (n==1){
                return nums[0];
            }else{
                return Math.max(nums[0], nums[1]);
            }
        }
        return Math.max(robFrom(nums, 0, n-2), robFrom(nums, 1, n-1));

    }

    public static int robFrom(int[] nums, int from, int to){
        int first = nums[from], second = Math.max (nums[from], nums[from + 1]);
        for (int i=from+2; i<=to; i++){
            int temp = second;
            second = Math.max(second, first+nums[i]);
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob(nums));
    }
}
