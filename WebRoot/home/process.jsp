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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="<%=path%>/js/jquery.min.js"></script>
<style type="text/css"> 
.start,.checkDone
{ 
	border:1px solid #000000; width:160px; height:60px; margin:0 auto; 
	-webkit-border-radius:50px; 
	-moz-border-radius:50px; 
	-o-border-radius:50px; 
	border-radius:20px 20px 20px 20px; 
} 
.end
{ 
	border:0px solid #000000; width:160px; height:60px; margin:0 auto; 
	-webkit-border-radius:50px; 
	-moz-border-radius:50px; 
	-o-border-radius:50px; 
	border-radius:20px 20px 20px 20px; 
}
.pic_zhu{
	height:20px;width:30px;float:left;margin-left:10px;margin-top:3px;
}
.pic1{
	padding-top:3px;margin-left:50px;
}
body {
	margin: 0px;
	padding: 0px; 
	background:url(img/body_bg.jpg); 
	color:#000;
}
</style>
</head>

<body>
<div style="position:fixed; line-height:55px; height:60px; width:100%; background-color:#BEBEBE;z-index:20;">
	<div style="float:left;width:33%;margin-top:6px;text-align:right;"><img src="img/anhui.png"></div>
	<div style="float:right;width:66%;"><font size="6px">安徽省联社2016年度灾备切换演练</font></div>
</div>

<div style="margin-top:80px;position:fixed;width:100%;">
	<!--颜色注解说明-->
	<div style="width: 200px; height: 130px;float:left;">
		<div style="height:30px;">
			<div class="pic_zhu" style="border:1px solid #000000;"></div>
			<div class="pic1"><font size="2px;">未开始</font></div>
		</div>
		<div style="height:30px;">
			<div class="pic_zhu" style="background-color:#9FD7FB;border:1px solid #000000"></div>
			<div class="pic1"><font size="2px;">进行中</font></div>
		</div>
		<div style="height:30px;">
			<div class="pic_zhu" style="background-color:#5BD75B;border:1px solid #000000"></div>
			<div class="pic1"><font size="2px;">已完成</font></div>
		</div>
		<div style="height:30px;">
			<div class="pic_zhu" style="background-color:#FF9873;border:1px solid #000000"></div>
			<div class="pic1"><font size="2px;">已失败</font></div>
		</div>
	</div>
	<!--颜色注解说明-->

	<!--显示当前时间-->
	<div id="time" style="float:right;margin-right:20px;"></div>
	<!--显示当前时间-->
</div>

<div id="process" style="width:800px;height:4800px;margin:0 auto;position:relative;">
<!--流程图开始-->
<div id="a1" class="start" style="position: absolute; top:90px; left:317px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景一介绍</div>
</div>

<div id="a2" style="position: absolute; top: 220px; left: 315px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">发现告警、值班员报告</div>
	<div style="font-size:15px;margin-top:15px;">高艳</div>
</div>

<div id="a3" style="position: absolute; top: 420px; left: 26px; border: 1px solid rgb(0, 0, 0); width: 160px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">网络管理员响应</div>
	<div style="font-size:15px;margin-top:15px;">杨明</div>
</div>

<div id="a4" style="position: absolute; top: 420px; left: 221px; border: 1px solid rgb(0, 0, 0); width: 160px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">应用管理员响应</div>
	<div style="font-size:15px;margin-top:15px;">戴明</div>
</div>

<div id="a5" style="position: absolute; top: 420px; left: 426px; border: 1px solid rgb(0, 0, 0); width: 160px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">系统管理员响应</div>
	<div style="font-size:15px;margin-top:15px;">曹畅</div>
</div>

<div id="a6" style="position: absolute; top: 420px; left: 621px; border: 1px solid rgb(0, 0, 0); width: 160px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">运行支持部门</div>
	<div style="font-size:15px;margin-top:15px;">经理响应 曹玉蓉</div>
</div>

<div id="a7" style="position: absolute; top: 590px; left: 26px; border: 1px solid rgb(0, 0, 0); width: 160px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">网络检查结果</div>
	<div style="font-size:15px;margin-top:15px;">杨明、孙旭东</div>
</div>

