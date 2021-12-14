package com.NetworkProgramming;

import java.net.*;

public class Weather extends Thread{
    /**
     * @program: Core
     * @description: Broadcast program, demo of UDP
     * @author: Log1c
     * @create: 2021-12-13 17:56
     **/
    String weather = "Show Forecast: There will be a show at 8 p.m.";
    int port = 9898;
    InetAddress iaddress = null;
    MulticastSocket socket = null;
    Weather() {
        try{
            iaddress = InetAddress.getByName("224.255.10.0");
            socket = new MulticastSocket(port);
            socket.setTimeToLive(1);    // Area is local network
            socket.joinGroup(iaddress); // join the broadcast group
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void run(){
        while (true){
            DatagramPacket packet = null;
            byte data[] = weather.getBytes();
            packet = new DatagramPacket(data, data.length, iaddress, port);
            System.out.println(new String(data));
            try{
                socket.send(packet);
                sleep(3000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Weather w = new Weather();
        w.start();
    }
}
