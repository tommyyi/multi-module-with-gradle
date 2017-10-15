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
		<s:form action="login" method="post">
			
			<s:textfield label="用户名" name="em.eplId" />
			<s:password label="密码" name="em.userName" />
			<s:checkboxlist name="a" label="请选择你喜欢的图书" 
				list="#request.ar" />
<s:submit value="提交" />
		</s:form>

	</body>
</html>
