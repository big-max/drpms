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

<body onload="MyShow();">
<!--header start-->
<div class="header">
  	<%-- <jsp:include page="top.jsp" flush="true"></jsp:include> --%>
  	<a href="#" class="maplogo">灾备切换管理系统</a>
	<div id="user-nav" class="navbar navbar_inverse">
	   <ol class="viewbox">
	     <li><a href="<%=path%>/dashboard">Dashboard</a></li>
	     <li><a href="<%=path%>/people">People</a></li>
	     <li><a href="<%=path%>/task" class="currentview">Task</a></li>
	     <%-- <li><a href="<%=path%>/system">System</a></li> --%>
	   </ol>
	   <ul class="nav btn-group">
	       <!-- <li class="btn btn-help"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">用户名：<b>lpl</b></span></a></l -->i>
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
          	<div class="executivesum">
              <div class="executive"  id="executiveSum" ></div>
            </div>
            <div class="progresssum">
            	<div id="progressSum" style= "width:100%; height:300px;"></div>
            </div>
          </div>
        </div>
      </div>
    </div>  
    <div class="container-fluid">
    	<div class="row-fluid">
      	<div class="span12">
        	<div id="tabscroll" class="scroll_box"><!-- ${obj.allsuccess eq 'true' ? '' : scrollBox }  -->
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="maptable">
            	<thead>
                <tr>
                  <th scope="col">任务状态</th>
                  <th scope="col">任务名称</th>
                  <th scope="col">操作员</th>
                  <th scope="col">预计开始时间</th>
                  <th scope="col">实际开始时间</th>
                  <th scope="col" width="180">滞后时间（>10分钟）</th>
                </tr>
              </thead>
              <tbody>
				<!-- STARTED ERROR  COMPLETED  WAITING-->
                <c:forEach items="${obj.jobinstances}" var="job">
	              	<tr class="${job.colorclass }">
		              	<%--<c:if test="${job.status eq 'STARTED'}">class="blue"</c:if>
		              	<c:if test="${job.status eq 'ERROR'}">class="orange"</c:if>
		                <c:if test="${job.status eq 'COMPLETED'}">class="green"</c:if>
		                <c:if test="${job.status eq 'WAITING'}">class="purple"</c:if> --%>
		              <td>${job.status}</td>
	                  <td>${job.jobName}</td>
	                  <td>${job.username}</td>
	                  <td>${job.expectStartDate}</td>
	                  <td>${job.startDate}</td>
	                  <td>${job.lagtime eq 'true' ? "是" : "否"}</td>
	                </tr>    
              	 </c:forEach>                
               </tbody>
              </table>
          </div>
        </div>
      </div>
    </div>
  </div>
