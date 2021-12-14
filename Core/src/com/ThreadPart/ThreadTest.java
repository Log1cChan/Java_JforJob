package com.ThreadPart;

public class ThreadTest extends Thread{     // extends Thread class
    /**
     * @program: Core
     * @description: A demo of extending thread
     * @author: Log1c
     * @create: 2021-12-11 19:56
     **/
    private int count = 10;
    public void run(){  // override run() method
        while (true) {
            System.out.println(count+" ");
            if (--count == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start(); // call run()
    }
}