<div id="a8" style="position: absolute; top: 590px; left: 221px; border: 1px solid rgb(0, 0, 0); width: 160px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">应用检查结果</div>
	<div style="font-size:15px;margin-top:15px;">戴明、曹碧云</div>
</div>

<div id="a9" style="position: absolute; top: 590px; left: 426px; border: 1px solid rgb(0, 0, 0); width: 160px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">系统检查结果</div>
	<div style="font-size:15px;margin-top:15px;">曹畅、孙旭东</div>
</div>

<div id="a10" style="position: absolute; top: 790px; left: 315px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">检查结果汇总分析</div>
	<div style="font-size:15px;margin-top:15px;">主持人</div>
</div>

<div id="a11" style="position: absolute; top: 990px; left: 35px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">网络紧急处置结果</div>
	<div style="font-size:14px;margin-top:15px;">杨明、孙旭东</div>
</div>

<div id="a12" style="position: absolute; top: 990px; left: 315px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">应用紧急处置结果</div>
	<div style="font-size:15px;margin-top:15px;">戴明、曹碧云</div>
</div>

<div id="a13" style="position: absolute; top: 990px; left: 605px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">系统紧急处置结果</div>
	<div style="font-size:14px;margin-top:15px;">曹畅、孙旭东</div>
</div>

<div id="a14" style="position: absolute; top: 1200px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">生产运行应急分析会议</div>
	<div style="font-size:15px;margin-top:15px;">曾庆元、曹玉蓉、曹碧云、孙旭东</div>
</div>

<div id="a15" style="position: absolute; top: 1370px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">突发事件上报信息中心总经理</div>
	<div style="font-size:15px;margin-top:15px;">王开胜、曾庆元</div>
</div>

<div id="a16" class="start" style="position: absolute; top:1540px; left:317px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景二介绍</div>
</div>

<div id="a17" style="position: absolute; top: 1700px; left: 181px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:15px;margin-top:12px;">应用管理部问题排查<br>及应急处置结果</div>
	<div style="font-size:15px;margin-top:15px;">曹碧云、戴明</div>
</div>

<div id="a18" style="position: absolute; top: 1700px; left: 446px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:15px;margin-top:12px;">资源保障部问题排查<br>及应急处置结果</div>
	<div style="font-size:15px;margin-top:15px;">孙旭东、杨明、曹畅</div>
</div>

<div id="a19" style="position: absolute; top: 1900px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">处置结果汇总分析</div>
	<div style="font-size:15px;margin-top:15px;">主持人</div>
</div>

<div id="a20" style="position: absolute; top: 2070px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">突发事件上报省联社分管领导</div>
	<div style="font-size:15px;margin-top:15px;">王开胜、崇智祥</div>
</div>

<div id="a21" style="position: absolute; top: 2240px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">安排事件上报</div>
	<div style="font-size:15px;margin-top:15px;">王开胜、胡拥军</div>
</div>

<div id="a22" style="position: absolute; top: 2410px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">突发事件上报安徽银监会</div>
	<div style="font-size:15px;margin-top:15px;">胡拥军、戚君贤</div>
</div>

<div id="a23" class="start" style="position: absolute; top:2580px; left:317px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景三介绍</div>
</div>

<div id="a24" style="position: absolute; top: 2710px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">下达组建联合应急小组命令</div>
	<div style="font-size:15px;margin-top:15px;">戚君贤、胡拥军</div>
</div>

<div id="a25" style="position: absolute; top: 2880px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">上报组件联合应急小组</div>
	<div style="font-size:15px;margin-top:15px;">胡拥军、王开胜</div>
</div>

<div id="a26" style="position: absolute; top: 3050px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">上报组件联合应急小组</div>
	<div style="font-size:15px;margin-top:15px;">王开胜、崇智祥</div>
</div>

<div id="a27" style="position: absolute; top: 3220px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">汇报问题原因及暂定措施</div>
	<div style="font-size:15px;margin-top:15px;">曹碧云、王开胜、曾庆元</div>
</div>

<div id="a28" class="start" style="position: absolute; top:3390px; left:318px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景四介绍</div>
</div>

<div id="a29" style="position: absolute; top: 3520px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">汇报问题原因及暂定措施</div>
	<div style="font-size:15px;margin-top:15px;">王开胜、崇智祥</div>
