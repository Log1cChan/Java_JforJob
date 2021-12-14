package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog{
    public MyJDialog(MyFrame frame){
        super(frame, "First JDialog", true);
        Container container = getContentPane();
        container.add(new JLabel("This is a Dialog"));
        setBounds(120, 120, 100, 100);
        setSize(200, 200);
    }
}

public class MyFrame extends JFrame{
    /**
     * @program: Core
     * @description: Example of JDialog
     * @author: Log1c
     * @create: 2021-11-24 20:22
     **/
    public static void main(String[] args) {
        new MyFrame();
    }
    public MyFrame(){
        Container container = getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("This is a JFrame");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton jb = new JButton("POPOUT");
        jb.setBounds(200, 200, 100, 50);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(jb);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
