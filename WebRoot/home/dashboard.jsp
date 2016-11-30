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
	     <li><a href="<%=path%>/dashboard" class="currentview">Dashboard</a></li>
	     <li><a href="<%=path%>/people">People</a></li>
	     <li><a href="<%=path%>/task">Task</a></li>
	     <%-- <li><a href="<%=path%>/system">System</a></li> --%>
	     <li><a href="<%=path%>/process">Process</a></li>
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
              <!-- <h3 class="system_stit1">切换任务总进度</h3> -->
              <div class="area_chart" id="area_chart"></div>
              <h3 class="system_stit" style="margin-top:30px;">切换各阶段进度</h3>  
              <ul class="varied_bar">
               <li class="danger">
                  <b></b>
                  <strong><tt class="tt0" style="width:${data[0] };"></tt></strong>
                  <span>切换前检查</span>
                  <em class="em0">${data[0] }</em>
                </li>                
                <li class="warning">
                	<b></b>
                  <strong><tt class="tt1" style="width:${data[1] };"></tt></strong>
                  <span>生产系统关闭</span>
                  <em class="em1">${data[1] }</em>
                </li>
                <li class="warn">
                  <b></b>
                  <strong><tt class="tt2" style="width:${data[2] };"></tt></strong>
                  <span>存储切换</span>
                  <em class="em2">${data[2] }</em>
                </li>
                <li class="success">
                	<b></b>
                  <strong><tt class="tt3" style="width:${data[3] };"></tt></strong>
                  <span>网络切换</span>
                  <em class="em3">${data[3] }</em>
                </li>
                <li class="info">
                	<b></b>
                  <strong><tt class="tt4" style="width:${data[4] };"></tt></strong>
                  <span>灾备系统启动</span>
                  <em class="em4">${data[4] }</em>
                </li> 
                <li class="running">
                	<b></b>
                  <b class="b_last"></b>
                  <strong><tt class="tt4" style="width:${data[5] };"></tt></strong>
                  <span>灾备业务验证</span>
                  <em class="em4">${data[5] }</em>
                </li> 
              </ul>    
              <ul class="varied_bar">
              	<li class="bule">
                  <b></b>
                  <strong><tt class="tt6" style="width:${data[6] };"></tt></strong>
                  <span>网络回切</span>
                  <em class="em6">${data[6] }</em>
                </li>                
                <li class="running">
                	<b></b>
                  <strong><tt class="tt7" style="width:${data[7] };"></tt></strong>
                  <span>生产系统启动</span>
                  <em class="em7">${data[7] }</em>
                </li>
                <li class="info">
                  <b></b>
                  <strong><tt class="tt8" style="width:${data[8] };"></tt></strong>
                  <span>生产业务验证</span>
                  <em class="em8">${data[8] }</em>
                </li>
                <li class="success">
                	<b></b>
                  <strong><tt class="tt9" style="width:${data[9] };"></tt></strong>
                  <span>灾备系统关闭</span>
                  <em class="em9">${data[9] }</em>
                </li>
                <li class="warn">
                	<b></b>
                  <strong><tt class="tt10" style="width:${data[10] };"></tt></strong>
                  <span>存储回切</span>
                  <em class="em10">${data[10] }</em>
                </li> 
                <li class="warning">
                	<b></b>
                  <b class="bb_last"></b>
                  <strong><tt class="tt11" style="width:${data[11] };"></tt></strong>
                  <span>灾备数据备份</span>
                  <em class="em11">${data[11] }</em>
                </li> 
              </ul> 
            </div>
          </div>
        </div>
        <div class="span4">
        	<div class="outside">
            <div class="tabcontent" style="overflow:auto; height:670px;">
              <ul class="personul">
              	<li>
                  <span class="archite_icon"><!-- <b>15</b> --></span>
                  <strong>DRP组织</strong>
                </li>
                <li>
                  <span class="direct_icon"><!-- <b>10</b> --></span>
                  <strong>应急指挥室</strong>
                </li>
              </ul>
              <c:forEach items="${users}" var="user">
	              <dl class="person_face">
	              	<dt>
	              	<c:if test="${user.status == '操作中' || user.status == '已上线' }"><img src="<%=path%>/img/icons/common/online.png"/></c:if>
	              	<c:if test="${user.status != '操作中' && user.status != '已上线' }"><img src="<%=path%>/img/icons/common/offline.png"/></c:if>
	              	</dt>
	                <dd><font size="3"><b>${user.name }</b><span>${user.status }</span></font></dd>
	              </dl>
              </c:forEach>
            </div>          
          </div>
        </div>
      </div>
    </div>
  </div>
