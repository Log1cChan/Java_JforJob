package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for JScrollPane
     * @author: Log1c
     * @create: 2021-11-26 18:50
     **/
    public JScrollPaneTest(){
        Container c = getContentPane();
        JTextArea ta = new JTextArea(20, 50);
        JScrollPane sp = new JScrollPane(ta);
        c.add(sp);
        setTitle("This window uses JScrollPane");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