</div>

<div id="a30" class="start" style="position: absolute; top:3690px; left:318px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景五介绍</div>
</div>

<div id="a31" style="position: absolute; top: 3820px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">汇报问题分析原因</div>
	<div style="font-size:15px;margin-top:15px;">孙旭东、王开胜、曾庆元</div>
</div>

<div id="a32" class="start" style="position: absolute; top:3990px; left:318px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景六介绍</div>
</div>

<div id="a33" style="position: absolute; top: 4150px; left: 181px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">网络管理员报告测试结果</div>
	<div style="font-size:15px;margin-top:15px;">杨明、孙旭东</div>
</div>

<div id="a34" style="position: absolute; top: 4150px; left: 446px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">应用管理员报告测试结果</div>
	<div style="font-size:15px;margin-top:15px;">戴明、曹碧云</div>
</div>

<div id="a35" style="position: absolute; top: 4350px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:10px;">汇报测试结果</div>
	<div style="font-size:15px;margin-top:15px;">曹碧云、孙旭东、曹玉蓉</div>
	<div style="font-size:15px;margin-top15px;">王开胜、曾庆元</div>
</div>

<div id="a36" style="position: absolute; top: 4520px; left: 285px; border: 1px solid rgb(0, 0, 0); width: 230px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:20px;">汇报测试结果</div>
	<div style="font-size:15px;margin-top:15px;">王开胜、崇智祥</div>
</div>

<div id="a37" class="start" style="position: absolute; top:4690px; left:318px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景七介绍</div>
</div>


