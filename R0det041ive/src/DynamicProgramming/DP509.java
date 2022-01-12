package DynamicProgramming;

public class DP509 {

    public static int fib(int n){

//        if(n>1){
//            return(fib(n-1)+fib(n-2));
//        }else if(n==1){
//            return 1;
//        }else{
//            return 0;
//        }
//        动态规划
//        if(n==0) return 0;
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//        for (int i=2; i<=n; i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
        if (n == 0) return 0;           // 若求 f(0) 则直接返回 0
        int a = 0, b = 1;               // 初始化 f(0), f(1)
        for (int i = 2; i <= n; i++) {  // 状态转移求取 f(2), f(3), ..., f(n)
            int tmp = a;
            a = b;
            b = tmp + b;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
