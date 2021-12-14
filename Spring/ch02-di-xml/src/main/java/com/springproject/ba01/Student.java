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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
