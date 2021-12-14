package com.ThreadPart;

public class RunnableTest {
    /**
     * @program: Core
     * @description: A demo for another way to create a thread: Runnable Interface
     * @author: Log1c
     * @create: 2021-12-11 20:07
     **/
    private static Thread t;
    private int count = 0;

    public RunnableTest(){
        t = new Thread(new Runnable(){      // anonymous inner class and implements Runnable interface
            public void run(){          // override run() method
                while (count <= 200){
                    System.out.println(count);

                    try {
                        Thread.sleep(100);     // let the thread sleep for 1000ms
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    count+=4;
                    if (count == 200){
                        count = 10;
                    }
                }
            }
        });
        t.start();                  // execute thread
    }

    public static void main(String[] args) {
        new RunnableTest();
    }
}
