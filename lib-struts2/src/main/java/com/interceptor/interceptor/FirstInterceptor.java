package com.interceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FirstInterceptor implements Interceptor {
	private String someThing;
	public void destroy() {

	}
	//初始化方法 当程序启动的时候拦截器就被初始化完毕了！
	public void init() {
		System.out.println(someThing+"拦截器启动了！");
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		//arg0.invoke() 让到达拦截器的请求继续前进，访问需要访问的资源
		// 放过去
		System.out.println("进入First拦截器");
		String returnName = arg0.invoke();
		System.out.println("走出First拦截器");
		return returnName;
	}


	public String getSomeThing() {
		return someThing;
	}
	public void setSomeThing(String someThing) {
		this.someThing = someThing;
	}


}
