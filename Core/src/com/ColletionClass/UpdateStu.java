package com.ColletionClass;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object>{ // implement the interface
    /**
     * @program: Core
     * @description: A demo of Set, implements Comparable interface and rewrites the compareTo() method.
     * @author: Log1c
     * @create: 2021-11-26 23:51
     **/
    String name;
    long id;

    public UpdateStu(String name, long id){     // Construction Method
        this.id = id;
        this.name = name;
    }

    // If store in TreeSet, must implement Comparable interface.
    // the func below is used to compare the obj to assigned obj.
    @Override
    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1 : (id==upstu.id ? 0 : -1);
        return result;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同学", 01011);
        UpdateStu stu2 = new UpdateStu("陈同学", 01021);
        UpdateStu stu3 = new UpdateStu("王同学", 01051);
        UpdateStu stu4 = new UpdateStu("马同学", 01012);
        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<UpdateStu> it = tree.iterator();   // Create a iterator for all the elements inside Set
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.headSet(stu2).iterator();     // get all previous objs of stu2
        System.out.println("Previous elements of stu2: ");
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.subSet(stu2, stu3).iterator();    // get elements between
        System.out.println("Elements between stu2&3: ");
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
    }
}
