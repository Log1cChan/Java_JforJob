package com.EnumerationandGeneric;

import java.util.*;

public class LimitClass<T extends List> {       // limit the type of generic
    /**
     * @program: Core
     * @description: A demo of limiting generic
     * @author: Log1c
     * @create: 2021-11-30 16:04
     **/
    public static void main(String[] args) {
        LimitClass<ArrayList> l1 = new LimitClass<ArrayList>();
        LimitClass<LinkedList> l2 = new LimitClass<LinkedList>();
        // previous code is ok
        // the code below is wrong, cos there's no List() in HashMap
//        LimitClass<HashMap> l3 = new LimitClass<HashMap>();
    }
}
