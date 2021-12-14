package com.IOPart;

import java.io.*;

public class Example_01 {
    /**
     * @program: Core
     * @description: Use DataInput/OutputStream
     * @author: Log1c
     * @create: 2021-11-29 12:33
     **/
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("word.txt");
            DataOutputStream ds = new DataOutputStream(fs);

            ds.writeUTF("Use writeUTF() to write in");
            ds.writeChars("Use writeChars() to write in");
            ds.writeBytes("Use writeBytes() to write in");
            ds.close();
            FileInputStream fis = new FileInputStream("word.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
