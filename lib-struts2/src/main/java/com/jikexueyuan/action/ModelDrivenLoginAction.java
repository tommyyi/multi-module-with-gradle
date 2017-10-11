package com.jikexueyuan.action;

import com.jikexueyuan.pojo.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelDrivenLoginAction extends ActionSupport implements ModelDriven<Users>
{
    private Users us = new Users();

    @Override
    public String execute() throws Exception
    {
        System.out.println(us.getUsername());
        System.out.println(us.getPassword());
        return "success";
    }

    public Users getModel()
    {
        return us;
    }
}
