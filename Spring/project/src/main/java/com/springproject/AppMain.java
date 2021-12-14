package com.springproject;

import com.springproject.service.SomeService;
import com.springproject.service.impl.SomeServiceImpl;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    /**
     * @program: SpringProject
     * @description: Main Method
     * @author: Log1c
     * @create: 2021-12-14 18:08
     **/

    public static void main(String[] args) {
//        SomeService service = new SomeServiceImpl();
//        service.doSome();

//        使用spring管理对象
//        1. 指定spring配置文件: 从类路径(classpath)之下开始的路径
        String config = "beans.xml";
//        2. 创建容器对象 ApplicationContext表示spring容器对象，通过ctx获取某个java对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
//        3. 从容器中获取指定名称的对象，使用呢getBean(id)
        SomeService service = (SomeService)ctx.getBean("someService");
//        4. 调用对象方法
        service.doSome();
    }
}
