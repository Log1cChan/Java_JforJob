package com.EnumerationandGeneric;

public class EnumIndexTest {
    /**
     * @program: Core
     * @description: A demo for ordinal()
     * @author: Log1c
     * @create: 2021-11-29 21:33
     **/
    enum Constants2 {
        Constants_A, Constants_B, Constants_C
    }

    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println(Constants2.values()[i] + "'s pos in enum is: " + Constants2.values()[i].ordinal());
        }
    }
}
