package com.springproject.service.impl;

import com.springproject.service.SomeService;

public class SomeServiceImpl implements SomeService {

//    spring默认使用无参构造创建对象，如果定义了有参构造，应再定义无参
    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl无参构造");
    }

    @Override
    public void doSome() {
        System.out.println("Run the doSome()");
    }
}
