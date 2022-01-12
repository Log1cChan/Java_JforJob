package com.springproject.service.impl;

import com.springproject.dao.UserDao;
import com.springproject.domain.SysUser;
import com.springproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

//    @Autowired
    @Resource
    private UserDao userDao = null;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(SysUser user) {
        userDao.insertUser(user);
    }
    /**
     * @program: SpringProject
     * @description:
     * @author: Log1c
     * @create: 2021-12-15 16:44
     **/
}
