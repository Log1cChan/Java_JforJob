package com.NetworkProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Receive extends JFrame implements Runnable, ActionListener {
    /**
     * @program: Core
     * @description: A demo of UDP, receive the packet sent by Weather
     * @author: Log1c
     * @create: 2021-12-13 18:07
     **/
    int port;
    InetAddress group = null;
    MulticastSocket socket = null;
    JButton ince = new JButton("Start Receiving");
    JButton stop = new JButton("Stop Receiving");
    JTextArea inceAr = new JTextArea(10, 10);
    JTextArea inced = new JTextArea(10, 10);
    Thread thread;
    boolean b = false;

    public Receive(){
        super("Broadcast");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);
        ince.addActionListener(this);
        stop.addActionListener(this);
        inceAr.setForeground(Color.blue);
        JPanel north = new JPanel();
        north.add(ince);
        north.add(stop);
        add(north, BorderLayout.NORTH);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(1, 2));
        center.add(inceAr);
        center.add(inced);
        add(center, BorderLayout.CENTER);
        validate();     // refresh
        port = 9898;
        try{
            group = InetAddress.getByName("224.255.10.0");
            socket = new MulticastSocket(port);
            socket.joinGroup(group);
        }catch(Exception e){
            e.printStackTrace();
        }
        setBounds(100, 50, 360, 380);
        setVisible(true);
    }

    public void run(){
        while(true){
            byte data[] = new byte[1024];
            DatagramPacket packet = null;
            packet = new DatagramPacket(data, data.length, group, port);
            try{
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                inceAr.setText("Receiving Message: \n" + message);
                inced.append(message + "\n");
            }catch(Exception e){
                e.printStackTrace();
            }
            if(b == true){
                break;
            }
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == ince){
            ince.setForeground(Color.red);
            stop.setForeground(Color.yellow);
            if (!thread.isAlive()){
                thread = new Thread(this);
            }
            thread.start();
            b = false;
        }
        if(e.getSource() == stop){
            ince.setForeground(Color.yellow);
            stop.setForeground(Color.red);
            b = true;
        }
    }

    public static void main(String[] args) {
        Receive rec = new Receive();
        rec.setSize(460, 200);
    }
}
