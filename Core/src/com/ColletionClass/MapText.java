package com.ColletionClass;

import java.util.*;

public class MapText {
    /**
     * @program: Core
     * @description: Main class for testing
     * @author: Log1c
     * @create: 2021-11-27 17:23
     **/
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();  // Create a HashMap

        Emp emp = new Emp("351", "张三");
        Emp emp2 = new Emp("512", "李四");
        Emp emp3 = new Emp("853", "王一");
        Emp emp4 = new Emp("125", "赵六");
        Emp emp5 = new Emp("341", "黄七");

        map.put(emp4.getE_id(), emp4.getE_name());
        map.put(emp5.getE_id(), emp5.getE_name());
        map.put(emp.getE_id(), emp.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());

        Set <String> set = map.keySet();    // get key obj in Map
        Iterator <String> it = set.iterator();
        System.out.println("HashMap, Unordered: ");
        while (it.hasNext()){
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + " " + name);
        }

        TreeMap<String, String> treemap = new TreeMap<>();  // Create a TreeMap
        treemap.putAll(map);
        Iterator <String> iter = treemap.keySet().iterator();
        System.out.println("TreeMap, Ascending Order: ");
        while (iter.hasNext()){
            String str = (String)iter.next();
            String name = (String)treemap.get(str);
            System.out.println(str + " " + name);
        }
    }
}
