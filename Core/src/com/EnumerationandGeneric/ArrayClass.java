package com.EnumerationandGeneric;

public class ArrayClass<T> {
    /**
     * @program: Core
     * @description: A demo for declaring array when using generic
     * @author: Log1c
     * @create: 2021-11-30 14:53
     **/
    private T[] array;  // Defining generic array
    public void SetT(T[] array){
        this.array = array;
    }
    public T[] getT(){
        return array;
    }

    public static void main(String[] args) {
        ArrayClass<String> a = new ArrayClass<String>();
        String[] array = {"Member1", "Member2", "Member3", "Member4", "Member5",};
        a.SetT(array);
        for (int i=0; i<a.getT().length; i++){
            System.out.println(a.getT()[i]);
        }
    }
}
