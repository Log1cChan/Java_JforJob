package com.springproject;

import com.springproject.ba02.School;
import com.springproject.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    /**
     * @program: SpringProject
     * @description:
     * @author: Log1c
     * @create: 2021-12-15 04:31
     **/

    @Test
    public void test01(){
        Student student = new Student();
        student.setName("lisi");
        student.setAge(20);
        School school = new School();
        school.setName("北京大学");
        school.setAdddress("北京海淀区");

        student.setSchool(school);
        System.out.println(student.toString());
    }

    @Test
    public void test02(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student)ctx.getBean("myStudent");
        System.out.println(student.toString());
    }
}
