package com.ColletionClass;

public class Emp {
    /**
     * @program: Core
     * @description: A class used in MapText
     * @author: Log1c
     * @create: 2021-11-27 17:21
     **/
    private String e_id;
    private String e_name;
    public Emp(String e_id, String e_name){
        this.e_id = e_id;
        this.e_name = e_name;
    }

    public String getE_id() {
        return e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }
}
