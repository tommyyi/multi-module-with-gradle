<%@ page language="java" pageEncoding="ISO-8859-1" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
<form action="<%=path %>/thirdAction.action" method="post">
    username:<input type="text" name="username"/> <br>
    password:<input type="password" name="password"/> <br>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
