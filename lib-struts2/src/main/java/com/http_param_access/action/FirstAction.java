package com.http_param_access.action;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//org.apache.struts2.interceptor.ServletRequestAware
public class FirstAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware
{

    private ServletRequest request;
    private ServletResponse response;
    private ServletContext con;

    @Override
    public String execute() throws Exception
    {
        String username = request.getParameter("username");
        System.out.println(username);
        return "success";
    }

    public void setServletRequest(HttpServletRequest arg0)
    {
        request = arg0;

    }

    public void setServletResponse(HttpServletResponse arg0)
    {
        response = arg0;
    }

    public void setServletContext(ServletContext arg0)
    {
        con = arg0;
    }


}
