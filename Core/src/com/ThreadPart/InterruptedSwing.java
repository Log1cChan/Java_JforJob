package com.ThreadPart;

import javax.swing.*;
import java.awt.*;

public class InterruptedSwing extends JFrame {
    /**
     * @program: Core
     * @description: A demo for using interrupt() to stop a thread
     * @author: Log1c
     * @create: 2021-12-12 16:35
     **/
    Thread thread;

    public static void main(String[] args) {
         init(new InterruptedSwing(), 100, 100);
    }

    public InterruptedSwing(){
        super();
        final JProgressBar progressBar = new JProgressBar();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        progressBar.setStringPainted(true);
        thread = new Thread(new Runnable() {
           int count = 0;
           public void run() {
               while(true){
                   progressBar.setValue(++count);
                   try{
                       thread.sleep(1000);
                   }catch(InterruptedException e){
                       System.out.println("The current thread was interrupted");
                       break;
                   }
               }
           }
        });
        thread.start();
        thread.interrupt();
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
