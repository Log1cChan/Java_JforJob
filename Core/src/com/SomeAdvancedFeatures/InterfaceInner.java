package com.SomeAdvancedFeatures;

interface OutInterface{
    public void f();
}

public class InterfaceInner {
    /**
     * @program: Core
     * @description: soso
     * @author: Log1c
     * @create: 2021-11-24 16:14
     **/
    public static void main(String[] args) {
        OuterClass2 out = new OuterClass2();
        OutInterface outinter = out.doit();
        outinter.f();
    }
}

class OuterClass2{
    // implements the interface
    private class InnerClass implements OutInterface{
        InnerClass(String s){
            System.out.println(s);
        }
        public void f(){
            System.out.println("call the f() inner");
        }
    }
    public OutInterface doit(){
        return new InnerClass("call the construction method inner");
    }
}
