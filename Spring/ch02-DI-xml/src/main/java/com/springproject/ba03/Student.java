package com.springproject.ba03;

public class Student {
    /**
     * @program: SpringProject
     * @description: Test Student Class
     * @author: Log1c
     * @create: 2021-12-14 21:38
     **/

    private String name;
    private int age;
    // 引用类型
    private School school;

    public Student() {
        System.out.println("Student 无参构造方法");
    }

//    创建有参数构造方法
    public Student(String myname, int myage, School mySchool){
//        赋值
        this.name = myname;
        this.age = myage;
        this.school = mySchool;
        System.out.println("Student有参数构造方法" + this.toString());
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
