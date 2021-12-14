package com.CoreBasic;

class Parent{
    Parent(){
        System.out.println("Call the Construction Method from parent class");
    }
}
class SubParent extends Parent{
    SubParent(){
        System.out.println("Call the Construction Method from subparent class");
    }
}

public class Subroutine extends SubParent {
    /**
     * @program: Core
     * @description: Test of Inheritance
     * @author: Log1c
     * @create: 2021-11-22 17:23
     **/
    Subroutine(){
        System.out.println("Call the Construction Method from subroutine class");
    }

    public static void main(String[] args) {
        Subroutine s = new Subroutine();
    }
}
