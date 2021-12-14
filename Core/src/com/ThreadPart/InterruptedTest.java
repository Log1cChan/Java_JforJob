package com.ThreadPart;

public class InterruptedTest implements Runnable {
    /**
     * @program: Core
     * @description: A demo for how to stop a thread
     * @author: Log1c
     * @create: 2021-12-12 16:27
     **/
    private boolean isContinue = false; // set a mark value
    private int count = 0;
    public void run(){
        while(true){
            System.out.println(count++);
            if(isContinue){
                break;
            }
            if(count >= 100){
                setContinue();
            }
        }
    }
    public void setContinue(){
        this.isContinue = true;
    }

    public static void main(String[] args) {
        new Thread(new InterruptedTest()).start();
    }
}