<!--content end-->
<script type="text/javascript">
function MyShow() {
    //timer = window.setInterval("reshtable()",30000);
}
function reshtable(){
	$.ajax({
	   type: "GET",
	   url: "getTaskStartJobs",
	   success: function(info){
		   $(".maptable tbody").html();
		   var tbodyhtml = "";
		   info = eval("(" + info + ")"); 
		   var jobs = info.jobinstances;
		   for(var i=0;i<jobs.length;i++){
			   var lagtime = "否";
			   if(jobs[i].lagtime){  lagtime = "是";   }	
			   /*var cla = ""; 
			   if(jobs[i].status =='STARTED'){  cla = "blue";
			   }else if(jobs[i].status =='ERROR'){ cla = "orange";
			   }else if(jobs[i].status =='COMPLETED'){  cla = "green";
			   }else if(jobs[i].status =='WAITING'){ cla = "purple";   } */
			   tbodyhtml = tbodyhtml + "<tr class="+jobs[i].colorclass+">"+
			   "<td>"+jobs[i].status+"</td>"+
               "<td>"+jobs[i].jobName+"</td>"+
               "<td>"+jobs[i].username+"</td>"+
               "<td>"+jobs[i].expectStartDate+"</td>"+
               "<td>"+jobs[i].startDate+"</td>"+
               "<td>"+lagtime+"</td>"+
             "</tr>";
		   }
		   $(".maptable tbody").html(tbodyhtml);
		   /* if(info.allsuccess){
			   $("#tabscroll").removeClass("scrollBox");
			  
		   }else{
			   $("#tabscroll").removeClass().addClass("scrollBox").addClass("scroll_box");
		   }
		   
		   var scrtime;
		   $(".scrollBox").hover(function(){
				clearInterval(scrtime);			
				},function(){				
				 scrtime = setInterval(function(){
					var $ulTable = $(".scrollBox tbody");
					var liTrHeight = $ulTable.find("tr:last").height();
					$ulTable.animate({marginTop : liTrHeight + 35 + "px"},2000,function(){
					$ulTable.find("tr:last").prependTo($ulTable);
					$ulTable.find("tr:first").hide();
					$ulTable.css({marginTop:35 + "px"});
					$ulTable.find("tr:first").fadeIn(2000);
					});
				},1000);			
			}).trigger("mouseleave"); */
	   }
	});
}
</script>
<script type="text/javascript">
(function () {
	setInterval(reshtable, 30000);
    function initCharts() {
        // 基于准备好的dom，初始化echarts图表
        var myChart = echarts.init(document.getElementById("executiveSum"));
        var values = [];
        option = {
       		title : {
       	        text: '切换任务执行汇总',
	       	    textStyle:  {
	     	          fontSize: 20,
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
       	    //对应的四种状态的颜色 '已成功','进行中','已失败','未开始'
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
       						//color : 'rgba(255, 255, 64,1)',
       						label:{ 
       						  show: true, 
       						  //textStyle : {color : "#000" },//字体为黑色,不写则跟图形的颜色一致
       						  formatter: '{b} : {c} ({d}%)' 
       						  
       						}, 
       						labelLine :{
       							//lineStyle:{color:"#000"}, //线为黑色,不写则跟图形的颜色一致
       							show:true
       							
       						}
       					} 
       				}       				
       	        }
       	    ]
          },
          setData = function () {
              //option.series[0].data.splice(0, option.series[0].data.length);
              $.ajax({
                  url: 'getTaskJobsByStatus',
                  success: function (result) {
                      result = $.parseJSON(result);
                      option.series[0].data = result;
                      myChart.hideLoading();
                      myChart.clear().setOption(option);
                      result = null;
                  }
              });
        };
        setData();
        setInterval(setData, 30000);
    }

    initCharts();
    initCharts2();
    
    function initCharts2() {
        // 基于准备好的dom，初始化echarts图表
        var myChart2 = echarts.init(document.getElementById("progressSum"));
        var jobs = [];  
        var expect = [];
        var start = [];
        var jobmap = {};
        var jobnames = [];
        option2 = {
        		/* title : {
        	        text: '切换任务进度汇总',
    	       	    textStyle:  {
  	     	          fontSize: 20,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
  	     	   		},
        	        x:'center'
        	    },
        		tooltip : {
        	        trigger: 'axis'
        	    },
        	    legend: {
        	    	x : 'center',
        	        y : 'bottom',
        	        data:['计划开始时间','实际开始时间']
        	    },
        	    toolbox: {
        	        show : false
        	    },
        	    calculable : false,
        	    xAxis : [
        	        {
        	        	//name : '任务',
        	            type : 'category',
        	            boundaryGap : false,
        	            splitLine: {show: false},
        	            data : jobs
        	        }
        	    ],
        	    yAxis : [
        	        {
        	        	//name : '时间',
        	        	type: 'value',
        	        	scale: true,
        	        	//precision: 2,
        	        	//splitNumber: 8,
        	        	boundaryGap: [0, 0]
        	        }
        	    ],
        	    series : [
        	        {
        	            name:'计划开始时间',
        	            type:'line',
        	            data:expect,
        	            itemStyle:{ 
        					normal:{ 
        						label:{ 
        						  show: true, 
        						  formatter: '{c}' 
        						}, 
        						labelLine :{show:true}
        					} 
        				} 
        	        },
        	        {
        	            name:'实际开始时间',
        	            type:'line',
        	            data:start,
        	            itemStyle:{ 
        					normal:{ 
        						label:{ 
        						  show: true, 
        						  formatter: '{c}' 
        						}, 
        						labelLine :{show:true}
        					} 
        				} 
        	        }
        	    ] */
        	    title : {
        	        text: '切换任务进度汇总',
    	       	    textStyle:  {
  	     	          fontSize: 20,
	     	          fontWeight: 'bolder',
	     	          color: '#000'
  	     	   		},
        	        x:'center'
        	    },
        	    tooltip : {
        	        trigger: 'axis',
        	        formatter: function (params) {
        	        	var res = params[0].name ;
          	        	for (var i = 0, l = params.length; i < l; i++) {
          	        		var date = "-";
          	        		if(params[i].value!=null && params[i].value>0){
    	                    	date = new Date(params[i].value).format("MM-dd hh:mm");;
							}
          	                res += '<br/>' + params[i].seriesName + ' : ' + date;
          	            }
          	            return res;
 	                   
 	                },
        	    },
        	    legend: {
        	    	x : 'right',
        	        y : 'top',
        	        data:['计划开始时间','实际开始时间']
        	    },
        	    toolbox: {
        	        show : false
        	    },
        	    calculable : false,
        	    /* dataZoom:{
        	    	orient:"horizontal", //水平显示
        	    	show:true //显示滚动条
        	    }, */
        	    xAxis : [
        	        {
        	        	//name : '任务',
        	            type : 'category',
        	            boundaryGap : false,
        	            nameLocation: 'end',
        	            splitLine: {show: false},
        	            data : jobs,        	            
        	            axisLabel : {
        	            	interval: function (index,jobs) {        	            		
        	            		if(jobnames.indexOf(jobs)>=0){
        	            			return true;
        	            		}
        	            		return false;         	            		
        	            		//console.log([index,jobs]);
        	            	},
        	                formatter: function (value) {
        	                    if(value!=null){
        	                    	var keyval = "";
        	                    	for(key in jobmap){ 
        	                    		//console.log([key,value,jobmap[key]]);
        	                    		if(key == value){
        	                    			keyval = jobmap[key];
        	                    			return keyval;
        	                    		}        	                    		
        	                    	}
        	                    }else{
    								return "";
    							}
        	                } 
        	            }
        	        }
        	    ],
        	    yAxis : [
        	        {
        	        	//name : '时间',
        	        	type: 'value',
        	        	scale: true,
        	        	//precision: 2,
        	        	//splitNumber: 8,
        	        	boundaryGap: [0, 0],
        	        	axisLabel : {
        	                formatter: function (value) {
        	                    if(value!=null && value>0){
        	                    	var date = new Date(value).format("MM-dd hh:mm");;
              	                    /* return (date.getMonth() + 1) + '-'
              	                           + date.getDate() + ' '
              	                           + date.getHours() + ':'
              	                           + date.getMinutes(); */
              	                    return date;
        	                    }else{
    								return 0;
    							}
        	                }
        	            }
        	        }
        	    ],
        	    series : [
        	        {
        	            name:'计划开始时间',
        	            type:'line',
        	            data:expect,
        	            itemStyle:{ 
        					normal:{ 
        						label:{ 
        						  show: true, 
        						  position:'top',
        						  formatter: function (params) {            							  
        							  if(jobnames.indexOf(params.name)>=0){  
	            							if(params.value!=null && params.value>0){
		                 	                    var date = new Date(params.value).format("hh:mm");
		                  	                    return date;
	            							}else{
	            								return 0;
	            							}
	                 	                  }           	                   
             	                   },
        						}, 
        						labelLine :{show:true}
        					} 
        				} 
        	        },
        	        {
        	            name:'实际开始时间',
        	            type:'line',
        	            data:start,
        	           itemStyle:{ 
        					normal:{ 
        						label:{ 
        						  show: true,
        						  position:'bottom',
        						  formatter: function (params) {
        							  if(jobnames.indexOf(params.name)>=0){  
            							if(params.value!=null && params.value>0){
	                 	                    var date = new Date(params.value).format("hh:mm");
	                  	                    return date;
            							}else{
            								return 0;
            							}
                 	                   }
        						  }
        						}, 
        						labelLine :{show:true}
        					}
        				}  
        	        }
        	    ]
          },
          setData = function () {
              //option.series[0].data.splice(0, option.series[0].data.length);
              $.ajax({
                  url: 'getSerialTaskJobs',
                  success: function (result) {
                      result = $.parseJSON(result);
                      jobmap = result.jobmap;
                      jobnames = result.jobnames;
              		  option2.xAxis[0].data = result.jobs;                    
              		  /* var eobj = result.expect;
              		  var expect = new Array([eobj.length]);
              		  for (var i = 0; i < eobj.length; i++){
              		    expect[i] = eobj[i].toFixed(2);
              		  }
              		  var sobj = result.start;
              		  var start = new Array([sobj.length]);
              		  for (var i = 0; i < sobj.length; i++){
              		    start[i] = sobj[i].toFixed(2);
              		  } */
              		  var start = result.start;
              		  var expect = result.expect;
                      option2.series[0].data = expect;
                      option2.series[1].data = start;
                      myChart2.clear().setOption(option2);
                      result = null;
                  }
              });
        };
        setData();
        setInterval(setData, 30000);
    }

    if (window.CollectGarbage) {
        setInterval(CollectGarbage, 300000);
    }
    
    Date.prototype.format = function (format) {
        var args = {
            "M+": this.getMonth() + 1,
            "d+": this.getDate(),
            "h+": this.getHours(),
            "m+": this.getMinutes(),
            "s+": this.getSeconds(),
            "q+": Math.floor((this.getMonth() + 3) / 3), 
            "S": this.getMilliseconds()
        };
        if (/(y+)/.test(format))
            format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
        for (var i in args) {
            var n = args[i];
            if (new RegExp("(" + i + ")").test(format))
                format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? n : ("00" + n).substr(("" + n).length));
        }
        return format;
    };
    
}());
</script>
</body>
</html>