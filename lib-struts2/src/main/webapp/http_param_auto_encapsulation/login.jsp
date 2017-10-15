<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
<h1>struts2提供的http参数的自动封装机制 </h1>
muserlogin
<form action="<%=path %>/propertyDrivenLoginAction.action" method="post">
    pusername:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="tijiao">
</form>

<h1>anther mode</h1>
<form action="<%=path %>/modelDrivenLoginAction.action" method="post">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="tijiao">
</form>

<h1>anther mode</h1>
<s:form namespace="/userlogin1" action="tagDrivenLoginAction" method="post">
    <s:textfield name="us.username"/>用户名：
    <s:password name="us.password"/>密码：
    <s:submit value="提交"/>
</s:form>
</body>
</html>
