<%@ page language="java" import="com.pojo.Users" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
<% Users us = (Users) session.getAttribute("us"); %>
登陆成功！欢迎<%=us.getUsername() %>用户登录;
<br>
</body>
</html>
