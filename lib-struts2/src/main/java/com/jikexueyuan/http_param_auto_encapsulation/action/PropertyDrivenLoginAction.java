package com.jikexueyuan.http_param_auto_encapsulation.action;

import com.opensymphony.xwork2.ActionSupport;

public class PropertyDrivenLoginAction extends ActionSupport
{
    private String username;
    private String password;

    @Override
    public String execute() throws Exception
    {
        System.out.println(username);
        System.out.println(password);

        return "success";
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


}
