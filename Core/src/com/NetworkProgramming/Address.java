package com.NetworkProgramming;

import java.net.*;

public class Address {
    /**
     * @program: Core
     * @description: Use InetAddress to get some attr
     * @author: Log1c
     * @create: 2021-12-13 17:01
     **/
    public static void main(String[] args) {
        InetAddress ip;     // create its obj
        try{
            ip = InetAddress.getLocalHost();    // Instantiate obj
            String localName = ip.getHostName();    // get local host's name
            String localIp = ip.getHostAddress();   // get local host's IP addr
            System.out.println("Local Host's Name: " + localName);
            System.out.println("Local Host's Address: " + localIp);
//            getByName(String host); get the InetAddress obj by name
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
