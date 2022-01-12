package com.springproject;

import com.springproject.proxy.ServiceProxy;
import com.springproject.service.SomeService;
import com.springproject.service.impl.SomeServiceImpl;
import org.junit.Test;

public class MyTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
        System.out.println("======================================================");
        service.doOther();
    }

    @Test
    public void test02(){
        SomeService service = new ServiceProxy();
        service.doSome();
    }
}
