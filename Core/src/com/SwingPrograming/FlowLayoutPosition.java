package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    /**
     * @program: Core
     * @description: A demo of Flow Layout
     * @author: Log1c
     * @create: 2021-11-26 16:12
     **/
    public FlowLayoutPosition(){
        setTitle("This window uses Flow Layout");
        Container c = getContentPane();
        setLayout(new FlowLayout(2, 10, 10));
        for (int i=0; i<10; i++){
            c.add(new JButton("Button" + i));
        }
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
