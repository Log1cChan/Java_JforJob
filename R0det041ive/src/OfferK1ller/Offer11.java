package OfferK1ller;

public class Offer11 {
    /**
     * @program: R0det041ive
     * @description: 旋转数组的最小数字
     * @author: Log1c
     * @create: 2022-01-04 20:19
     **/

    public static int minArray(int[] numbers) {
        int n = numbers.length-1;
        if(n<0) return 0;
        for (int i=n; i>0; i--){
            if(numbers[i-1] <= numbers[i]){
                continue;
            }else{
                return numbers[i];
            }
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] numbers = {1,3,3};
        System.out.println(minArray(numbers));
    }
}
