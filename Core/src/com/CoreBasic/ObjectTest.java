package com.CoreBasic;

class V{}


public class ObjectTest {
    /**
     * @program: Core
     * @description: Some method in java.lang.Object
     * @author: Log1c
     * @create: 2021-11-22 21:23
     **/
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        System.out.println(s1.equals(s2));
        V v1 = new V();
        V v2 = new V();
        System.out.println(v1.equals(v2));
    }
}
