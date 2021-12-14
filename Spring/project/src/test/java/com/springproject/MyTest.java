package com.springproject;

import com.springproject.service.SomeService;
import com.springproject.service.impl.OtherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    /**
     * @program: SpringProject
     * @description: The first test
     * @author: Log1c
     * @create: 2021-12-14 18:31
     **/

//    spring创建对象，调用的是类的哪个方法
//    默认使用无参构造方法创建
    @Test
    public void test01(){
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
//        SomeService service = ctx.getBean(SomeService.class);
//        service.doSome();

        SomeService service = (SomeService)ctx.getBean("someService");
        service.doSome();
    }

    /**
     * spring 是在什么时候创建的对象？
     * 在创建spring容器对象的时候，会读取配置文件，创建文件中声明的java对象
     * 优点：获取对象的速度快，因为对象已经创建好了
     * 缺点：占用内存
     */

    @Test
    public void test02() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
//        SomeService service = (SomeService) ctx.getBean("someService");
//        service.doSome();
    }

    /**
     * spring容器创建对象，一次创建几个？
     * 在创建容器对象时，会把配置文件中的所有对象都创建出来（spring默认规则）
     */
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
//        SomeService service = (SomeService) ctx.getBean("someService");
//        service.doSome();
    }

    /**
     * 获取容器中对象信息
     */
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
//        获取容器中定义对象的数量
        int nums = ctx.getBeanDefinitionCount();
        System.out.println("在容器中定义对象的数量: " + nums);
//        获取容器中定义对象的名称
        String[] names = ctx.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("容器中对象的名称: " + name);
        }

//        new Date();
    }

    /**
     * 让spring创建非自定义类的对象
     * 有class就能让spring创建对象
     */
    @Test
    public void test05() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Date date = (Date)ctx.getBean("mydate");
        System.out.println("date: " + date);

//        就算没有接口 也可以创建对象！
        OtherService other = (OtherService)ctx.getBean("otherService");
        other.doOther();
    }

}
