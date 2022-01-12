package com.sprinproject.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")

public class Student {
//  使用外部属性文件中的数据，语法：@Value$("{key}")
    @Value("${myname}")
    private String name;
//    @Value(value="20")
    @Value("${myage}")
    private int age;

    /**
     * 引用类型
     * @Autowired: spring框架提供的，给引用类型赋值的，使用自动注入原理，支持byName,byType, 默认是byType
     *          使用位置：1）在属性定义上面，无需set方法，推荐
     *                  2）在set方法上面，少用
     */
    // 默认byType
    @Autowired
    private School school;

    public Student(){
        System.out.println("Student类无参数构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
