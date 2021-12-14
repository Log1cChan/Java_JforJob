package com.CoreBasic;

public class OverLoadTest {
    /**
     * @program: Core
     * @description: A demo of overloading methods
     * @author: Log1c
     * @create: 2021-11-22 21:50
     **/
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static int add(int a){
        return a;
    }
    public static int add(int a, double b){
        return 1;
    }
    public static int add(double a, int b){
        return 1;
    }
    // Use Variable-length Argument
    public static int add(int...a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s+=a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(1,2));
        System.out.println("add(double, double): " + add(2.1, 2.2));
        System.out.println("add(int): " + add(1));
        System.out.println("call variable-length argument: " + add(1, 2, 3, 4, 5));
    }
}
