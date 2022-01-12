package com.springproject;

import com.springproject.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService)ctx.getBean("someService");
        String ret = service.doOther("zhangsan", 22);
        System.out.println("test02 调用目标方法时也会返回执行结果：" + ret);
    }
}
