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
<div class="header2nd">   
    <ul class="breadcrumbs">
        <li><a href="toIndexPage" title="Home"><span class="bc-home"></span></a></li>
        <li class="no-hover"><a style="cursor: pointer;">云运维支撑</a></li>
		<li class="no-hover"><a href="getHealthMonitorList">监控报警</a></li>
    </ul>
</div>
<div class="con_box_r">
	
	<div class="block-border">
		<div class="table_box">
			<table id="tableId" class="sc_table" width="100%" border="0" cellpadding="0" cellspacing="0">
				<thead>
					<tr>
						<th>名称</th>
						<th>id</th>
						
						<th>workstationName</th>
						<th>jobStreamName</th>	
					    <th>workstationName</th>
						<th>jobStreamName</th>	
						<th>jobStreamName</th>	 	 	 	
					</tr>
				</thead>
				<tbody id="tbodyId">
					<c:forEach items="${joblist}" var="job"  varStatus="i">
						<tr>
							
							<td>${i.index+1}:  ${job.jobName}</td>
							<td>${job.jobId}</td>
							<td>${job.workstationName}</td>
							<td>${job.jobStreamName}</td>
							<td></td>
							<td></td>
							<%-- <td>${job.actualArrival}</td>
	                 	    <td>${job.actualEnd}</td> --%>
	                  		<td>${job.status}</td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="pagemark_box">
			<div id="divFood" class="manu"></div>
		</div>
	</div>
</div>
</body>
</html>