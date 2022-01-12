package OfferK1ller;

public class Offer20 {
    /**
     * @program: R0det041ive
     * @description: 表示数值的字符串
     * @author: Log1c
     * @create: 2021-12-21 00:36
     **/

    public static boolean isNumber(String s) {
        char[] num = s.toCharArray();
        boolean flage = false, flagdot = false;
        for(int i=0; i<num.length; i++){
            if(num[i]==' ') continue;

        }
        return false;
    }

    public static void main(String[] args) {
        String s = "0";
        System.out.println(isNumber(s));
    }
}
