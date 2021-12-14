package com.IOPart;

import java.io.*;

public class FileTest {
    /**
     * @program: Core
     * @description: A demo for File
     * @author: Log1c
     * @create: 2021-11-27 18:17
     **/
    public static void main(String[] args) throws IOException {
//        File file = new File("word.txt");       // create a file obj
//        if (file.exists()){                              // If the file exist
//            file.delete();
//            System.out.println("The file has been deleted");
//        }else{
//            try{
//                file.createNewFile();
//                System.out.println("The file has been created");
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }


        File file = new File("word.txt");   // create a File obj
        if (file.exists()){                         // if the file exists
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println("File name: " + name);
            System.out.println("File length: " + length);
            System.out.println("Is hidden? " + hidden);
        }else{
            System.out.println("No such file");
        }
    }
}
