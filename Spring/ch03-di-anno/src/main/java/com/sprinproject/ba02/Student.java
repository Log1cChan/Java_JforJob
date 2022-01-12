package com.sprinproject.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")

public class Student {
    /**
     * 简单类型的属性赋值：@Value
     * @Value: 简单类型属性赋值
     *      属性：value 简单类型属性值
     *      位置： 1）在属性定义的上面，无需set方法，推荐使用
     *            2）在set方法的上面
     */
//    @Value(value="李四")

//  使用外部属性文件中的数据，语法：@Value$("{key}")
    @Value("${myname}")
    private String name;
//    @Value(value="20")
    @Value("${myage}")
    private int age;

    public Student(){
        System.out.println("Student类无参数构造方法");
    }
//    @Value(value="张三")
    public void setName(String name) {
        System.out.println("setName: " + name);
        this.name = name;
    }
//    @Value(value="22")
    public void setAge(int age) {
        System.out.println("setAge: " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
