package DynamicProgramming;

public class DP1137 {
    /**
     * @program: R0det041ive
     * @description: 第N个泰波那契数
     * @author: Log1c
     * @create: 2021-12-16 20:28
     **/
    public static int tribonacci(int n) {
        int a=0, b=1, c=1, sum=0;
        if(n==0) return a;
        if(n<=2) return 1;
        for(int i=3; i<=n; i++){
            sum = a+b+c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

}
