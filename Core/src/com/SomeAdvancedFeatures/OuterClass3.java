package com.SomeAdvancedFeatures;

interface OutInterface2{

}

public class OuterClass3 {
    /**
     * @program: Core
     * @description: A demo for local inner class
     * @author: Log1c
     * @create: 2021-11-24 16:24
     **/
    public OutInterface2 doit(final String x){
        class InnerClass2 implements OutInterface2{
            InnerClass2(String s){
                s = x;
                System.out.println(s);
            }
        }
        return new InnerClass2("doit");
    }
}
