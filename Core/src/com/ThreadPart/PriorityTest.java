package com.ThreadPart;

import javax.swing.*;
import java.awt.*;

public class PriorityTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for setting priority for threads
     * @author: Log1c
     * @create: 2021-12-12 17:12
     **/
    Thread threadA;
    Thread threadB;
    Thread threadC;
    Thread threadD;

    public PriorityTest(){
        super();
        final JProgressBar progressBar = new JProgressBar();
        final JProgressBar progressBar2 = new JProgressBar();
        final JProgressBar progressBar3 = new JProgressBar();
        final JProgressBar progressBar4 = new JProgressBar();
        setLayout(new GridLayout(4, 1, 5, 5));
        getContentPane().add(progressBar);
        getContentPane().add(progressBar2);
        getContentPane().add(progressBar3);
        getContentPane().add(progressBar4);
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);
        progressBar3.setStringPainted(true);
        progressBar4.setStringPainted(true);

        threadA = new Thread(new MyThread(progressBar));
        threadB = new Thread(new MyThread(progressBar2));
        threadC = new Thread(new MyThread(progressBar3));
        threadD = new Thread(new MyThread(progressBar4));
        setPriority("threadA", 5, threadA);
        setPriority("threadB", 5, threadB);
        setPriority("threadC", 4, threadC);
        setPriority("threadD", 3, threadD);
    }

    public static void setPriority(String threadName, int priority, Thread t){
        t.setPriority(priority);
        t.setName(threadName);
        t.start();
    }

    public static void main(String[] args) {
        init(new PriorityTest(), 500, 500);
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }

    private final class MyThread implements Runnable{
        private final JProgressBar bar;
        int count = 0;
        private MyThread(JProgressBar bar){
            this.bar = bar;
        }
        public void run() {
            while (true){
                bar.setValue(count+=10);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("The current thread was interrupted");
                }
            }
        }
    }
}
