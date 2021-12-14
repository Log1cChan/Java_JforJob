package com.IOPart;

import java.io.*;

public class FileTest1 {
    /**
     * @program: Core
     * @description: A demo for FileInputStream and Ops
     * @author: Log1c
     * @create: 2021-11-28 14:54
     **/
    public static void main(String[] args) {
        File file = new File("word.txt");
        try{
            FileOutputStream out = new FileOutputStream(file);  // create a FileOutputStream obj
            byte buy[] = "Hola, mi amigo, bunos dias!".getBytes();  // create a byte array
            out.write(buy);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);             // read from file
            System.out.println("The message in the file: " + new String(byt, 0, len));
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
