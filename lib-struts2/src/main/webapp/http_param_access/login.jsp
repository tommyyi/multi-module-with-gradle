<%@ page import="com.pojo.Users" %>
<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    Users userInfo = getUserInfo(request);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>

how to get http parameters from servlet - <%=getUserName(userInfo)%><br><br>

<form action="<%=path %>/thirdAction.action" method="post">
    <%@ include file="login_with_username_and_password.jspf" %>
</form>

</body>
</html>
<%!
    private String getUserName(Users userInfo)
    {
        return userInfo != null ? userInfo.getUsername() : "no session";
    }

    private Users getUserInfo(HttpServletRequest request)
    {
        return (Users) request.getSession().getAttribute("userInfo");
    }
%>