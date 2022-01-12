package com.springproject;

import com.springproject.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        // 没有加入代理的处理：
        // 1）目标方法执行时，没有切面的功能；
        // 2）service对象没有被改变；
//        SomeService service = (SomeService)ctx.getBean("someService");
//
//        // someService: com.springproject.service.impl.SomeServiceImpl
//        System.out.println("someService: " + service.getClass().getName());
//        service.doSome("lisi", 20);
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        // 加入代理的处理：
        // 1）目标方法执行时，有切面的功能；
        // 2）service对象是改变后的代理对象com.sun.proxy.$Proxy8；
        SomeService service = (SomeService)ctx.getBean("someService");
        // someService: com.sun.proxy.$Proxy8
        System.out.println("someService: " + service.getClass().getName());
        // 代理对象调用方法，才有切面功能的增强
        service.doSome("lisi", 20);
    }

    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService)ctx.getBean("someService");
//        System.out.println("someService: " + service.getClass().getName());
        service.doSome("lisi", 20);
        service.doOther();
    }
}
