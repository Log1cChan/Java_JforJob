package com.ThreadPart;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for join() method
     * @author: Log1c
     * @create: 2021-12-12 01:38
     **/
    private Thread threadA;
    private Thread threadB; // create two threads
    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();
    int count = 0;

    public static void main(String[] args) {
        init(new JoinTest(), 100, 100);
    }

    public JoinTest(){
        super();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        getContentPane().add(progressBar2, BorderLayout.SOUTH);
        progressBar.setStringPainted(true); // set integrate with progressbar
        progressBar2.setStringPainted(true);
        // Use anonymous inner class
        threadA = new Thread(new Runnable() {
            int count = 0;
            public void run(){
                while (true){
                    progressBar.setValue(++count);
                    try{
                        Thread.sleep(100);
                        threadB.join(); // let threadB call join()
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;
            public void run(){
                while(true){
                    progressBar2.setValue(++count);
                    try {
                        Thread.sleep(100);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    if (count == 100){
                        break;
                    }
                }
            }
        });
        threadB.start();
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
