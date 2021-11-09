package com.Intro;

public class JudgeEmail {
    /**
     * @program: Intro
     * @description: Judge if the Eamil Address is valid
     * @author: Log1c
     * @create: 2021-11-09 21:03
     **/
    public static void main(String[] args){
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";
        String str2 = "aaaaaa";
        String str3 = "1111@111ffyu.dfg.com";
        if (str1.matches(regex))
            System.out.println(str1);
        if (str2.matches(regex))
            System.out.println(str2);
        if (str3.matches(regex))
            System.out.println(str3);
        /**
        * @Description: Usage of StringBuilder
        * @Author: Log1c
        * @Date: 2021/11/9
        */
        StringBuilder bf = new StringBuilder("StringBuilder");
        bf.append("123");
        System.out.println(bf.toString());
        bf.insert(5, "world");
        System.out.println(bf.toString());
        bf.delete(5, 10);
        System.out.println(bf.toString());
    }



}
