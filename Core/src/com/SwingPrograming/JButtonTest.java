package com.SwingPrograming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame {
    /**
     * @program: Core
     * @description: A demo for JButton
     * @author: Log1c
     * @create: 2021-11-26 22:32
     **/
    public JButtonTest(){
        Container c = getContentPane();
        JButton jb = new JButton("Warning!");
        // add an Actionlistener to the button
        jb.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(null, "Pop out Dialog!");
           }
        });
        c.setLayout(null);
        jb.setBounds(150, 150, 100, 50);
        c.add(jb);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
