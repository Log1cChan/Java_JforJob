package com.DigitalProcessing;

public class TrigonometricFunction {
    /**
     * @program: Intro
     * @description: Usage of Trigonometric Funcs
     * @author: Log1c
     * @create: 2021-11-12 17:38
     **/

    public static void main(String[] args){
        System.out.println("sin90º = " + Math.sin(Math.PI/2));
        System.out.println("cos0º = " + Math.cos(0));
        System.out.println("tan60º = " + Math.tan(Math.PI/3));
        System.out.println("arcsin(sqrt(2)/2) = " + Math.asin(Math.sqrt(2)/2));
        System.out.println("arccos(sqrt(2)/2) = " + Math.acos(Math.sqrt(2)/2));
        System.out.println("arctan1 = " + Math.atan(1));
        System.out.println("radius of 120º = " + Math.toRadians(123.0));
        System.out.println("Degree of π/2 = " + Math.toDegrees(Math.PI/2));
    }
}
