package com.NetworkProgramming;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class MyClient extends JFrame {
    /**
     * @program: Core
     * @description: A Client for class MyTcp
     * @author: Log1c
     * @create: 2021-12-13 17:22
     **/
    private PrintWriter writer;
    Socket socket;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;
    
    public MyClient(String title){
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cc = this.getContentPane();
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf, "South");
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                writer.println(tf.getText());
                ta.append(tf.getText() + "\n");
                ta.setSelectionEnd(ta.getText().length());
                tf.setText("");
            }
        });
    }

    private void connect(){
        ta.append("Trying to connect...\n");
        try{
            socket = new Socket("localhost ", 8998);
            writer = new PrintWriter(socket.getOutputStream(), true);
            ta.append(socket.getInetAddress().getHostName() + "Connected\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyClient client = new MyClient("Send message to the Server");
        client.setSize(300, 300);
        client.setVisible(true);
        client.connect();
    }
}
