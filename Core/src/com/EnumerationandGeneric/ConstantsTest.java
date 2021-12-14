package com.EnumerationandGeneric;

interface Constants{        // put constants inside a interface
    public static final int Constants_A = 1;
    public static final int Constants_B = 12;
}

public class ConstantsTest {
    /**
     * @program: Core
     * @description: A demo for using enum to set constant variable
     * @author: Log1c
     * @create: 2021-11-29 16:34
     **/
    enum Constants2{
        Constants_A, Constants_B        // put constants inside enum
    }

    // use interface to set constants
    public static void doit(int c){
        switch (c){
            case Constants.Constants_A:
                System.out.println("doit() Constants_A");
                break;
            case Constants.Constants_B:
                System.out.println("doit() COnstants_B");
                break;
        }
    }

    public static void doit2(Constants2 c){
        switch (c){
            case Constants_A:
                System.out.println("doit2() Constants_A");
                break;
            case Constants_B:
                System.out.println("doit2() Constants_B");
                break;
        }
    }

    public static void main(String[] args) {
        ConstantsTest.doit(Constants.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
        ConstantsTest.doit(Constants.Constants_B);
        ConstantsTest.doit(3);
//        ConstantsTest.doit2(3);
    }
}
