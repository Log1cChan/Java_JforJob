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

        // 执行环绕通知目标方法时，执行的是myAround()
        String ret = service.doFirst("lisi");
        System.out.println("调用目标方法的结果==" + ret);
    }

//    @Test
//    public void testString(){
//        String s1 = "abcd";
//        String s2 = "abcd";
//        String s3 = new String("abcd");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
//    }
}
