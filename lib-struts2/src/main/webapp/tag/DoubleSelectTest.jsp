<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.qr.bean.Dep"%>
<%@page import="com.qr.bean.Em"%>
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
		Dep d1=new Dep();
		d1.setDptId(1);
		d1.setDptName("销售一部");
		Dep d2=new Dep();
		d2.setDptId(2);
		d2.setDptName("网络一部");
		Dep d3=new Dep();
		d3.setDptId(3);
		d3.setDptName("IT中心");
		List<Em> elist1=new ArrayList<Em>();//用list保存一个部门的所有员工
		Em e1=new Em();
		e1.setEplId(1);
		e1.setUserName("张三");
		Em e2=new Em();
		e2.setEplId(2);
		e2.setUserName("李四");
		Em e9=new Em();
		e9.setEplId(9);
		e9.setUserName("巩利");
		Em e10=new Em();
		e10.setEplId(10);
		e10.setUserName("赵薇");
		Em e11=new Em();
		e11.setEplId(11);
		e11.setUserName("刘德华");
		elist1.add(e1);
		elist1.add(e2);
		elist1.add(e9);
		elist1.add(e10);
		elist1.add(e11);
		List<Em> elist2=new ArrayList<Em>();
		Em e3=new Em();
		e3.setEplId(3);
		e3.setUserName("王五");
		Em e4=new Em();
		e4.setEplId(4);
		e4.setUserName("刘六");
		Em e5=new Em();
		e5.setEplId(5);
		e5.setUserName("吴邦国");
		elist2.add(e3);
		elist2.add(e4);
		elist2.add(e5);
		
		List<Em> elist3=new ArrayList<Em>();
		Em e6=new Em();
		e6.setEplId(6);
		e6.setUserName("张学友");
		Em e7=new Em();
		e7.setEplId(7);
		e7.setUserName("关芝琳");
		Em e8=new Em();
		e8.setEplId(8);
		e8.setUserName("吴京");
		elist3.add(e6);
		elist3.add(e7);
		elist3.add(e8);
		
//在map中保存部门和对应的员工
		map.put(d1,elist1);
		map.put(d2,elist2);
		map.put(d3,elist3);
//将map放到request范围
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