<div id="line_1" style="background-color: rgb(0, 0, 0); position: absolute; top: 151px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_2" style="background-color: rgb(0, 0, 0); position: absolute; top: 321px; left: 397px; width: 2px; height: 35px; z-index: 10;"></div>
<div id="line_3" style="background-color: rgb(0, 0, 0); position: absolute; top: 356px; left: 106px; width: 597px; height: 2px; z-index: 10;"></div>
<div id="line_4" style="background-color: rgb(0, 0, 0); position: absolute; top: 356px; left: 106px; width: 2px; height: 64px; z-index: 10;"></div>
<div id="line_5" style="background-color: rgb(0, 0, 0); position: absolute; top: 356px; left: 301px; width: 2px; height: 64px; z-index: 10;"></div>
<div id="line_5" style="background-color: rgb(0, 0, 0); position: absolute; top: 356px; left: 506px; width: 2px; height: 64px; z-index: 10;"></div>
<div id="line_6" style="background-color: rgb(0, 0, 0); position: absolute; top: 356px; left: 701px; width: 2px; height: 64px; z-index: 10;"></div>
<div id="line_7" style="background-color: rgb(0, 0, 0); position: absolute; top: 521px; left: 106px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_8" style="background-color: rgb(0, 0, 0); position: absolute; top: 521px; left: 301px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_9" style="background-color: rgb(0, 0, 0); position: absolute; top: 521px; left: 506px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_10" style="background-color: rgb(0, 0, 0); position: absolute; top: 745px; left: 397px; width: 2px; height: 45px; z-index: 10;"></div>
<div id="line_11" style="background-color: rgb(0, 0, 0); position: absolute; top: 744px; left: 106px; width: 597px; height: 2px; z-index: 10;"></div>
<div id="line_12" style="background-color: rgb(0, 0, 0); position: absolute; top: 692px; left: 106px; width: 2px; height: 53px; z-index: 10;"></div>
<div id="line_13" style="background-color: rgb(0, 0, 0); position: absolute; top: 692px; left: 301px; width: 2px; height: 53px; z-index: 10;"></div>
<div id="line_14" style="background-color: rgb(0, 0, 0); position: absolute; top: 692px; left: 506px; width: 2px; height: 53px; z-index: 10;"></div>
<div id="line_15" style="background-color: rgb(0, 0, 0); position: absolute; top: 521px; left: 701px; width: 2px; height: 223px; z-index: 10;"></div>
<div id="line_16" style="background-color: rgb(0, 0, 0); position: absolute; top: 892px; left: 397px; width: 2px; height: 99px; z-index: 10;"></div>
<div id="line_17" style="background-color: rgb(0, 0, 0); position: absolute; top: 930px; left: 120px; width: 570px; height: 2px; z-index: 10;"></div>
<div id="line_18" style="background-color: rgb(0, 0, 0); position: absolute; top: 930px; left: 120px; width: 2px; height: 60px; z-index: 10;"></div>
<div id="line_19" style="background-color: rgb(0, 0, 0); position: absolute; top: 930px; left: 690px; width: 2px; height: 60px; z-index: 10;"></div>
<div id="line_20" style="background-color: rgb(0, 0, 0); position: absolute; top: 1092px; left: 397px; width: 2px; height: 108px; z-index: 10;"></div>
<div id="line_21" style="background-color: rgb(0, 0, 0); position: absolute; top: 1140px; left: 120px; width: 570px; height: 2px; z-index: 10;"></div>
<div id="line_22" style="background-color: rgb(0, 0, 0); position: absolute; top: 1092px; left: 120px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_23" style="background-color: rgb(0, 0, 0); position: absolute; top: 1092px; left: 690px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_24" style="background-color: rgb(0, 0, 0); position: absolute; top: 1302px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_25" style="background-color: rgb(0, 0, 0); position: absolute; top: 1472px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_26" style="background-color: rgb(0, 0, 0); position: absolute; top: 1602px; left: 397px; width: 2px; height: 35px; z-index: 10;"></div>
<div id="line_27" style="background-color: rgb(0, 0, 0); position: absolute; top: 1636px; left: 271px; width: 266px; height: 2px; z-index: 10;"></div>
<div id="line_28" style="background-color: rgb(0, 0, 0); position: absolute; top: 1636px; left: 271px; width: 2px; height: 65px; z-index: 10;"></div>
<div id="line_29" style="background-color: rgb(0, 0, 0); position: absolute; top: 1636px; left: 536px; width: 2px; height: 65px; z-index: 10;"></div>
<div id="line_30" style="background-color: rgb(0, 0, 0); position: absolute; top: 1850px; left: 397px; width: 2px; height: 51px; z-index: 10;"></div>
<div id="line_31" style="background-color: rgb(0, 0, 0); position: absolute; top: 1850px; left: 271px; width: 266px; height: 2px; z-index: 10;"></div>
<div id="line_32" style="background-color: rgb(0, 0, 0); position: absolute; top: 1801px; left: 271px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_33" style="background-color: rgb(0, 0, 0); position: absolute; top: 1801px; left: 535px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_34" style="background-color: rgb(0, 0, 0); position: absolute; top: 2001px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_35" style="background-color: rgb(0, 0, 0); position: absolute; top: 2171px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_36" style="background-color: rgb(0, 0, 0); position: absolute; top: 2341px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_37" style="background-color: rgb(0, 0, 0); position: absolute; top: 2511px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_38" style="background-color: rgb(0, 0, 0); position: absolute; top: 2641px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_39" style="background-color: rgb(0, 0, 0); position: absolute; top: 2811px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_40" style="background-color: rgb(0, 0, 0); position: absolute; top: 2981px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_41" style="background-color: rgb(0, 0, 0); position: absolute; top: 3151px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_42" style="background-color: rgb(0, 0, 0); position: absolute; top: 3321px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_43" style="background-color: rgb(0, 0, 0); position: absolute; top: 3451px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_44" style="background-color: rgb(0, 0, 0); position: absolute; top: 3621px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_45" style="background-color: rgb(0, 0, 0); position: absolute; top: 3751px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_46" style="background-color: rgb(0, 0, 0); position: absolute; top: 3921px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_47" style="background-color: rgb(0, 0, 0); position: absolute; top: 4051px; left: 398px; width: 2px; height: 35px; z-index: 10;"></div>
<div id="line_48" style="background-color: rgb(0, 0, 0); position: absolute; top: 4085px; left: 271px; width: 266px; height: 2px; z-index: 10;"></div>
<div id="line_49" style="background-color: rgb(0, 0, 0); position: absolute; top: 4085px; left: 271px; width: 2px; height: 65px; z-index: 10;"></div>
<div id="line_50" style="background-color: rgb(0, 0, 0); position: absolute; top: 4085px; left: 536px; width: 2px; height: 65px; z-index: 10;"></div>
<div id="line_51" style="background-color: rgb(0, 0, 0); position: absolute; top: 4299px; left: 397px; width: 2px; height: 51px; z-index: 10;"></div>
<div id="line_52" style="background-color: rgb(0, 0, 0); position: absolute; top: 4299px; left: 271px; width: 266px; height: 2px; z-index: 10;"></div>
<div id="line_53" style="background-color: rgb(0, 0, 0); position: absolute; top: 4251px; left: 271px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_54" style="background-color: rgb(0, 0, 0); position: absolute; top: 4251px; left: 535px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_55" style="background-color: rgb(0, 0, 0); position: absolute; top: 4451px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_56" style="background-color: rgb(0, 0, 0); position: absolute; top: 4621px; left: 397px; width: 2px; height: 69px; z-index: 10;"></div>


