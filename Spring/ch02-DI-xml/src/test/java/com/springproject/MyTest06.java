package com.springproject;

import com.springproject.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest06 {
    /**
     * @program: SpringProjectR
     * @description:
     * @author: Log1c
     * @create: 2021-12-15 04:31
     **/


    @Test
    public void test01(){
        String config = "ba06/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student)ctx.getBean("myStudent");
        System.out.println(student.toString());

    }
}
