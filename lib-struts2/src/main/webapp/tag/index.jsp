<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
    	<s:form action="slogin" method="post">
    		<s:textfield label="用户名" name="us.username"/>
    		<s:password label="密码" name="us.password"/>
    		
    		<s:checkboxlist name="hobby" label="爱好" list="{'打篮球','下棋','唱歌'}"/>
    		<s:checkboxlist name="hobby1" label="爱好" list="#{'1':'打篮球','2':'下棋','3':'唱歌'}"/>
    		
    		<s:radio name="hobby2" label="爱好" list="{'打篮球','下棋','唱歌'}"></s:radio>
    		<s:radio name="hobby3" label="爱好" list="#{'1':'打篮球','2':'下棋','3':'唱歌'}"/>
    		
    		<s:select name="hobby4" multiple="true" label="电视剧" list="#{'1':'爸爸去哪','2':'跑男','3':'唱歌'}"/>
    		<s:textarea name="xx" label="简述" rows="22" cols="50"/>
    		
    		<s:doubleselect  
    		list="{'我爱西红柿','我爱番茄'}" 
    		doubleList="top=='我爱西红柿'?{'斗破苍穹','xx修仙传'}:{'斗破宇宙','斗牛'}" doubleName="作者" name=""/>
    		
    		<s:optiontransferselect 
    		label="喜欢的书"
    		name="cnbook"
    		leftTitle="中文书籍"
    		list="#{'1':'java编程思想','2':'企业实战'}"
    		listKey="key"
    		listValue="value"
    		multiple="true"
    		emptyOption="true"
    		rightTitle="英文书籍"
    		headerKey="cnKey"
    		headerValue="请选择中文书籍"
    		 doubleList="#{'1':'my world','2':'apple'}" 
    		 doubleListKey="key"
    		 doubleListValue="value"
    		 doubleHeaderKey="enKey"
    		 doubleHeaderValue="请选择英文书籍"
    		 doubleMultiple="true"
    		 doubleEmptyOption="true"
    		  doubleName="enbook"  />
    		
    		<s:submit value="提交"/>
    	</s:form>
  </body>
</html>
