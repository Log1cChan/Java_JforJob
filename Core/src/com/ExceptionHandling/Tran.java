package com.ExceptionHandling;

public class Tran {
    /**
     * @program: Core
     * @description: A demo for Custom Excption
     * @author: Log1c
     * @create: 2021-11-24 17:07
     **/
    static int avg(int number1, int number2)throws MyException{
        if (number1 < 0 || number2 < 0){
            throw new MyException("Can't use negative num");
        }
        if (number1 > 100 || number2 > 100){
            throw new MyException("The num is too large");
        }
        return (number1+number2)/2;
    }

    public static void main(String[] args) {
        try{
            int result = avg(102, 150);
            System.out.println(result);
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
