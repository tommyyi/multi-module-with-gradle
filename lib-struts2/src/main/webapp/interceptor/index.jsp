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
    <a href="<%=path %>/Users_add!add.action">添加</a><br>
    <a href="<%=path %>/Users_show!show.action">查看</a><br>
    <a href="<%=path %>/Users_update!update.action">修改</a><br>
    <a href="<%=path %>/Users_delete!delete.action">删除</a><br>
    <hr>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</hr>
    <a href="<%=path %>/News_add!add.action">添加</a><br>
    <a href="<%=path %>/News_show!show.action">查看</a><br>
    <a href="<%=path %>/News_update!update.action">修改</a><br>
    <a href="<%=path %>/News_delete!delete.action">删除</a><br>
    <a href="<%=path %>/loginAction.action">删除</a>
  </body>
</html>
