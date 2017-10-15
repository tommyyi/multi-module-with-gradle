package com.jikexueyuan.http_param_access.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ThirdAction extends ActionSupport
{
    @Override
    public String execute() throws Exception
    {

        ActionContext actionContext = ActionContext.getContext();

        ServletRequest request = (ServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);
        ServletResponse response = (ServletResponse) actionContext.get(ServletActionContext.HTTP_RESPONSE);
        ServletContext con = (ServletContext) actionContext.get(ServletActionContext.SERVLET_CONTEXT);

        String username = request.getParameter("username");
        System.out.println("第三个action    " + username);

        return "success";
    }
}
