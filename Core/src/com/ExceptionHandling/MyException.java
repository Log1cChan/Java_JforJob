package com.ExceptionHandling;

public class MyException extends Exception {
    /**
     * @program: Core
     * @description: A custom exception
     * @author: Log1c
     * @create: 2021-11-24 17:08
     **/
    public MyException(String ErrorMessage){
        super(ErrorMessage);
    }
}
