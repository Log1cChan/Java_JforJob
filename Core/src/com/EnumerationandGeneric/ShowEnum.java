package com.EnumerationandGeneric;

public class ShowEnum {
    /**
     * @program: Core
     * @description: A demo for values() method
     * @author: Log1c
     * @create: 2021-11-29 21:12
     **/
    enum Constants2{
        Constants_A, Constants_B
    }

    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println("Enum member: " + Constants2.values()[i]);
        }
    }
}
