package DynamicProgramming;

public class DP746 {
    /**
     * @program: R0det041ive
     * @description: 使用最小花费爬楼梯
     * @author: Log1c
     * @create: 2021-12-16 20:37
     **/
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 0;
        if(n<3) return Math.min(cost[0], cost[1]);
        for(int i=2; i<=n; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int cost[] = {1, 100};
        System.out.println(minCostClimbingStairs(cost));
    }
}
