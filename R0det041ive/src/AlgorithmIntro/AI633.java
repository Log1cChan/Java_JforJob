package AlgorithmIntro;

public class AI633 {
    /**
     * @program: R0det041ive
     * @description: 平方数之和
     * @author: Log1c
     * @create: 2021-12-17 21:56
     **/

    public static boolean judgeSquareSum(int c) {
        long right = (long)Math.sqrt(c);
        long left = 0;
        while (left <= right){
            if (left*left + right*right == c){
                return true;
            }else if (left*left + right*right > c){
                right--;
            }else{
                left++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int c = 2147483600;
        System.out.println(judgeSquareSum(c));
    }
}