<div id="arrow_1" style="position: absolute; top: 201px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_2" style="position: absolute; top: 402px; left: 97px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_3" style="position: absolute; top: 402px; left: 292px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_4" style="position: absolute; top: 402px; left: 497px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_5" style="position: absolute; top: 402px; left: 692px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_6" style="position: absolute; top: 572px; left: 97px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_7" style="position: absolute; top: 572px; left: 292px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_8" style="position: absolute; top: 572px; left: 497px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_9" style="position: absolute; top: 772px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_9" style="position: absolute; top: 972px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_10" style="position: absolute; top: 972px; left: 111px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_11" style="position: absolute; top: 972px; left: 681px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_12" style="position: absolute; top: 1182px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_13" style="position: absolute; top: 1352px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_14" style="position: absolute; top: 1522px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_15" style="position: absolute; top: 1682px; left: 262px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_16" style="position: absolute; top: 1682px; left: 527px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_17" style="position: absolute; top: 1882px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_18" style="position: absolute; top: 2052px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_19" style="position: absolute; top: 2222px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_20" style="position: absolute; top: 2392px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_21" style="position: absolute; top: 2562px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_22" style="position: absolute; top: 2692px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_23" style="position: absolute; top: 2862px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_24" style="position: absolute; top: 3032px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_25" style="position: absolute; top: 3202px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_26" style="position: absolute; top: 3372px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_27" style="position: absolute; top: 3502px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_28" style="position: absolute; top: 3672px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_29" style="position: absolute; top: 3802px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_30" style="position: absolute; top: 3972px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_31" style="position: absolute; top: 4132px; left: 262px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_32" style="position: absolute; top: 4132px; left: 527px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_33" style="position: absolute; top: 4332px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_34" style="position: absolute; top: 4502px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_35" style="position: absolute; top: 4672px; left: 388px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<!--流程图结束-->
</div>
</body>


<!--显示当前时间-->
<script>

	//$("#d0e90d18-ba53-4e6c-b695-aadaa905c88f").css("background-color","#FF0000");
	function showLocale(objD)  
	{  
		var str,colorhead,colorfoot;  
		var yy = objD.getYear();  
		if(yy<1900) yy = yy+1900;  
		var MM = objD.getMonth()+1;  
		if(MM<10) MM = '0' + MM;  
		var dd = objD.getDate();  
		if(dd<10) dd = '0' + dd;  
		var hh = objD.getHours();  
		if(hh<10) hh = '0' + hh;  
		var mm = objD.getMinutes();  
		if(mm<10) mm = '0' + mm;  
		var ss = objD.getSeconds();  
		if(ss<10) ss = '0' + ss;  
		var ww = objD.getDay();  
		if  (ww==0)  ww="星期日";  
		if  (ww==1)  ww="星期一";  
		if  (ww==2)  ww="星期二";  
		if  (ww==3)  ww="星期三";  
		if  (ww==4)  ww="星期四";  
		if  (ww==5)  ww="星期五";  
		if  (ww==6)  ww="星期六";  
		str = yy + "-" + MM + "-" + dd + " " + hh + ":" + mm + ":" + ss; 
		return(str);  
	};  
	$(document).ready(function(){
		setInterval(function() {
  			var date = new Date();
			$("#time").text(showLocale(date));
		}, 1000);	
	})
</script>

