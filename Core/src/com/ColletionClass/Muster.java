package com.ColletionClass;

import java.util.*;

public class Muster {
    /**
     * @program: Core
     * @description: A demo of Iterator
     * @author: Log1c
     * @create: 2021-11-26 22:48
     **/
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator(); // Construct a Iterator
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
