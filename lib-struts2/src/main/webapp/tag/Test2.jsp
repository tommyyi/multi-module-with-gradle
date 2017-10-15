<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.jikexueyuan.bean.Em"%>
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
  		<% //request.setAttribute("age",60); %>
  		<!-- 向pageContext，request中放入名称为age的 值为61 -->
    	<s:set name="age" value="61"  />
    	<s:set name="age1" value="62" scope="session" />
    	<s:set name="age1" value="63" scope="application" />
    	<%=application.getAttribute("age1") %>
    	<s:set name="ageList" value="{'66','70','80'}"/>
    	<s:set name="bookList" value="{'斗破苍穹','凡人修仙传','吞噬天空'}"/>
    	<s:set name="bookMap" value="#{'1':'斗破苍穹','2':'凡人修仙传','3':'吞噬天空'}"/>
    	<s:select label="书籍" list="#bookList"/>
    	<s:select label="书籍map" list="#bookMap" listKey="key" listValue="value"/>
  		
  		<s:property value="#session.age1" />
  		<s:property value="#bookList"/>
  		<s:property value="#bookList[1]"/>
  		<s:property value="#bookMap.keys"/>
  		<s:property value="#bookMap.values"/>
  		
  		<s:set name="score" value="20"/>
  		<s:if test="#score>=60">
  			及格
  		</s:if>
  		<s:elseif test="#score>30">
  			学渣
  		</s:elseif>
  		<s:else>
  			学渣渣
  		</s:else>
  		<br>
  		<s:iterator value="#bookList" id="bookName">
  			<s:property value="bookName"/>
  		</s:iterator>
  		
  		<s:iterator value="#bookMap" >
  			<s:property value="key"/>
  			<s:property value="value"/><br>
  		</s:iterator>
  		<!-- 模拟 从action中传递过来一个 集合 集合中是对象 -->
  		<% 
  			List<Em> list = new ArrayList<Em>();
  			Em em1 = new Em(1,"赵铁锤");
  			Em em2 = new Em(2,"赵铜锤");
  			Em em3 = new Em(3,"赵钢锤");
  			Em em4 = new Em(4,"赵锡锤");
  		
  			list.add(em1);
  			list.add(em2);
  			list.add(em3);
  			list.add(em4);
  			
  			request.setAttribute("listt",list);
  		%>
  		<!--  ?^$ .{$#this.eplId>2} -->
  		<s:iterator value="#request.listt" var="em"
  			status="st"
  		><br>
  			<s:if test="#st.index%2==0"><br></s:if>
  			当前行号：<s:property value="#st.index"/>
  			是否是第一条：<s:property value="#st.first"/>
  			是否是最后一条<s:property value="#st.last"/>
  			计数走到第几个了<s:property value="#st.count"/>
  			是否是奇数行<s:property value="#st.odd"/>
  			是否是偶数行<s:property value="#st.even"/>
  			<s:property value="#em.eplId"/>
  			<s:property value="#em.userName"/>
  		</s:iterator>
  		
  </body>
</html>