<!--content end-->

 <script type="text/javascript"> 
 setInterval(reshtable, 30000);
 function reshtable(){
	 var em0 = $(".em0").html(); 
	 var em1 = $(".em1").html(); 
	 var em2 = $(".em2").html(); 
	 var em3 = $(".em3").html(); 
	 var em4 = $(".em4").html(); 
	 var em5 = $(".em5").html(); 
	 var em6 = $(".em6").html(); 
	 var em7 = $(".em7").html(); 
	 var em8 = $(".em8").html(); 
	 var em9 = $(".em9").html(); 
	 var em10 = $(".em10").html(); 
	 var em11 = $(".em11").html(); 
	 
	 $.ajax({
	   type: "GET",
	   url: "getTaskJobsByStage",
	   success: function(info){
		   info = eval("(" + info + ")"); 
		   var data = info.data;
		   if(data[0]!="100%" || em0 != data[0]){
			   $(".em0").html(data[0]);
			   $(".tt0").css("width",data[0]);
		   }
		   if(data[1]!="100%" || em1 != data[1]){
			   $(".em1").html(data[1]);
			   $(".tt1").css("width",data[1]);
		   }
		   if(data[2]!="100%" || em2 != data[2]){
			   $(".em2").html(data[2]);
			   $(".tt2").css("width",data[2]);
		   }
		   if(data[3]!="100%" || em3 != data[3]){
			   $(".em3").html(data[3]);
			   $(".tt3").css("width",data[3]);
		   }
		   if(data[4]!="100%" || em4 != data[4]){
			   $(".em4").html(data[4]);
			   $(".tt4").css("width",data[4]);
		   }
		   if(data[5]!="100%" || em5 != data[5]){
			   $(".em5").html(data[5]);
			   $(".tt5").css("width",data[5]);
		   }
		   if(data[6]!="100%" || em6 != data[6]){
			   $(".em6").html(data[6]);
			   $(".tt6").css("width",data[6]);
		   }
		   if(data[7]!="100%" || em7 != data[7]){
			   $(".em7").html(data[7]);
			   $(".tt7").css("width",data[7]);
		   }
		   if(data[8]!="100%" || em8 != data[8]){
			   $(".em8").html(data[8]);
			   $(".tt8").css("width",data[8]);
		   }
		   if(data[9]!="100%" || em9 != data[9]){
			   $(".em9").html(data[9]);
			   $(".tt9").css("width",data[9]);
		   }
		   if(data[10]!="100%" || em10 != data[10]){
			   $(".em10").html(data[10]);
			   $(".tt10").css("width",data[10]);
		   }
		   if(data[11]!="100%" || em11 != data[11]){
			   $(".em11").html(data[11]);
			   $(".tt11").css("width",data[11]);
		   }
	   }
	}); 
	 
 }
</script>

