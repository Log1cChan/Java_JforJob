package com.ThreadPart;

public class ThreadSafeTest2 implements Runnable{
    /**
     * @program: Core
     * @description: A right way to use synchronized
     * @author: Log1c
     * @create: 2021-12-12 18:23
     **/
    int num = 10;

    public synchronized void doit(){
        if(num>0){
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Tickets " + --num);
        }
    }

    public void run(){
        while (true){
            doit();
//            synchronized(""){
//                if(num>0){
//                    try{
//                        Thread.sleep(100);
//                    }catch(Exception e){
//                        e.printStackTrace();
//                    }
//                    System.out.println("Tickets " + --num);
//                }
//            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest2 t = new ThreadSafeTest2();
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
