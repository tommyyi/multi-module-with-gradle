package com.interceptor.action;

import com.opensymphony.xwork2.ActionSupport;

public class SalaryAction extends ActionSupport{
	public String add() throws Exception {
		System.out.println("进入SalaryAction add方法");
		return SUCCESS;
	}
	public String show() throws Exception {
		System.out.println("进入SalaryAction show方法");
		return SUCCESS;
	}
	public String update() throws Exception {
		System.out.println("进入SalaryAction update方法");
		return SUCCESS;
	}
	public String delete() throws Exception {
		System.out.println("进入SalaryAction delete方法");
		return SUCCESS;
	}
}