<script type="text/javascript">
(function () {
    function initCharts() {
        // 基于准备好的dom，初始化echarts图表
        var myChart = echarts.init(document.getElementById("area_chart"));
        var times = []; 
        var starteds = []; 
        var errors = []; 
        var completeds = []; 
        var waitings = []; 
        option = {
      		title : {
      	        text: '切换任务总进度',
      	        textStyle:  {
	      	          fontSize: 20,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
	      	    },
      	        x:'center'
      	    }, 
      		tooltip : {
      	        trigger: 'axis',
      	        formatter : function (params) {
      	        	var res = params[0].name ;
      	        	for (var i = 0, l = params.length; i < l; i++) {
      	                res += '<br/>' + params[i].seriesName + ' : ' + params[i].value+"%";
      	            }
      	            return res;
      	        }
      	    },
      	    legend: {
      	    	x : 'center',
      	        y : 'bottom',
      	        data:['进行中任务比例','已失败任务比例','已完成任务比例','未开始任务比例']
      	    },
      	    color:['#9FD7FB','#FF9873','#5BD75B','#E18CDE'],   
      	    toolbox: {
      	        show : false
      	    },
      	    calculable : true,
      	    xAxis : [
      	        {
      	        	//name : '时间',
      	            type : 'category',
      	          //axisLabel: {      rotate: 60    },
      	            boundaryGap : false,
      	            splitLine: {show: false},
      	            data: times
      	        }
      	    ],
      	    yAxis : [
      	        {
      	        	///name : '完成比例(%)',
      	            type : 'value',
      	            axisLabel : {
      	                formatter: '{value} %'
      	            }
      	        }
      	    ],
      	    series : [
      	        {
      	            name:'进行中任务比例',
      	            type:'line',
      	            data: starteds,
      	            smooth:true,
      	            itemStyle:{ 
      					normal:{ 
      						color:'#9FD7FB',
      						lineStyle:{
      							color:'#9FD7FB'
      							},
      						label:{ 
      						  show: true, 
      						  //formatter: '{c}' 
	      					  formatter: function (params) {            							  
	      						if(params.value!=null && params.value>0){
             	                    return params.value;
	  							}
	      						return "";
	       	                  },
      						}, 
      						labelLine :{show:true},
      						areaStyle: {type: 'default'}
      					} 
      				} 
      	        },
      	        {
      	            name:'已失败任务比例',
      	            type:'line',
      	            data: errors,
      	            smooth:true,
      	            itemStyle:{ 
      					normal:{ 
      						color:'#FF9873',
      						lineStyle:{
      							color:'#FF9873'
      							},
      						label:{ 
      						  show: true, 
      						  //formatter: '{c}' 
	      					  formatter: function (params) {            							  
	      						if(params.value!=null && params.value>0){
	      							return params.value;
	  							}
	      						return "";     	                   
	       	                  },
      						}, 
      						labelLine :{show:true},
      						areaStyle: {type: 'default'}
      					} 
      				} 
      	        },
      	        {
      	            name:'已完成任务比例',
      	            type:'line',
      	            data: completeds,
      	            smooth:true,
      	            itemStyle:{ 
      					normal:{ 
      						color:'#5BD75B',
      						lineStyle:{
      							color:'#5BD75B'
      							},
      						label:{ 
      						  show: true, 
      						  //formatter: '{c}' 
	      					  formatter: function (params) {            							  
	      						if(params.value!=null && params.value>0){
	      							return params.value;
	  							}
	      						return "";    	                   
	       	                  },
      						}, 
      						labelLine :{show:true},
      						areaStyle: {type: 'default'}
      					} 
      				} 
      	        },
      	        {
      	            name:'未开始任务比例',
      	            type:'line',
      	            smooth:true,
      	            data: waitings,
      	            itemStyle:{ 
      					normal:{ 
      						color:'#E18CDE',
      						lineStyle:{
      							color:'#E18CDE'
      							},
      						label:{ 
      						  show: true, 
      						  //formatter: '{c}' 
	      					  formatter: function (params) {            							  
	      						if(params.value!=null && params.value>0){
	      							return params.value;
	  							}
	      						return "";      	                   
	       	                  },
      						}, 
      						labelLine :{show:true},
      						areaStyle: {type: 'default'}
      					} 
      				} 
      	        }
      	    ]
         },
         setData = function () {
             option.series[0].data.splice(0, option.series[0].data.length);
             $.ajax({
                 url: 'getTaskJobsByTime',
                 success: function (result) {
                     result = $.parseJSON(result);
                     option.xAxis[0].data = result.times;
                     option.series[0].data = result.starteds;
                     option.series[1].data = result.errors;
                     option.series[2].data = result.completeds;
                     option.series[3].data = result.waitings;
                     myChart.clear().setOption(option);
                     result = null;
                 }
             });
         };
        setData();
        setInterval(setData, 30000);
    }

    initCharts();

    if (window.CollectGarbage) {
        setInterval(CollectGarbage, 300000);
    }
}());
</script>
</body>
</html>