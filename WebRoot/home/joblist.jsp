<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
	<script language="javascript" type="text/javascript">
		
		//全选,反选
		$(document).ready(function(){
			$("#checkedAll").click(function(){
				if($(this).attr("checked")){//全选
					$("input[name='checkVideo']").each(function(){
						$(this).attr("checked",true);
					});
				}else{//取消全选
					$("input[name='checkVideo']").each(function(){
						$(this).attr("checked",false);
					});
				}
			});
			
			//提示框
			if($("#promptBoxFlag").val() == 1){
				$("#winpop", parent.document).show(1500);
				setTimeout("$('#winpop', parent.document).fadeOut()", 4000);
			}
			if($("#promptBoxFlag").val() == -1){
				var errorMessage = $("#errorMessage").val();
				$("#errorContent", parent.document).html("错误信息："+errorMessage);
				$("#winpop_false", parent.document).show(1500);
			}
			$("#promptBoxFlag").val("");
		});
		
				
		//单个删除
		function deleteAlarm(id) {
		 if(id == ""){
		   ymPrompt.alert("请选择你需要删除的报警!");
		   return null;
		 }
		 ymPrompt.confirmInfo("确认删除？", null, null, "删除提示", function(tp){
			if(tp == "ok"){
				location.href="deleteAlarmById?alarmId="+id;
			}
		 });
		}
		
		//多选删除
		function deleteAlarms(){
			var infoId = [];
			var infoName = [];
		    $("input[name='checkVideo']").each(function() {
		    	if ($(this).attr("checked")) {
		    		infoId.push($(this).val());
		    		var td_alarmName = $(this).parent().parent().children("td").eq(1).html();
		    		infoName.push('"'+td_alarmName+'"');
		    	}
		    });
		    if(infoId == ""){
		       ymPrompt.alert("请选择你需要删除的报警!");
		 	   return null;
		    }
		    ymPrompt.confirmInfo("确认删除？", null, null, "删除提示", function(tp) {
				if(tp == "ok"){
					location.href="deleteAlarmById?alarmId="+infoId;
				}
			});
		}
	</script>
	
	<!-- js 分页 -->
	<script language="javascript" type="text/javascript">
		$(document).ready(function() {
			page = new showPages(10,'tableId','tbodyId'); 
		});
	</script>
	<!-- js 分页 结束-->
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
							 	 	 	 	
					</tr>
				</thead>
				<tbody id="tbodyId">
					<c:forEach items="${joblist}" var="job">
						<tr>
							
							<td>${job.jobName}</td>
							<td>${job.jobId}</td>
							<td>${job.workstationName}</td>
							<td>${job.jobStreamName}</td>
							
							
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