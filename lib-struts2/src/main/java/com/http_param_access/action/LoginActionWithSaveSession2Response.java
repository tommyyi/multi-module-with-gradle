package com.http_param_access.action;

import com.pojo.Users;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginActionWithSaveSession2Response extends ActionSupport
{

    private String username;
    private String password;

    @Override
    public String execute() throws Exception
    {

        if (username.equals("admin") && password.equals("123"))
        {
            Users us = new Users();
            us.setUsername(username);
            us.setPassword(password);

            ServletRequest request = ServletActionContext.getRequest();
            HttpServletRequest req = (HttpServletRequest) request;
            HttpSession session = req.getSession();
            session.setAttribute("us", us);
            return "success";
        }
        else
        {
            return "fail";
        }

        //servletContext Ҳ����application����
        // ����������ֻҪ���������رգ���ô�����Ϣ��Զ����
        //		   ����Ϣ�Ǵ洢�ڷ������ڴ��еģ�һ�������������Ͻ���application����
        //���з���ģ����׵��·������ڴ�������������
        //��У����ϵͳ�� ֻ��Ҫע���û��Ϳ������ʹ�ã��û����Ӵ�
        // ÿ��ֻ����һ���⣬Ȼ�����걾�����Զ�������һ����Ŀ��
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
