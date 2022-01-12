package com.springproject;

import com.springproject.ba03.School;
import com.springproject.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;


public class MyTest03 {
    /**
     * @program: SpringProject
     * @description:
     * @author: Log1c
     * @create: 2021-12-15 04:31
     **/


    @Test
    public void test01(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student)ctx.getBean("myStudent");
        System.out.println(student.toString());
        Student student2 = (Student)ctx.getBean("myStudent2");
        System.out.println(student2.toString());
        Student student3 = (Student)ctx.getBean("myStudent3");
        System.out.println(student3.toString());

//        获取File对象
        File file = (File)ctx.getBean("myFile");
        System.out.println("file.canRead(): " + file.canRead());// 判断路径时写的

//        私加入
//        try {
//            FileReader reader = new FileReader(file);
//            BufferedReader out = new BufferedReader(reader);
//            System.out.println(out.readLine());
//
//            FileInputStream in = new FileInputStream(file);
//            byte[] byt = new byte[1024];
//            int len = in.read(byt);
//            System.out.println(new String(byt, 0, len));
//        }catch(Exception e){
//            e.printStackTrace();
//        }




    }
}
