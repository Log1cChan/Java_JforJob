import java.util.*;

public class Teest {
    /**
     * @program: R0det041ive
     * @description: A test class
     * @author: Log1c
     * @create: 2021-11-30 16:36
     **/
//    最优子结构示例：蛋糕最高售价
//    public static int maxCakePrice(int n, int[] priceList) {
//        if (n <= 1) return priceList[n];  // 蛋糕重量 <= 1 时直接返回
//        int[] dp = new int[n + 1];        // 初始化 dp 列表
//        for (int j = 1; j <= n; j++) {    // 按顺序计算 f(1), f(2), ..., f(n)
//            for (int i = 0; i < j; i++)   // 从 j 种组合种选择最高售价的组合作为 f(j)
//                dp[j] = Math.max(dp[j], dp[i] + priceList[j - i]);
//        }
//        return dp[n];
//    }


    public static void main(String[] args) {
//        System.out.println(1/2);
//        int[] nums = new int[20];
//        for(int num:nums){
//            System.out.println(num);
//        }

//        List<Integer> list = new ArrayList<Integer>();

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();

    }
}
