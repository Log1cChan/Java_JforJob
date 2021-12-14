package com.ColletionClass;

import java.util.*;

public class UpdateStu2 {
    /**
     * @program: Core
     * @description: A demo of map and some methods of
     * @author: Log1c
     * @create: 2021-11-27 17:13
     **/
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "李同学");
        map.put("02", "魏同学");
        Set <String> set = map.keySet();        // all keys in map
        Iterator <String> it = set.iterator();
        System.out.println("All elements in Key: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collection <String> coll = map.values();    // all values in map
        it = coll.iterator();
        System.out.println("All elements in Value: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
