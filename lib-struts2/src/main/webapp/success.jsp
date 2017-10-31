<%@ page import="com.pojo.Users" %>
<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    Users userInfo = (Users) request.getSession().getAttribute("userInfo");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
<%=userInfo.getUsername()%>成功登录! <br> <br>
<<a href="http://localhost:8080/struts2/http_param_access/login.jsp">login again</a>
</body>
</html>
