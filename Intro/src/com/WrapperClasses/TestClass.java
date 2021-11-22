package com.WrapperClasses;

public class TestClass {
    /**
     * @program: Intro
     * @description: Some test in this section
     * @author: Log1c
     * @create: 2021-11-11 23:22
     **/

    public static void main(String[] args){
        // two kinds of Construction Func of Integer Wrapper Class
        Integer number = new Integer(7);
        Integer number1 = new Integer("45");
        System.out.println(number.byteValue());
        System.out.println(number1.byteValue());

        // Use parseInt() to parse int
        String str[] = {"89", "12", "10", "18", "35"};
        int sum = 0;
        for (int i=0; i<str.length; i++){
            int myint = Integer.parseInt(str[i]);
            sum = sum+myint;
        }
        System.out.println(sum);

        //
    }
}
