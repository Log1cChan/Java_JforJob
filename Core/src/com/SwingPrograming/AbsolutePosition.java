package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class AbsolutePosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Absolute Layout
     * @author: Log1c
     * @create: 2021-11-26 16:03
     **/
    public AbsolutePosition() {
        setTitle("This window uses Absolute Layout");
        setLayout(null);
        setBounds(0, 0, 200, 150);
        Container c = getContentPane();
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        b1.setBounds(10, 30, 80, 30);
        b2.setBounds(60, 70, 100, 20);
        c.add(b1);
        c.add(b2);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
