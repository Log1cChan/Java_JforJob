package com.sprinproject.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
     *
     *      属性： required: boolean类型属性，默认true
     *              true：spring在启动的时候，创建容器的时候，会检查引用类型是否赋值成功，
     *                      如果失败，会终止程序执行，并报错
     *              false：引用类型如果赋值失败，程序正常执行，但引用类型值为null
     *
     *          使用位置：1）在属性定义上面，无需set方法，推荐
     *                  2）在set方法上面，少用
     * byName 自动注入：
     * 1）@Autowired: 给引用类型赋值
     * 2）@Qualifier(value="bean的id"): 从容器中找到指定名称的对象，把这个对象赋值给引用类型
     */
    // byName
    @Autowired(required=false)
    @Qualifier("mySchoolAAA")
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
