package com.springproject.proxy;

import com.springproject.service.SomeService;
import com.springproject.service.impl.SomeServiceImpl;

import java.util.Date;

// 调用ServiceProxy的时候，调用真正的目标方法
// 调用目标方法时，增加了一些功能
// ServiceProxy 叫做代理，代理对目标的操作

public class ServiceProxy implements SomeService {

    SomeService target = new SomeServiceImpl();

    @Override
    public void doSome() {
        System.out.println("日志功能：记录方法执行时间：" + new Date());
        target.doSome();
        System.out.println("事务功能：在业务方法之后提交事务");
    }

    @Override
    public void doOther() {
        target.doOther();
    }
}


