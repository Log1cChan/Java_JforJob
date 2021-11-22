package com.DigitalProcessing;

public class MathRandom {
    /**
     * @program: Intro
     * @description: Usage of Math.random()
     * @author: Log1c
     * @create: 2021-11-16 21:46
     **/
    public static int GetEvenNum(double num1, double num2){
        /**
        * @Description:  Generate a random even number in the range of num1-num2
        * @Param: [num1, num2]
        * @return: int
        */
        int s = (int)num1 + (int)(Math.random() * (num2-num1));
        if(s % 2 == 0){
            return s;
        }else{
            return s + 1;
        }
    }

    public static void main(String[] args){
        System.out.println("A random even number in the range of 2 to 32: " + GetEvenNum(2, 32));
    }
}
