<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.tag.bean.Dep"%>
<%@page import="com.tag.bean.Em"%>

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
<STYLE type="text/css">  

                .doubleselect br{  
                    display:none;  
                }  
            </STYLE>  
	</head>

	<body>
		<%
Map<Dep, List<Em>> map = new HashMap<Dep, List<Em>>();//map集合,key映射部门,value映射该部门下的员工
		Dep de1 = new Dep(1,"市场部");
		Dep de2 = new Dep(2,"销售部");
		Dep de3 = new Dep(3,"营销部");
		
		Em em1 = new Em(1,"赵大锤1");
		Em em2 = new Em(2,"赵大锤2");
		Em em3 = new Em(3,"赵大锤3");
		Em em4 = new Em(4,"赵大锤4");
		Em em5 = new Em(5,"赵大锤5");
		Em em6 = new Em(6,"赵大锤6");
		Em em7 = new Em(7,"赵大锤7");
		
		List li1 = new ArrayList();
		List li2 = new ArrayList();
		List li3 = new ArrayList();
		li1.add(em1);
		li1.add(em2);
		li1.add(em3);
		li2.add(em4);
		li2.add(em5);
		li3.add(em6);
		li3.add(em7);
		map.put(de1,li1);
		map.put(de2,li2);
		map.put(de3,li3);
		request.setAttribute("map", map);
%>
		<div class="doubleselect">
		<s:form action="doubleSelectPost" name="form1">  
            <s:doubleselect   
                formName="form1"   
                label="业务员"  
                list="#request.map.keySet()"  
                name="dptId"  
                id="comboId"  
                listKey="dptId"  
                listValue="dptName"   
                doubleName="eplId"  
                doubleId="comboDoubleId"  
                doubleList="#request.map[top]"  
                doubleListKey="eplId"  
                doubleListValue="userName"  />     
        </s:form>  
        </div>  
	</body>
</html>
