package com.jikexueyuan.http_param_auto_encapsulation.action;

import com.jikexueyuan.pojo.Users;
import com.opensymphony.xwork2.ActionSupport;

public class TagDrivenLoginAction extends ActionSupport
{
    private Users us;

    @Override
    public String execute() throws Exception
    {
        System.out.println("标签实现");
        System.out.println(us.getUsername());
        System.out.println(us.getPassword());
        return "success";
    }

    public Users getUs()
    {
        return us;
    }

    public void setUs(Users us)
    {
        this.us = us;
    }
}
