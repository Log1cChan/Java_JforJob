package com.EnumerationandGeneric;

public class EnumMethodTest {
    /**
     * @program: Core
     * @description: A demo for valueOf() and compareTo()
     * @author: Log1c
     * @create: 2021-11-29 21:26
     **/
    enum Constants2{
        Constants_A, Constants_B
    }
    public static void compare(Constants2 c){   // Compare enum
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println(c + " compares to " + Constants2.values()[i] + ": " + c.compareTo(Constants2.values()[i]));
        }
    }

    public static void main(String[] args) {
        compare(Constants2.valueOf("Constants_B"));
    }
}
