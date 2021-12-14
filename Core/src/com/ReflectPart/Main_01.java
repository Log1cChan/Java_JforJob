package com.ReflectPart;

import java.lang.reflect.*;

public class Main_01 {
    /**
     * @program: Core
     * @description: A demo of using some methods to visit constructor
     * @author: Log1c
     * @create: 2021-11-29 16:06
     **/
    public static void main(String[] args) {
        Example_01 example = new Example_01("10", "20", "30");
        Class<? extends Example_01> exampleC = example.getClass();      // get all the constructor
        Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
        for(int i=0; i<declaredConstructors.length; i++){
            Constructor<?> constructor = declaredConstructors[i];
            System.out.println("View if allow VarArgs: " + constructor.isVarArgs());
            System.out.println("The ParamType of the entry of the constructor: ");
            Class[] parameterTypes = constructor.getParameterTypes();
            for (int j=0; j<parameterTypes.length; j++){
                System.out.println(" " + parameterTypes[j]);
            }
            System.out.println("Exception may be thrown: ");

        }
    }
}
