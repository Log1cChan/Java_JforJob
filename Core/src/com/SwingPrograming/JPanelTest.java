package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {
    /**
     * @program: Core
     * @description: A test of JPanel
     * @author: Log1c
     * @create: 2021-11-26 18:42
     **/
    public JPanelTest(){
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 10, 10));
        JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p3.add(new JButton("6"));
        p3.add(new JButton("7"));
        p4.add(new JButton("8"));
        p4.add(new JButton("9"));
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
