package com.ExceptionHandling;

public class Shoot {
    /**
     * @program: Core
     * @description: A demo for throws keyword
     * @author: Log1c
     * @create: 2021-11-24 17:16
     **/
    static void pop() throws NegativeArraySizeException{
        int[] arr = new int[-3];
    }

    public static void main(String[] args) {
        try{
            pop();
        }catch(NegativeArraySizeException e){
            System.out.println("Exception throw by pop()");
        }
    }
}
