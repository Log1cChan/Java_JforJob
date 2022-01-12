package com.springproject.ba03;

public class School {
    /**
     * @program: SpringProject
     * @description:
     * @author: Log1c
     * @create: 2021-12-15 04:27
     **/
    private String name;
    private String adddress;

    public void setName(String name) {
        this.name = name;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", adddress='" + adddress + '\'' +
                '}';
    }
}
