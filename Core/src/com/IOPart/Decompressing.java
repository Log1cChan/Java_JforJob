package com.IOPart;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Decompressing {
    /**
     * @program: Core
     * @description: Decompress the file hello.zip
     * @author: Log1c
     * @create: 2021-11-29 13:16
     **/
    public static void main(String[] args) {
        File file = new File("hello.zip");
        ZipInputStream zin;
        try{
            ZipFile zipFile = new ZipFile(file);        // Create zip file obj
            zin = new ZipInputStream(new FileInputStream(file));    // instantiate and assign the file to decompress
            ZipEntry entry = zin.getNextEntry();    // Skip root cate, get next ZipEntry
            File tmp = new File("hello1.txt");
            if(!tmp.exists()){
                OutputStream os = new FileOutputStream(tmp);
                InputStream in = zipFile.getInputStream(entry);
                int count = 0;
                while ((count=in.read())!=-1){
                    os.write(count);
                }
                os.close();
                in.close();
            }
            zin.closeEntry();
            System.out.println("hello1.zip" + " Decompressed Succefully");

            File file1 = new File("hello1.txt");
            FileInputStream reader = new FileInputStream(file1);
            byte byt[] = new byte[1024];
            int len = reader.read(byt);
            System.out.println(new String(byt, 0, len));
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
