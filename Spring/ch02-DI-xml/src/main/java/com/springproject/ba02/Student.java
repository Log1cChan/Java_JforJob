package com.springproject.ba02;

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

    public void setSchool(School school) {
        System.out.println("setSchool: " + school);
        this.school = school;
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
