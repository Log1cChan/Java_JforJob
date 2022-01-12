package com.springproject.ba01;

public class Student {
    /**
     * @program: SpringProject
     * @description: Test Student Class
     * @author: Log1c
     * @create: 2021-12-14 21:38
     **/

    private String name;
    private int age;

    public Student() {
        System.out.println("Student 无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName: " + name);
        this.name = "Hello" + name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge: " + age);
        this.age = age;
    }

    public void setEmail(String email){ // email属性 <property name="email" value="lisi@qq.com" />
        System.out.println("setEmail: " + email ) ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
