<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<a  class="maplogo">灾备切换管理系统</a>
<div id="user-nav" class="navbar navbar_inverse">
   <ol class="viewbox">
     <li><a href="<%=path%>/dashboard" class="currentview">Dashboard</a></li>
     <li><a href="<%=path%>/process">Process</a></li>
     <li><a href="<%=path%>/people">People</a></li>
     <li><a href="<%=path%>/task">Task</a></li>
     <%-- <li><a href="<%=path%>/system">System</a></li> --%>
     
   </ol>
   <ul class="nav btn-group">
       <li class="btn btn-help"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">用户名：<b>lpl</b></span></a></li>
       <li class="btn btn-help"><a title="" href="#"><i class="icon icon-share-alt"></i> <span class="text">退出</span></a></li>
   </ul>
</div>
<div class="clearfix"></div>

   
 
