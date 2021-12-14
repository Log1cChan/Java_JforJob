package com.NetworkProgramming;

import java.io.*;
import java.net.*;

public class MyTcp {
    /**
     * @program: Core
     * @description: A TCP Server, get Client's message
     * @author: Log1c
     * @create: 2021-12-13 17:13
     **/
    private BufferedReader reader;
    private ServerSocket server;
    private Socket socket;

    void getServer(){
        try{
            server = new ServerSocket(8998);       // Instantiate Socket obj
            System.out.println("Successfully create ServerSocket");
            while (true){
                System.out.println("Waiting for Client...");
                socket = server.accept();       // Instantiate Socket obj
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));        // instantiate
                getClientMessage();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void getClientMessage(){
        try{
            while(true){
                System.out.println("Client: " + reader.readLine()); // get Client's message
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            if(reader!=null){
                reader.close();
            }
            if(socket!=null){
                socket.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTcp tcp = new MyTcp();
        tcp.getServer();
    }
}
