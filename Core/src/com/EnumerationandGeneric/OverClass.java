package com.EnumerationandGeneric;

public class OverClass<T> {     // Define a generic class
    /**
     * @program: Core
     * @description: A demo for defining generics
     * @author: Log1c
     * @create: 2021-11-30 14:41
     **/
    private T over; // Define generic member variable
    public T getOver(){
        return over;
    }
    public void setOver(T over){
        this.over = over;
    }

    public static void main(String[] args) {
        OverClass<Boolean> over1 = new OverClass<Boolean>();    // instantiate a Boolean obj
        OverClass<Float> over2 = new OverClass<Float>();    // ditto
        over1.setOver(true);    // No need to casting
        over2.setOver(12.3f);   // ditto
        Boolean b = over1.getOver();
        Float f = over2.getOver();
        System.out.println(b);
        System.out.println(f);
    }
}
