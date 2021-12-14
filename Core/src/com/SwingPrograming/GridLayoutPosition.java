package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Grid Layout
     * @author: Log1c
     * @create: 2021-11-26 16:30
     **/
    public GridLayoutPosition(){
        Container c = getContentPane();
        setLayout(new GridLayout(7, 3, 5, 5));
        for (int i=0; i<21; i++){
            c.add(new JButton("Button" + i));
        }
        setSize(300, 300);
        setTitle("This window uses Grid Layout");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutPosition();
    }
}
