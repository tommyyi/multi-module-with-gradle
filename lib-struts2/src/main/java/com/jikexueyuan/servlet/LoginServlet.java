package com.jikexueyuan.servlet;

import com.jikexueyuan.pojo.Users;

public class LoginServlet extends BaseServlet {
	//http://www.jikexueyuan.com/course/530.html

	private Users us = new Users();


	public String execute() throws Exception {
		System.out.println("自动封装数据后的结果：");
		System.out.println(us.getUsername());
		System.out.println(us.getPassword());
		return "/success.jsp";
	}

	public Users getModel() {
		// TODO Auto-generated method stub
		return us;
	}


}
