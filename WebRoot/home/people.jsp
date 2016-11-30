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
	<script src="<%=path%>/js/jquery.min.js"></script>
	<script src="<%=path%>/js/bootstrap.min.js"></script>
	<script src="<%=path%>/js/jquery-ui.custom.js"></script>
	<script src="<%=path%>/js/jquery.uniform.js"></script>
	<script src="<%=path%>/js/jquery.validate.js"></script>
	<script src="<%=path%>/js/select2.min.js"></script>
	<script src="<%=path%>/js/jquery.dataTables.min.js"></script>
	<script src="<%=path%>/js/lodash.min.js"></script>
	<script src="<%=path%>/js/unicorn.data.js"></script>
	<script src="<%=path%>/js/unicorn.js"></script>
	<script src="<%=path%>/js/unicorn.tables.js"></script>  
	<script src="<%=path%>/js/custom.js"></script>
	<script src="<%=path%>/js/echarts.js"></script>
	<script src="<%=path%>/js/echarts-all.js"></script>
	<link rel="stylesheet" href="<%=path%>/css/base.css"/>
	<link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="<%=path%>/css/bootstrap-responsive.min.css"/>
	<link rel="stylesheet" href="<%=path%>/css/uniform.css" />
	<link rel="stylesheet" href="<%=path%>/css/select2.css" />
	<link rel="stylesheet" href="<%=path%>/css/mapview.css" />
	<link rel="stylesheet" href="<%=path%>/css/unicorn.nostyle.css" class="skin-color"/>
	<title>灾备切换管理系统</title>
</head>

<body>
<!--header start-->
<div class="header">
  	<%-- <jsp:include page="top.jsp" flush="true"></jsp:include> --%>
  	<a href="#" class="maplogo">灾备切换管理系统</a>
	<div id="user-nav" class="navbar navbar_inverse">
	   <ol class="viewbox">
	     <li><a href="<%=path%>/dashboard">Dashboard</a></li>
	     <li><a href="<%=path%>/people" class="currentview">People</a></li>
	     <li><a href="<%=path%>/task">Task</a></li>
	     <%-- <li><a href="<%=path%>/system">System</a></li> --%>
	   </ol>
	   <ul class="nav btn-group">
	       <!-- <li class="btn btn-help"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">用户名：<b>lpl</b></span></a></li> -->
	       <!-- <li class="btn btn-help"><a title="" href="#"><i class="icon icon-share-alt"></i> <span class="text">退出</span></a></li> -->
	   </ul>
	</div>
	<div class="clearfix"></div>
</div>
<!--header end-->   
<!--content start-->
  <div class="content">
  	<div class="container-fluid">
    	<div class="row-fluid">
      	<div class="span8">
          <div class="classifybtn">
            <div class="tabcontent">
              <h3 class="system_stit">组织架构</h3> 
              <div class="structure"><img src="<%=path%>/img/groud-new.png"/></div>                       
            </div>
          </div>
        </div>
        <div class="span4">
        	<div class="outside">
            <div class="tabcontent" style="overflow:auto; height:610px;">
              <c:forEach items="${departmentsByUsers}" var="dep">
              	<h3 class="face_tit1">${dep.name }</h3>
              	<c:forEach items="${dep.users}" var="user">
	              <dl class="person_face">
	              	<dt>
	              	<c:if test="${user.status == '操作中' || user.status == '已上线' }"><img src="<%=path%>/img/icons/common/online.png"/></c:if>
	              	<c:if test="${user.status != '操作中' && user.status != '已上线' }"><img src="<%=path%>/img/icons/common/offline.png"/></c:if>
	              	</dt>
	                <dd><font size="3"><b>${user.name }</b><span>${user.status }</span></font></dd>
	              </dl>
              	</c:forEach>
              </c:forEach>
            </div>          
          </div>
        </div>
      </div>
    </div>
  </div>
<!--content end-->

</body>
</html>