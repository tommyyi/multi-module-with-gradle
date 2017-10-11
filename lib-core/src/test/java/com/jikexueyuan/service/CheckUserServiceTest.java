package com.jikexueyuan.service;

import com.jikexueyuan.entity.User;

import org.junit.Test;

/**
 * Created by 易剑锋 on 2017/9/28.
 */
public class CheckUserServiceTest
{
    @Test
    public void check() throws Exception
    {
        User user = new User();
        user.setName("Tom");
        user.setPassword("123456");
        CheckUserService checkUserService = new CheckUserService();
        checkUserService.check(user);
    }

}