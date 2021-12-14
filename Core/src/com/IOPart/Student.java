package com.IOPart;

import java.io.*;

public class Student {
    /**
     * @program: Core
     * @description: A demo for BufferedReader
     * @author: Log1c
     * @create: 2021-11-29 12:21
     **/
    public static void main(String[] args) {
        String content[] = {"Long time no see", "How are you?", "Keep in touch!"};
        File file = new File("word.txt");
        try {
            FileWriter fw = new FileWriter(file);   // create FileWriter as obj
            BufferedWriter bufw = new BufferedWriter(fw);   // create BufferedWriter obj
            for (int k=0; k<content.length; k++){
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            while ((s = bufr.readLine())!=null){
                i++;
                System.out.println("Line No." + i + ": " + s);
            }
            bufr.close();
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
