package com.ThreadPart;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SleepMethodTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for sleep method in Thread
     * @author: Log1c
     * @create: 2021-12-12 00:12
     **/
    private Thread t;
    private static Color[] color = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW, Color.RED, Color.PINK, Color.LIGHT_GRAY};// Create color array
    private static final Random rand = new Random();

    private static Color getC(){    // get random color
        return color[rand.nextInt(color.length)];
    }
    public SleepMethodTest(){
        setVisible(true);
        t = new Thread(new Runnable() { // create anonymous thread obj
            int x = 300;
            int y = 500;
            public void run(){
                while(true){
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    Graphics graphics = getGraphics(); // get component
                    graphics.setColor(getC());
                    graphics.drawLine(x, y, 100, y++);  // draw line and add vertical coordinate
                    if(y>=300){
                        y = 50;
                    }
                }
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        init(new SleepMethodTest(), 500, 400);
    }

    public static void init(JFrame frame, int width, int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
    }
}









