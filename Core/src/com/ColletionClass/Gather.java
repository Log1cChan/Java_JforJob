package com.ColletionClass;

import java.util.*;

public class Gather {
    /**
     * @program: Core
     * @description: A demo for the Collection implemented class: List
     * @author: Log1c
     * @create: 2021-11-26 23:40
     **/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*list.size());
        System.out.println("Randomly get a element from the list: " + list.get(i));
        list.remove(2);
        System.out.println("After removing the index 2: ");
        for (int j=0; j<list.size(); j++){
            System.out.println(list.get(j));
        }
    }
}
