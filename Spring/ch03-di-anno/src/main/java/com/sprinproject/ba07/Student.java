package com.sprinproject.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


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
     * @Resource：来自jdk中，给引用类型赋值，支持byName, byType，默认byName
     *              spring支持这个注解的使用
     *       位置：1）属性定义上面，无需set，推荐
     *            2）set方法上面
     * 说明：使用jdk1.8，带有这个注解，但高于1.8则没有，需要加入依赖
     *     <dependency>
     *       <groupId>javax.annotation</groupId>
     *       <artifactId>javax.annotation-api</artifactId>
     *       <version>1.3.2</version>
     *     </dependency>
     *
     * @Resource只使用byName赋值
     *      使用注解属性name="bean的id"
     */
    // 值使用byName
    @Resource(name="mySchool")
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
