package com.ClassAndObject;

public class StaticTest {
    /**
     * @program: Intro
     * @description: Test the static member
     * @author: Log1c
     * @create: 2021-11-11 21:42
     **/
    // static constant
    final static double PI = 3.1415;
    // static variable
    static int id;
    // static method
    public static void method1(){
        // some code
    }

    public void method2(){
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method1();
    }

    public static void main(String[] args){
        StaticTest st = new StaticTest();
        st.method2();
//        for (int i=0; i<args.length; i++){
//            System.out.println(args[i]);
//        }
    }

}
