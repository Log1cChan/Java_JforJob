package DynamicProgramming;

public class DP45 {
    /**
     * @program: R0det041ive
     * @description: 跳跃游戏II
     * @author: Log1c
     * @create: 2021-12-23 02:57
     **/
    public static int jump(int[] nums){
/**
 * 我的方法及思路：
 * 因为从头到尾都会跳，每次跳的时候，看一下是不是0，是0就说明没跳过，那么基础上加一
 * 如果不是0，怎么说，那你必被跳过，看一下哪里跳你最少次呗，就比较，最后看最后一个元素最少跳几次即可
 */
//        int n = nums.length;
//        if (n==1) return 0;
//        int dp[] = new int[n];
//        for (int i=0; i<n; i++){
//            int j = nums[i];
//            while(j>0){
//                if(i+j<=n-1){
//                    if(dp[i+j]!=0){
//                        dp[i+j] = Math.min(dp[i+j], dp[i]+1);
//                    }else{
//                        dp[i+j]= dp[i] + 1;
//                    }
//                }
//                j--;
//            }
//        }
//        return dp[n-1];

/**
 * 题解 贪心算法
 * 正向查找，每次找到可以到达的最远位置。
 */
        int n = nums.length;
        int end = 0;
        int maxPos = 0;
        int steps = 0;
        for(int i=0; i<n-1; i++){
            maxPos = Math.max(maxPos, i+nums[i]);
            if(i==end){
                end = maxPos;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
