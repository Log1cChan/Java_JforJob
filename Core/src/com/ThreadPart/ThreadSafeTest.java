package com.ThreadPart;

public class ThreadSafeTest implements Runnable {
    /**
     * @program: Core
     * @description: A demo for testing thread safety
     * @author: Log1c
     * @create: 2021-12-12 17:32
     **/
    int num = 10;
    public void run(){
        while (true){
            if(num>0){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Tickets " + num--);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);

        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
