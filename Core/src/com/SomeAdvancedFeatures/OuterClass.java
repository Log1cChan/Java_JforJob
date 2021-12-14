package com.SomeAdvancedFeatures;

public class OuterClass {
    /**
     * @program: Core
     * @description: A demo for inner class basic
     * @author: Log1c
     * @create: 2021-11-24 16:02
     **/
    innerClass in = new innerClass(); // instantiate the innerclass obj in outer
    public void ouf(){
        in.inf(); // calls the inner mehod in outer
    }
    class innerClass {
        innerClass(){
        }
        public void inf(){
        }
        int y = 0;
    }
    public innerClass doit(){
//        y = 4;  // this is wrong
        in.y = 4;
        return new innerClass();
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.innerClass in = out.doit();
        OuterClass.innerClass in2 = out.new innerClass();
    }
}
