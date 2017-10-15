<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

	</head>

	<body>
		<s:form action="sloginAction" method="post">

			<s:textfield label="用户名" name="us.username" />
			<s:password label="密码" name="us.password" />
			<s:checkboxlist name="a" label="请选择你喜欢的图书" 
				list="{'Java编程思想','J2EE企业应用实战'}" />
			<s:checkboxlist name="b" label="请选择你喜欢的图书" 
				list="#{'1':'song', '2':'li', '3':'xing'}" listKey="key"
				listValue="value" />
			<s:select name="a" label="请选择你喜欢的图书" 
				 list="{'Java编程思想','J2EE企业应用实战'}" />
			<s:select name="b" label="请选择你喜欢的图书" 
				multiple="true"
				list="#{'Java编程思想':'2012年8月','J2EE企业应用实战':'2012年9月'}" listKey="key"
				listValue="value" />

			<s:radio name="a" label="请选择你喜欢的图书" 
				list="{'Java编程思想','J2EE企业应用实战'}" />
			<s:radio name="b" label="请选择你喜欢的图书" 
				list="#{'Java编程思想':'2012年8月','J2EE企业应用实战':'2012年9月'}" listKey="key"
				listValue="value" />
				
				<s:textarea label="多行文本" rows="8" cols="30"  name="us.password" />
				
			<s:doubleselect label="请选择你喜欢的图书"   
			doubleName="author" list="{'李刚','David'}" 
			doubleList="top=='李刚'?
			{'Struts2权威指南','轻量级Java EE企业应用实战'}:
			{'Java编程思想','23种设计模式'}"/>
			
			<s:optiontransferselect 
                label="请选择你喜欢的图书"
                name="cnbook"
                leftTitle="中文图书"
                rightTitle="外文图书"
                list="#{'Java编程思想':'2012年8月','J2EE企业应用实战':'2012年9月'}"
                listKey="value"
                listValue="key"
                multiple="true"
                
                headerKey="cnKey"
                headerValue="---选择中文图书---"
                emptyOption="true"
                doubleList="#{'Java smart':'2012年8月','Struts2':'2012年9月'}"
                doubleListKey = "value"
                doubleListValue = "key"
                doubleName="enBook"
                doubleHeaderKey="enKey"
                doubleHeaderValue="---选择外文图书---"
                doubleEmptyOption="true"
                doubleMultiple="true"
/>
			
			<s:submit value="提交" />

		</s:form>

	</body>
</html>
