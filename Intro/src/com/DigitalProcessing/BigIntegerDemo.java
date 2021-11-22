package com.DigitalProcessing;

import java.math.BigInteger;

public class BigIntegerDemo {
    /**
     * @program: Intro
     * @description: Demo for some methods in class BigInteger
     * @author: Log1c
     * @create: 2021-11-16 22:08
     **/
    public static void main(String[] args) {
        BigInteger bigInstance = new BigInteger("4");
        System.out.println("Add: " + bigInstance.add(new BigInteger("2")));
        System.out.println("Subtract: " + bigInstance.subtract(new BigInteger("2")));
        System.out.println("Multiply: " + bigInstance.multiply(new BigInteger("2")));
        System.out.println("Divide: " + bigInstance.divide(new BigInteger("2")));
        System.out.println("Divide and Remainder(quotient[0]): " + bigInstance.divideAndRemainder(new BigInteger("3"))[0]);
        System.out.println("Divide and Remainder(remainder[1]): " + bigInstance.divideAndRemainder(new BigInteger("3"))[1]);
        System.out.println("Square: " + bigInstance.pow(2));
        System.out.println("Opposite number" + bigInstance.negate());
    }
}
