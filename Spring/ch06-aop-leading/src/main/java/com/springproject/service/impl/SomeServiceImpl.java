package com.springproject.service.impl;

import com.springproject.service.SomeService;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("业务方法doSome，计算商品购买金额");
    }

    @Override
    public void doOther() {
        System.out.println("业务方法doOther，消减库存");
    }
}
