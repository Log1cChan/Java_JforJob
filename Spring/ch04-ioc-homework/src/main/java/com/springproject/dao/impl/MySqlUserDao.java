package com.springproject.dao.impl;

import com.springproject.dao.UserDao;
import com.springproject.domain.SysUser;
import org.springframework.stereotype.Repository;

// 表面对象是持久层对象
@Repository("mysqlDao")
public class MySqlUserDao implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("执行了数据库的insert()操作");
    }
}
