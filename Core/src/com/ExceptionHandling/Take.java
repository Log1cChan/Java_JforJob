package com.ExceptionHandling;

public class Take {
    /**
     * @program: Core
     * @description: A demo for try-catch block
     * @author: Log1c
     * @create: 2021-11-24 16:41
     **/
    public static void main(String[] args) {
        try {
            String str = "lili";
            System.out.println(str + "'s age is: ");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("program over");
    }
}
