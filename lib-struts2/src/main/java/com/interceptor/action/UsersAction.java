package com.interceptor.action;

import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport{

	public String add() throws Exception {
		System.out.println("进入add方法");
		return "Userssuccess";
	}
	public String show() throws Exception {
		System.out.println("进入show方法");
		return "Userssuccess";
	}
	public String update() throws Exception {
		System.out.println("进入update方法");
		return "Userssuccess";
	}
	public String delete() throws Exception {
		System.out.println("进入delete方法");
		return "Userssuccess";
	}
}
