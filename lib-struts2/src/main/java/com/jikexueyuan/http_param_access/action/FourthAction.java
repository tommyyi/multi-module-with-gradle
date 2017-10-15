package com.jikexueyuan.http_param_access.action;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FourthAction extends ActionSupport
{
    @Override
    public String execute() throws Exception
    {

        ServletRequest request = ServletActionContext.getRequest();
        ServletResponse response = ServletActionContext.getResponse();
        ServletContext con = ServletActionContext.getServletContext();

        String username = request.getParameter("username");
        System.out.println("第四种：   " + username);

        return "success";
    }
}
