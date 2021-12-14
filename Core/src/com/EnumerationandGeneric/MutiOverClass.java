package com.EnumerationandGeneric;

import java.util.*;

public class MutiOverClass<K, V> {
    /**
     * @program: Core
     * @description: A demo for using generic to set a container for collection
     * @author: Log1c
     * @create: 2021-11-30 15:02
     **/
    public Map<K, V> m = new HashMap<K, V>();
    public void put(K k, V v){
        m.put(k, v);
    }
    public V get(K k){
        return(m.get(k));
    }
    public static void main(String[] args) {
        MutiOverClass<Integer, String> mu = new MutiOverClass<Integer, String>();
        for (int i=0; i<5; i++){
            mu.put(i, "This is member" + i);
        }
        for (int i=0; i<mu.m.size(); i++){
            System.out.println(mu.get(i));
        }
    }
}
