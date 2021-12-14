package com.IOPart;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
    /**
     * @program: Core
     * @description: Compress the hello.txt
     * @author: Log1c
     * @create: 2021-11-29 12:49
     **/
    private void zip(String zipFilename, File inputFile)throws Exception{
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFilename));   // create ZipOutputStream obj
        zip(out, inputFile, inputFile.getName());
        System.out.println("Compressing");
        out.close();
    }

    private void zip(ZipOutputStream out, File f, String base)throws Exception{
        if(f.isDirectory()){        // if the path is a cate
            File[] fl = f.listFiles();      // get path array
            if (base.length() != 0){
                out.putNextEntry(new ZipEntry(base+"/"));
            }
            for (int i=0; i<fl.length; i++){
                zip(out, fl[i], base + fl[i].getName());
            }
        }else{
            out.putNextEntry(new ZipEntry(base));       // create new entry point
            FileInputStream in = new FileInputStream(f);
            int b;
            System.out.println(base);
            while((b=in.read()) != -1){   // if not get to tail
                out.write(b);
            }
            in.close();
        }
    }

    public static void main(String[] args) {
        MyZip book = new MyZip();
        try {
            book.zip("hello.zip", new File("hello.txt"));
            System.out.println("Compress Finished!");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
