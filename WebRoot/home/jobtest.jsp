<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta name=”renderer” content=”webkit|ie-comp|ie-stand”>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script src="<%=path%>/js/jquery.min.js" type="text/javascript"></script>
	<script src="<%=path%>/js/style.js" type="text/javascript" ></script>
	<script src="<%=path%>/js/dropkick.js" type="text/javascript" ></script>
	<script src="<%=path%>/js/json2.js" type="text/javascript" ></script>
	<script src="<%=path%>/js/tablepage.js" type="text/javascript" ></script>
	<script src="<%=path%>/js/bootstrap.min.js"></script>
	<script src="<%=path%>/js/ymPrompt.js" type="text/javascript" ></script>
	<link type="text/css" title="www" rel="stylesheet" href="<%=path%>/css/scnew.css">
	<link type="text/css" title="www" rel="stylesheet" href="<%=path%>/css/css.css">
	<link type="text/css" title="www" rel="stylesheet" href="<%=path%>/css/bootstrap.css">
	<link type="text/css" title="www" rel="stylesheet" href="<%=path%>/css/ymPrompt.css">
	<link type="text/css" title="www" rel="stylesheet" href="<%=path%>/css/pui.css">
	<title>智慧云平台</title>
</head>

<body>
<div class="con_box_r">
	
	<div class="block-border">
		<div class="table_box">
			<table width="100%" border="1" cellspacing="0" cellpadding="0" class="maptable">
            	<thead>
                <tr>
                  <th scope="col">任务名称</th>
                  <th scope="col">操作员</th>
                  <th scope="col">预计开始时间</th>
                  <th scope="col">预计开始时间</th>
                  <th scope="col">所属的系统</th>
                  <th scope="col">所属的阶段</th>
                  <th scope="col">是否为串行任务</th>
                </tr>
              </thead>
              <tbody>
				<!-- STARTED ERROR  COMPLETED  WAITING-->
                <c:forEach items="${joblist}" var="job">
	              	<tr class="">
	                  <td>${job.name}</td>
	                  <td>${job.username}</td>
	                  <td>${job.description}</td>
	                  <td>${job.planStartTime}</td>
	                  <td>${job.systemName}</td>
	                  <td>${job.phaseInSystem}</td>
	                  <td>${job.serial}</td>
	                </tr>    
              	 </c:forEach>                
               </tbody>
              </table>
		</div>
	</div>
</div>
</body>
</html>