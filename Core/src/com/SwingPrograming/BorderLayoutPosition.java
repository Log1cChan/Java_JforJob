package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Border Layout
     * @author: Log1c
     * @create: 2021-11-26 16:19
     **/
    // Set an array for the positions of components
    String[] border = {BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
    String[] buttonName = {"Center Button", "North Button", "South Button", "West Button", "East Button"};
    public BorderLayoutPosition(){
        setTitle("This window uses Border Layout");
        Container c = getContentPane();
        setLayout(new BorderLayout());
        for (int i=0; i<border.length; i++){
            c.add(border[i], new JButton(buttonName[i]));
        }
        setSize(350, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
