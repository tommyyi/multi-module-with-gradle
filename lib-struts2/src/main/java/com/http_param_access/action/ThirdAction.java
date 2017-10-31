package com.http_param_access.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pojo.Users;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ThirdAction extends ActionSupport implements ModelDriven<Users>
{

    private Users mUsers = new Users();

    @Override
    public String execute() throws Exception
    {

        ActionContext actionContext = ActionContext.getContext();

        ServletRequest request = (ServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);
        ServletResponse response = (ServletResponse) actionContext.get(ServletActionContext.HTTP_RESPONSE);
        ServletContext con = (ServletContext) actionContext.get(ServletActionContext.SERVLET_CONTEXT);

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("第三个action    " + mUsers.getUsername());
        HttpSession httpSession = ((HttpServletRequest) request).getSession();
        String httpSessionId = httpSession.getId();
        httpSession.setAttribute("userInfo", mUsers);

        return "success";
    }

    @Override
    public Users getModel()
    {
        return mUsers;
    }
}
