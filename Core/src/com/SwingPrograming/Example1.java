package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame {
    /**
     * @program: Core
     * @description: A demo for JFrame
     * @author: Log1c
     * @create: 2021-11-24 20:09
     **/
    public void CreateJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("This is a JFrame");  // create a Jlabel
        jl.setHorizontalAlignment(SwingConstants.CENTER); // center align

        container.add(jl);
        container.setBackground(Color.CYAN);
        jf.setVisible(true); // make it visible
        jf.setSize(600, 450);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example1().CreateJFrame("Create a JFrame");
    }
}
