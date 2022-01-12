package com.springproject;

import com.springproject.dao.UserDao;
import com.springproject.dao.impl.MySqlUserDao;
import com.springproject.domain.SysUser;
import com.springproject.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        String config = "ApplicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ctx.getBean("userService");
        SysUser user = new SysUser();
        user.setName("lisi");
        user.setAge(20);
        service.addUser(user);
    }
}
