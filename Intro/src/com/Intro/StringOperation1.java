package com.Intro;

public class StringOperation1 {
    static java.lang.String s1 = "Hello";
    public static void main(java.lang.String[] args) {
        java.lang.String s2 = "Java";
        System.out.println(s1);
        System.out.println(s2);

        int b = 20;
        System.out.println(b < 45?"true":"false");

        java.lang.String str = "   We are the world!   ";
        System.out.println(str.lastIndexOf("are"));
        System.out.println(str.trim());
        System.out.println(str.replace("the", "a"));

    }
}
