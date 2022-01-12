package OfferK1ller;

public class Offer10 {
    /**
     * @program: R0det041ive
     * @description: 青蛙跳台阶
     * @author: Log1c
     * @create: 2021-12-16 19:58
     **/

    public static int numWays(int n) {
        int a=1, b=1;
        if(n==1) return b;
        if(n==0) return a;
        for (int i=2; i<=n; i++){
            int num = (a+b)%1000000007;
            a = b;
            b = num;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
}
