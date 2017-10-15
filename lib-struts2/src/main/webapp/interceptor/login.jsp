<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
   	<form action="<%=path %>/loginAction.action" method="post">
   		<input type="text" name="username"/>
   		<br>
   		<input type="submit" value="tijiao"/>
   	</form>
   	
   	<a href="<%=path %>/salaryAction!add.action">add</a>
   	<a href="<%=path %>/salaryAction!show.action">show</a>
   	<a href="<%=path %>/salaryAction!update.action">update</a>
  </body>
</html>
