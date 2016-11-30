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
	     <li><a href="<%=path%>/people">People</a></li>
	     <li><a href="<%=path%>/task">Task</a></li>
	     <%-- <li><a href="<%=path%>/system" class="currentview">System</a></li> --%>
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
      	<div class="span12">
          <div class="classifybtn">
            <div class="tabcontent">
              <h3 class="system_stit">系统任务执行汇总</h3>  
              <ul class="tystempie">
              	<li id="main"></li>
                <!-- <li id="credit"></li> -->
                <li id="counter"></li>
                <!-- <li id="route"></li>
                <li id="encrypt"></li> -->
              </ul> 
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
<!--content end-->

<script type="text/javascript">
(function () {
    function initCharts(id) {
        // 基于准备好的dom，初始化echarts图表
        var myChart = echarts.init(document.getElementById("main"));
        /* var creditChart = echarts.init(document.getElementById('credit')); */
        var counterChart = echarts.init(document.getElementById('counter'));
       /*  var routeChart = echarts.init(document.getElementById('route'));
        var encryptChart = echarts.init(document.getElementById('encrypt')); */
      
        var values = [];
        option = {
       		title : {
       	        text: '核心',
	       	    textStyle:  {
	     	          fontSize: 18,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
	     	    },
       	        x:'center'
        	},
     		tooltip : {
     	        trigger: 'item',
     	        formatter: "{a} <br/>{b} : {c} ({d}%)"
     	    },
     	    legend: {
     	    	show : true, 
     	        orient : 'vertical',
     	        x : 'left',
     	        data: ['已成功','进行中','已失败','未开始']
     	    }, 
     	    color:['#5BD75B','#9FD7FB','#FF9873','#E18CDE'],
     	    toolbox: {
     	        show : false
     	    },
     	    calculable : true,
     	    series : [
     	        {
     	            name:'汇总数',
     	            type:'pie',
     	            radius : '55%',
     	            center: ['50%', '60%'],
     	            data: values,
     				itemStyle:{ 
     					normal:{ 
     						label:{ 
     						  show: true, 
     						  formatter: '{b} : {c} ({d}%)' 
     						}, 
     						labelLine :{show:true}
     					},
     					 
     				} 
     	        }
     	    ]
         },
         /* creditoption = {
         	title : {
       	        text: '新信贷',
	       	    textStyle:  {
	     	          fontSize: 18,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
	     	    },
       	        x:'center'
           	},
       		tooltip : {
       	        trigger: 'item',
       	        formatter: "{a} <br/>{b} : {c} ({d}%)"
       	    },
       	    legend: {
       	    	show : true, 
       	        orient : 'vertical',
       	        x : 'left',
       	        data: ['已成功','进行中','已失败','未开始']
       	    }, 
       	    color:['#5BD75B','#9FD7FB','#FF9873','#E18CDE'],
       	    toolbox: {
       	        show : false
       	    },
       	    calculable : true,
       	    series : [
       	        {
       	            name:'汇总数',
       	            type:'pie',
       	            radius : '55%',
       	            center: ['50%', '60%'],
       	            data: values,
       				itemStyle:{ 
       					normal:{ 
       						label:{ 
       						  show: true, 
       						  formatter: '{b} : {c} ({d}%)' 
       						}, 
       						labelLine :{show:true}
       					} 
       				} 
       	        }
       	    ]
           }, */
          counteroption = {
            title : {
          	    text: '柜面前置',
	       	    textStyle:  {
	     	          fontSize: 18,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
	     	    },
          	    x:'center'
            },
      		tooltip : {
      	        trigger: 'item',
      	        formatter: "{a} <br/>{b} : {c} ({d}%)"
      	    },
      	    legend: {
      	    	show : true, 
      	        orient : 'vertical',
      	        x : 'left',
      	        data: ['已成功','进行中','已失败','未开始']
      	    }, 
      	    color:['#5BD75B','#9FD7FB','#FF9873','#E18CDE'],
      	    toolbox: {
      	        show : false
      	    },
      	    calculable : true,
      	    series : [
      	        {
      	            name:'汇总数',
      	            type:'pie',
      	            radius : '55%',
      	            center: ['50%', '60%'],
      	            data: values,
      				itemStyle:{ 
      					normal:{ 
      						label:{ 
      						  show: true, 
      						  formatter: '{b} : {c} ({d}%)' 
      						}, 
      						labelLine :{show:true}
      					} 
      				} 
      	        }
      	    ]
          },
          /* routeoption = {
            title : {
          	    text: '交易路由',
	       	    textStyle:  {
	     	          fontSize: 18,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
	     	    },
          	    x:'center'
            },
      		tooltip : {
      	        trigger: 'item',
      	        formatter: "{a} <br/>{b} : {c} ({d}%)"
      	    },
      	    legend: {
      	    	show : true, 
      	        orient : 'vertical',
      	        x : 'left',
      	        data: ['已成功','进行中','已失败','未开始']
      	    }, 
      	    color:['#5BD75B','#9FD7FB','#FF9873','#E18CDE'],
      	    toolbox: {
      	        show : false
      	    },
      	    calculable : true,
      	    series : [
      	        {
      	            name:'汇总数',
      	            type:'pie',
      	            radius : '55%',
      	            center: ['50%', '60%'],
      	            data: values,
      				itemStyle:{ 
      					normal:{ 
      						label:{ 
      						  show: true, 
      						  formatter: '{b} : {c} ({d}%)' 
      						}, 
      						labelLine :{show:true}
      					} 
      				} 
      	        }
      	    ]
          }, */
     	/* encryptoption = {
             title : {
           	    text: '加密平台',
	       	    textStyle:  {
	     	          fontSize: 18,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
	     	    },
           	    x:'center'
             },
       		tooltip : {
       	        trigger: 'item',
       	        formatter: "{a} <br/>{b} : {c} ({d}%)"
       	    },
       	    legend: {
       	    	show : true, 
       	        orient : 'vertical',
       	        x : 'left',
       	        data: ['已成功','进行中','已失败','未开始']
       	    }, 
       	    color:['#5BD75B','#9FD7FB','#FF9873','#E18CDE'],
       	    toolbox: {
       	        show : false
       	    },
       	    calculable : true,
       	    series : [
       	        {
       	            name:'汇总数',
       	            type:'pie',
       	            radius : '55%',
       	            center: ['50%', '60%'],
       	            data: values,
       				itemStyle:{ 
       					normal:{ 
       						label:{ 
       						  show: true, 
       						  formatter: '{b} : {c} ({d}%)' 
       						}, 
       						labelLine :{show:true}
       					} 
       				} 
       	        }
       	    ]
           }, */
          setData = function () {
             //option.series[0].data.splice(0, option.series[0].data.length);
             $.ajax({
                 url: 'getJobsBySys',
                 success: function (result) {
                     result = $.parseJSON(result);
                     option.series[0].data = result.data1;
                     myChart.hideLoading();
                     myChart.clear().setOption(option);
                     
                     /* creditoption.series[0].data = result.data2;
                     creditChart.hideLoading();
                     creditChart.clear().setOption(creditoption); */
                     
                     counteroption.series[0].data = result.data3;
                     counterChart.hideLoading();
                     counterChart.clear().setOption(counteroption);
                     
                     routeoption.series[0].data = result.data4;
                     routeChart.hideLoading();
                     routeChart.clear().setOption(routeoption);
                     
                     encryptoption.series[0].data = result.data5;
                     encryptChart.hideLoading();
                     encryptChart.clear().setOption(encryptoption);
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