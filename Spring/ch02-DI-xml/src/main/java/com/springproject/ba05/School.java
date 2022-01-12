package com.springproject.ba05;

public class School {
    /**
     * @program: SpringProject
     * @description:
     * @author: Log1c
     * @create: 2021-12-15 04:27
     **/
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
