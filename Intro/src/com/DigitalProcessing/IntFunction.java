package com.DigitalProcessing;

public class IntFunction {
    /**
     * @program: Intro
     * @description: Usage of Integral Function
     * @author: Log1c
     * @create: 2021-11-16 21:34
     **/

    public static void main(String[] args){
        // Return the first Integer >= param
        System.out.println(Math.ceil(5.2));
        // Return the first Integer <= param
        System.out.println(Math.floor(2.5));
        // Return a Integer which is the closest
        System.out.println(Math.rint(2.7));
        System.out.println(Math.rint(2.5));
        // Return a Integer which is close to the param+0.5
        System.out.println(Math.round(3.4f));
    }
}
