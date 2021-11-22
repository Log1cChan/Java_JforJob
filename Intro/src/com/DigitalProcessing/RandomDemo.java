package com.DigitalProcessing;

import java.util.Random;

public class RandomDemo {
    /**
     * @program: Intro
     * @description: A demo of using some funcs in Class Random
     * @author: Log1c
     * @create: 2021-11-16 21:56
     **/
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Random Integer: " + r.nextInt());
        System.out.println("Random Integer in the range of 0 to 10: " + r.nextInt(10));
        System.out.println("Random Boolean: " + r.nextBoolean());
        System.out.println("Random Double: " + r.nextDouble());
        System.out.println("Random Float: " + r.nextFloat());
        System.out.println("Random Double which probability density is gaussian: " + r.nextGaussian());
    }
}
