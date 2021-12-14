package com.ExceptionHandling;

public class MyException1 extends Exception {
    /**
     * @program: Core
     * @description: A Exception for throw
     * @author: Log1c
     * @create: 2021-11-24 17:25
     **/
    String message;
    public MyException1(String ErrorMessage){
        message = ErrorMessage;
    }
    public String getMessage() {
        return message;
    }
}
