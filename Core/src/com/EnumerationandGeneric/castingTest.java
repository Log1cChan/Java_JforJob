package com.EnumerationandGeneric;

public class castingTest {
    /**
     * @program: Core
     * @description: A demo for upcasting and Downcasting
     * @author: Log1c
     * @create: 2021-11-30 14:31
     **/
    private Object b;
    public Object getB(){
        return b;
    }
    public void setB(Object b){
        this.b = b;
    }
    public static void main(String[] args) {
        castingTest t = new castingTest();
        t.setB(new Boolean(true)); // Upcasting
        System.out.println(t.getB());
        t.setB(new Float(12.3));
        Float f = (Float)(t.getB());    // Downcasting
        System.out.println(f);
    }
}