<script type="text/javascript">
function reshtable(){
	$.ajax({
	   type: "GET",
	   url: "getTaskStartJobs",
	   success: function(info){
		   if(info != "undefined" || info != null){
	             info = eval("(" + info + ")"); //将返回的json字符串转换为json对象
		     var jobs = info.jobinstances;   //获取运行的任务			
                     var hasrunning = false;            //本次获取的任务中，是否有在运行中的任务
                                                        //如果有，那么就滚动到最下面的运行中的任务所在的位置
                                                        //如果没有，就滚动到最下面的 已成功或已失败任务所在的位置
                     var scrollrunning = 0;             //用来存储最底下的那个 正在运行中的任务的位置
                     var scrolllen = 0;                 //用来存储最底下那个已成功或已失败任务位置
                     var windowh = $(window).height();
		     for(var i = 0 ; i < jobs.length;i++)
		     {
		    	 if(jobs[i].status=="未开始"){
		    		 $("#"+jobs[i].id).css("background-color","#E18CDE");
		    	 }else if(jobs[i].status =="进行中")
		    	 {
                                 hasrunning = true;
		    		 $("#"+jobs[i].id).css("background-color","#9FD7FB");
                                 var tmpobj = $("#"+jobs[i].id).offset(); 
                                 if(tmpobj != null){
                                    console.info("running job: " + jobs[i].id);  
		    		    var tmplen = $("#"+jobs[i].id).offset().top;	//获取进行中任务的框框的位置，如果页面滚动到的位置太靠近浏览器上边缘，就减小该偏移值大小 
				    console.info("running tmplen is" + tmplen);
		    		    if(scrollrunning < tmplen){						//取从后台取的数据里面最底下的一个进行中任务的位置为偏移值  
		    			 scrollrunning = tmplen;
		    		    }
				 }
		    	 }else if (jobs[i].status == "已成功")
		    	 {
		             $("#"+jobs[i].id).css("background-color","#5BD75B");
                             if(hasrunning == false){
                                 var tmpobj = $("#"+jobs[i].id).offset(); 
                                 if(tmpobj != null){
                                      console.info("success job: " + jobs[i].id);  
		    		      var tmplen = $("#"+jobs[i].id).offset().top;	//获取进行中任务的框框的位置，如果页面滚动到的位置太靠近浏览器上边缘，就减小该偏移值大小 
				      console.info("success tmplen is" + tmplen);
		    		      if(scrolllen < tmplen){						//取从后台取的数据里面最底下的一个进行中任务的位置为偏移值  
		    			 scrolllen = tmplen;
		    		      }
			         }
                             }
		    	 }else if(jobs[i].status =="已失败")
		    	 {
		    	     $("#"+jobs[i].id).css("background-color","#FF9873");
                             if(hasrunning == false){
                                 var tmpobj = $("#"+jobs[i].id).offset(); 
                                 if(tmpobj != null){
                                     console.info("fail job: " + jobs[i].id);  
		    	             var tmplen = $("#"+jobs[i].id).offset().top;	//获取进行中任务的框框的位置，如果页面滚动到的位置太靠近浏览器上边缘，就减小该偏移值大小 
				     console.info("fail tmplen is" + tmplen);
		    		     if(scrolllen < tmplen){						//取从后台取的数据里面最底下的一个进行中任务的位置为偏移值  
		    		         scrolllen = tmplen;
		    		     }
				 }
                             }
                	 }
		    
		     }
                     if(hasrunning == false){
                         console.info("页面高度的一半是: " + windowh*0.5);
		         if(scrolllen >= windowh*0.5){
		           $(document).scrollTop(scrolllen-windowh*0.5);
                           console.info("当前无在运行中任务");
                         }else if(scrolllen < windowh*0.5){
                           $(document).scrollTop(0);
                           console.info("当前无在运行中任务");
                         }
                     }else if(hasrunning == true){
                         console.info("页面高度的一半是: " + windowh*0.5);
		         if(scrollrunning >= windowh*0.5){
		           $(document).scrollTop(scrollrunning-windowh*0.5);
                           console.info("当前有在运行中任务");
                         }else if(scrollrunning < windowh*0.5){
                           $(document).scrollTop(0);
                           console.info("当前有在运行中任务");
                         }
                     }
		   }
	   }
	});
}
setInterval(reshtable, 5000);
</script>


</html>
