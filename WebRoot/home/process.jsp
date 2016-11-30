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
	<div style="float:left;width:34%;margin-top:6px;text-align:right;"><img src="img/anhui.png"></div>
	<div style="float:right;width:65%;"><font size="6px">安徽省联社2016年度灾备切换演练</font></div>
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
<div id="2744676e-7c01-39c0-9bb6-975bf5fdb994" class="start" style="position: absolute; top:90px; left:322px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">场景一介绍</div>
</div>

<div id="c9a6f828-8870-334e-b7fc-ed454465de11" style="position: absolute; top: 260px; left: 20px; border: 1px solid rgb(0, 0, 0); width: 200px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:14px;">发现告警、值班员报告</div>
	<div style="font-size:14px;margin-top:5px;">高艳</div>
</div>

<div id="afac8122-0937-31a9-acac-dd521e3d9729" style="position: absolute; top: 260px; left: 302px; border: 1px solid rgb(0, 0, 0); width: 200px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">网络状态健康检查</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：张振华、杨明</div>
</div>

<div id="5f235871-531e-3a2a-9072-15fee8c895de" style="position: absolute; top: 260px; left: 590px; border: 1px solid rgb(0, 0, 0); width: 200px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">灾备应用版本检查</div>
	<div style="font-size:14px;margin-top:5px;">执行人：桑晓东、刘军、胡鹏</div>
	<div style="font-size:14px;margin-top:5px;">复核人：曹信、涂兵、李丹</div>
</div>

<div id="59a567fe-59dc-3ae6-bdee-587627900043" class="checkDone" style="position: absolute; top:420px; left:322px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">完成检查工作</div>
</div>

<div id="c8336301-76ff-38d2-ae91-d6e758424244" style="position: absolute; top: 550px; left: 322px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">短信通知零时开始切换</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王漫</div>
	<div style="font-size:15px;margin-top:5px;">复核人：孙旭东</div>
</div>

<div id="e9f7ae24-95ac-3a13-9ea1-af5597b9a839" style="position: absolute; top: 720px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">停生产ATMP应用</div>
	<div style="font-size:15px;margin-top:5px;">执行人：桑晓东</div>
	<div style="font-size:15px;margin-top:5px;">复核人：蔡慧芬</div>
</div>

<div id="dc547eb5-5ae4-3ed1-b285-2c9a44978fec" class="checkDone" style="position: absolute; top: 904px; left: 322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">开始暂停存储复制</div>
</div>

<div id="aaddb75a-7e1a-3ea7-8e78-afa10527b517" style="position: absolute; top: 1089px; left: 35px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">暂停柜面存储复制</div>
	<div style="font-size:15px;margin-top:5px;">执行人：钱小强</div>
	<div style="font-size:15px;margin-top:5px;">复核人：闵涵</div>
</div>

<div id="b7c8e0f5-b9c8-3ace-9856-c7cde3ec2e2d" style="position: absolute; top: 1089px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">暂停核心存储复制</div>
	<div style="font-size:15px;margin-top:5px;">执行人：周猛军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：陈天舒</div>
</div>

<div id="1ae814c3-e510-301a-b24b-3c16cf9f0c16" style="position: absolute; top: 1089px; left: 605px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">暂停指纹存储复制</div>
	<div style="font-size:15px;margin-top:5px;">执行人：钱小强</div>
	<div style="font-size:15px;margin-top:5px;">复核人：闵涵</div>
</div>

<div id="273b826c-cbca-37e4-bd8e-f5c02aaef059" class="checkDone" style="position: absolute; top:1249px; left:322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">完成暂停存储复制</div>
</div>

<div id="5fa67ece-244c-36e5-8fb6-60c701195f60" style="position: absolute; top: 1379px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">切断生产广域网</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：张振华、杨明</div>
</div>

<div id="61493515-84fa-3915-acc3-0f0a42ef5031" style="position: absolute; top: 1549px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">激活灾备网络设置</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：张振华、杨明</div>
</div>

<div id="ba1fcab3-f385-35b8-8cb2-1412abffb057" class="checkDone" style="position: absolute; top: 1734px; left: 322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">开始挂载存储盘</div>
</div>

<div id="9c807ee3-d71d-308e-8b71-9a2b6ea9ffed" style="position: absolute; top: 1889px; left: 110px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">灾备柜面挂载存储盘</div>
	<div style="font-size:15px;margin-top:5px;">执行人：钱小强</div>
	<div style="font-size:15px;margin-top:5px;">复核人：闵涵</div>
</div>

<div id="9d12ea6e-922d-3bc8-a02d-fb95504e97ec" style="position: absolute; top: 2070px; left: 524px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">灾备指纹挂存储盘</div>
	<div style="font-size:15px;margin-top:5px;">执行人：钱小强</div>
	<div style="font-size:15px;margin-top:5px;">复核人：闵涵</div>
</div>

<div id="c86c4293-7ca9-301e-9318-142925917511" style="position: absolute; top: 2070px; left: 0px; border: 1px solid rgb(0, 0, 0); width: 130px; height: 70px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">挂载灾备柜面</br>前置1存储盘</div>
</div>

<div id="052fb1c2-8316-3653-9f01-a98619a76d4b" style="position: absolute; top: 2070px; left: 131px; border: 1px solid rgb(0, 0, 0); width: 130px; height: 70px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">挂载灾备柜面</br>前置4存储盘</div>
</div>

<div id="d5df12ba-002f-3ab0-836e-6d010f4a4382" style="position: absolute; top: 2070px; left: 263px; border-top: 1px solid rgb(0, 0, 0); border-bottom: 1px solid rgb(0, 0, 0); border-right: 1px solid rgb(0, 0, 0); width: 130px; height: 70px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">挂载灾备柜面</br>前置5存储盘</div>
</div>

<div id="9f2fac0a-52dd-3772-86e9-accb5560574c" style="position: absolute; top: 2141px; left: 0px; border: 1px solid rgb(0, 0, 0); width: 130px; height: 70px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">挂载灾备柜面</br>前置7存储盘</div>
</div>

<div id="847a8c99-424d-3636-b385-223706f8e1fa" style="position: absolute; top: 2141px; left: 131px; border: 1px solid rgb(0, 0, 0); width: 130px; height: 70px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">挂载灾备柜面</br>前置8存储盘</div>
</div>

<div id="f4b6dacb-397f-3de7-8217-4851ece920d6" style="position: absolute; top: 2141px; left: 263px; border-top: 1px solid rgb(0, 0, 0); border-bottom: 1px solid rgb(0, 0, 0); border-right: 1px solid rgb(0, 0, 0); width: 130px; height: 70px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">挂载灾备柜面</br>前置9存储盘</div>
</div>

<div id="360a5d80-4aaa-3fbe-9c72-bdca4467dafc" style="position: absolute; top: 2212px; left: 131px; border: 1px solid rgb(0, 0, 0); width: 130px; height: 70px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">挂载灾备柜面</br>前置10存储盘</div>
</div>

<div id="09853ce3-0f53-35e2-896f-66794dcdb80b" style="position: absolute; top: 2380px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">完成挂载并人工核查</div>
	<div style="font-size:15px;margin-top:5px;">执行人：钱小强</div>
	<div style="font-size:15px;margin-top:5px;">复核人：闵涵</div>
</div>

<div id="ea8bc61a-b49b-3329-a6e8-672b86cf9a99" class="checkDone" style="position: absolute; top: 2597px; left: 322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">开始启动灾备应用</div>
</div>

<div id="6d6675cb-2c27-3777-aecc-db71cccff7c1" style="position: absolute; top: 2773px; left: 17px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">启动灾备柜面前置应用</div>
	<div style="font-size:15px;margin-top:5px;">执行人：刘军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：涂兵</div>
</div>

<div id="048c5bcf-fb8e-3ff5-9948-9fcc6bd1a053" style="position: absolute; top: 2773px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">启动灾备核心应用</div>
	<div style="font-size:15px;margin-top:5px;">执行人：桑晓东</div>
	<div style="font-size:15px;margin-top:5px;">复核人：曹信</div>
</div>

<div id="d563b0f4-9b5f-321e-9a77-a851c1cb6077" style="position: absolute; top: 2773px; left: 617px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">启动灾备指纹登录应用</div>
	<div style="font-size:15px;margin-top:5px;">执行人：胡鹏</div>
	<div style="font-size:15px;margin-top:5px;">复核人：李丹</div>
</div>

<div id="1c8a5639-8d21-3cd1-9d2c-fc069d015b19" class="checkDone" style="position: absolute; top:2933px; left:322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">完成启动灾备应用</div>
</div>

<div id="bed9df19-4306-3c57-b9a8-7a742b7bc676" style="position: absolute; top: 3063px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">发布灾备核心服务IP</div>
	<div style="font-size:15px;margin-top:5px;">执行人：周猛军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：陈天舒</div>
</div>

<div id="4f4beb4c-1dc1-36f6-91b6-0811182d8efa" style="position: absolute; top: 3233px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">短信通知灾备业务验证</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王漫</div>
	<div style="font-size:15px;margin-top:5px;">复核人：孙旭东</div>
</div>

<div id="ea8c947d-b8c8-3adb-b26c-2ccd5dbd899b" style="position: absolute; top: 3403px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:22px;">灾备业务验证</div>
	<div style="font-size:15px;margin-top:5px;">执行人：龚本清</div>
</div>

<div id="3f0995f9-3377-383f-b1e3-883ead5d29b4" style="position: absolute; top: 3573px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">启动3G</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：杨明、张振华</div>
</div>

<div id="6f0d0f61-88c4-3e76-8f98-a892e11c1f5e" style="position: absolute; top: 3745px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">灾备到生产网络回切</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：张振华、杨明</div>
</div>

<div id="02ea6574-9692-3b28-8faa-7775fd529ee6" class="checkDone" style="position: absolute; top: 3913px; left: 322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">开始启动生产应用</div>
</div>

<div id="e704c94e-94a8-3776-b3fc-73103343422b" style="position: absolute; top: 4084px; left: 22px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">启动生产ATMP应用</div>
	<div style="font-size:15px;margin-top:5px;">执行人：桑晓东</div>
	<div style="font-size:15px;margin-top:5px;">复核人：蔡慧芬</div>
</div>

<div id="b1ad45c1-d148-394d-8702-fd267d531f47" style="position: absolute; top: 4084px; left: 322px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">启动生产柜面前置应用</div>
	<div style="font-size:15px;margin-top:5px;">执行人：刘军</div>
	<div style="font-size:15px;margin-top:5px;">复核人：涂兵</div>
</div>

<div id="9182f658-deca-3711-86c1-87819fa79662" style="position: absolute; top: 4084px; left: 622px; border: 1px solid rgb(0, 0, 0); width: 170px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">启动生产指纹登录应用</div>
	<div style="font-size:15px;margin-top:5px;">执行人：胡鹏</div>
	<div style="font-size:15px;margin-top:5px;">复核人：李丹</div>
</div>

<div id="c7828541-57dd-3fa6-bc6e-74c1941afb05" class="checkDone" style="position: absolute; top:4243px; left:322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">完成启动生产应用</div>
</div>

<div id="15e7d733-3dcf-3058-8f6e-273cf1ae5930" style="position: absolute; top: 4374px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:12px;">短信通知生产业务验证</div>
	<div style="font-size:15px;margin-top:5px;">执行人：王漫</div>
	<div style="font-size:15px;margin-top:5px;">复核人：孙旭东</div>
</div>

<div id="681b6af1-b1d7-3e19-84fa-5080afd83706" style="position: absolute; top: 4544px; left: 317px; border: 1px solid rgb(0, 0, 0); width: 180px; height: 100px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:22px;">生产业务验证</div>
	<div style="font-size:15px;margin-top:5px;">执行人：龚本清</div>
</div>

<div id="3a6b1d79-3a6b-38fd-a094-047f6c0bff5f" class="checkDone" style="position: absolute; top:4714px; left:322px; width:170px; text-align:center; z-index: 10;">
	<div style="font-size:16px;margin-top:17px;">演练结束</div>
</div>

<div class="end" style="position: absolute; top:4764px; left:322px; width:170px; text-align:center; z-index: 10;"></div>


<div id="line_1" style="background-color: rgb(0, 0, 0); position: absolute; top: 151px; left: 402px; width: 2px; height: 110px; z-index: 10;"></div>
<div id="line_2" style="background-color: rgb(0, 0, 0); position: absolute; top: 201px; left: 115px; width: 577px; height: 2px; z-index: 10;"></div>
<div id="line_3" style="background-color: rgb(0, 0, 0); position: absolute; top: 201px; left: 115px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_4" style="background-color: rgb(0, 0, 0); position: absolute; top: 201px; left: 690px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_5" style="background-color: rgb(0, 0, 0); position: absolute; top: 361px; left: 115px; width: 2px; height: 89px; z-index: 10;"></div>
<div id="line_6" style="background-color: rgb(0, 0, 0); position: absolute; top: 361px; left: 402px; width: 2px; height: 60px; z-index: 10;"></div>
<div id="line_7" style="background-color: rgb(0, 0, 0); position: absolute; top: 361px; left: 690px; width: 2px; height: 89px; z-index: 10;"></div>
<div id="line_8" style="background-color: rgb(0, 0, 0); position: absolute; top: 450px; left: 115px; width: 208px; height: 2px; z-index: 10;"></div>
<div id="line_9" style="background-color: rgb(0, 0, 0); position: absolute; top: 450px; left: 488px; width: 204px; height: 2px; z-index: 10;"></div>
<div id="line_10" style="background-color: rgb(0, 0, 0); position: absolute; top: 481px; left: 402px; width: 2px; height: 70px; z-index: 10;"></div>
<div id="line_11" style="background-color: rgb(0, 0, 0); position: absolute; top: 651px; left: 402px; width: 2px; height: 70px; z-index: 10;"></div>
<div id="line_20" style="background-color: rgb(0, 0, 0); position: absolute; top: 821px; left: 402px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_21" style="background-color: rgb(0, 0, 0); position: absolute; top: 965px; left: 407px; width: 2px; height: 110px; z-index: 10;"></div>
<div id="line_22" style="background-color: rgb(0, 0, 0); position: absolute; top: 1190px; left: 407px; width: 2px; height: 60px; z-index: 10;"></div>
<div id="line_23" style="background-color: rgb(0, 0, 0); position: absolute; top: 1026px; left: 115px; width: 577px; height: 2px; z-index: 10;"></div>
<div id="line_24" style="background-color: rgb(0, 0, 0); position: absolute; top: 1026px; left: 115px; width: 2px; height: 49px; z-index: 10;"></div>
<div id="line_25" style="background-color: rgb(0, 0, 0); position: absolute; top: 1026px; left: 690px; width: 2px; height: 49px; z-index: 10;"></div>
<div id="line_26" style="background-color: rgb(0, 0, 0); position: absolute; top: 1190px; left: 120px; width: 2px; height: 92px; z-index: 10;"></div>
<div id="line_27" style="background-color: rgb(0, 0, 0); position: absolute; top: 1190px; left: 690px; width: 2px; height: 92px; z-index: 10;"></div>
<div id="line_28" style="background-color: rgb(0, 0, 0); position: absolute; top: 1281px; left: 120px; width: 202px; height: 2px; z-index: 10;"></div>
<div id="line_29" style="background-color: rgb(0, 0, 0); position: absolute; top: 1281px; left: 493px; width: 199px; height: 2px; z-index: 10;"></div>
<div id="line_30" style="background-color: rgb(0, 0, 0); position: absolute; top: 1311px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_31" style="background-color: rgb(0, 0, 0); position: absolute; top: 1480px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_32" style="background-color: rgb(0, 0, 0); position: absolute; top: 1650px; left: 407px; width: 2px; height: 76px; z-index: 10;"></div>
<div id="line_33" style="background-color: rgb(0, 0, 0); position: absolute; top: 1795px; left: 407px; width: 2px; height: 46px; z-index: 10;"></div>
<div id="line_34" style="background-color: rgb(0, 0, 0); position: absolute; top: 1840px; left: 200px; width: 413px; height: 2px; z-index: 10;"></div>
<div id="line_35" style="background-color: rgb(0, 0, 0); position: absolute; top: 1840px; left: 200px; width: 2px; height: 49px; z-index: 10;"></div>
<div id="line_36" style="background-color: rgb(0, 0, 0); position: absolute; top: 1840px; left: 612px; width: 2px; height: 220px; z-index: 10;"></div>
<div id="line_37" style="background-color: rgb(0, 0, 0); position: absolute; top: 2283px; left: 200px; width: 2px; height: 150px; z-index: 10;"></div>
<div id="line_38" style="background-color: rgb(0, 0, 0); position: absolute; top: 2172px; left: 612px; width: 2px; height: 262px; z-index: 10;"></div>
<div id="line_39" style="background-color: rgb(0, 0, 0); position: absolute; top: 2433px; left: 200px; width: 116px; height: 2px; z-index: 10;"></div>
<div id="line_40" style="background-color: rgb(0, 0, 0); position: absolute; top: 2433px; left: 498px; width: 116px; height: 2px; z-index: 10;"></div>
<div id="line_41" style="background-color: rgb(0, 0, 0); position: absolute; top: 2481px; left: 407px; width: 2px; height: 116px; z-index: 10;"></div>
<div id="line_42" style="background-color: rgb(0, 0, 0); position: absolute; top: 2658px; left: 407px; width: 2px; height: 100px; z-index: 10;"></div>
<div id="line_43" style="background-color: rgb(0, 0, 0); position: absolute; top: 2718px; left: 108px; width: 601px; height: 2px; z-index: 10;"></div>
<div id="line_44" style="background-color: rgb(0, 0, 0); position: absolute; top: 2718px; left: 108px; width: 2px; height: 40px; z-index: 10;"></div>
<div id="line_45" style="background-color: rgb(0, 0, 0); position: absolute; top: 2718px; left: 708px; width: 2px; height: 40px; z-index: 10;"></div>
<div id="line_46" style="background-color: rgb(0, 0, 0); position: absolute; top: 2874px; left: 407px; width: 2px; height: 59px; z-index: 10;"></div>
<div id="line_47" style="background-color: rgb(0, 0, 0); position: absolute; top: 2963px; left: 108px; width: 215px; height: 2px; z-index: 10;"></div>
<div id="line_48" style="background-color: rgb(0, 0, 0); position: absolute; top: 2963px; left: 493px; width: 217px; height: 2px; z-index: 10;"></div>
<div id="line_49" style="background-color: rgb(0, 0, 0); position: absolute; top: 2874px; left: 108px; width: 2px; height: 90px; z-index: 10;"></div>
<div id="line_50" style="background-color: rgb(0, 0, 0); position: absolute; top: 2874px; left: 708px; width: 2px; height: 90px; z-index: 10;"></div>
<div id="line_51" style="background-color: rgb(0, 0, 0); position: absolute; top: 2994px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_52" style="background-color: rgb(0, 0, 0); position: absolute; top: 3164px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_53" style="background-color: rgb(0, 0, 0); position: absolute; top: 3334px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_54" style="background-color: rgb(0, 0, 0); position: absolute; top: 3504px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_55" style="background-color: rgb(0, 0, 0); position: absolute; top: 3847px; left: 407px; width: 2px; height: 49px; z-index: 10;"></div>
<div id="line_56" style="background-color: rgb(0, 0, 0); position: absolute; top: 3974px; left: 407px; width: 2px; height: 95px; z-index: 10;"></div>
<div id="line_57" style="background-color: rgb(0, 0, 0); position: absolute; top: 4034px; left: 108px; width: 601px; height: 2px; z-index: 10;"></div>
<div id="line_58" style="background-color: rgb(0, 0, 0); position: absolute; top: 4034px; left: 108px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_61" style="background-color: rgb(0, 0, 0); position: absolute; top: 4034px; left: 708px; width: 2px; height: 50px; z-index: 10;"></div>
<div id="line_62" style="background-color: rgb(0, 0, 0); position: absolute; top: 4185px; left: 708px; width: 2px; height: 88px; z-index: 10;"></div>
<div id="line_64" style="background-color: rgb(0, 0, 0); position: absolute; top: 4185px; left: 108px; width: 2px; height: 88px; z-index: 10;"></div>
<div id="line_66" style="background-color: rgb(0, 0, 0); position: absolute; top: 4272px; left: 493px; width: 217px; height: 2px; z-index: 10;"></div>
<div id="line_67" style="background-color: rgb(0, 0, 0); position: absolute; top: 4272px; left: 108px; width: 215px; height: 2px; z-index: 10;"></div>
<div id="line_68" style="background-color: rgb(0, 0, 0); position: absolute; top: 4305px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_69" style="background-color: rgb(0, 0, 0); position: absolute; top: 4475px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_70" style="background-color: rgb(0, 0, 0); position: absolute; top: 4645px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>
<div id="line_71" style="background-color: rgb(0, 0, 0); position: absolute; top: 4185px; left: 407px; width: 2px; height: 59px; z-index: 10;"></div>
<div id="line_72" style="background-color: rgb(0, 0, 0); position: absolute; top: 1990px; left: 200px; width: 2px; height: 81px; z-index: 10;"></div>
<div id="line_73" style="background-color: rgb(0, 0, 0); position: absolute; top: 3674px; left: 407px; width: 2px; height: 69px; z-index: 10;"></div>


<div id="arrow_1" style="position: absolute; top: 240px; left: 106px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_2" style="position: absolute; top: 241px; left: 393px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_3" style="position: absolute; top: 402px; left: 393px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_4" style="position: absolute; top: 240px; left: 682px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_5" style="position: absolute; top: 441px; left: 302px; border-left: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_6" style="position: absolute; top: 441px; left: 483px; border-right: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_7" style="position: absolute; top: 531px; left: 393px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_8" style="position: absolute; top: 702px; left: 393px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_13" style="position: absolute; top: 885px; left: 393px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_14" style="position: absolute; top: 1071px; left: 106px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_15" style="position: absolute; top: 1071px; left: 681px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_16" style="position: absolute; top: 1071px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_17" style="position: absolute; top: 1231px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_18" style="position: absolute; top: 1272px; left: 303px; border-left: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_19" style="position: absolute; top: 1272px; left: 493px; border-right: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_20" style="position: absolute; top: 1361px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_21" style="position: absolute; top: 1531px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_22" style="position: absolute; top: 1715px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_23" style="position: absolute; top: 1871px; left: 191px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_24" style="position: absolute; top: 2051px; left: 603px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_25" style="position: absolute; top: 2424px; left: 299px; border-left: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_26" style="position: absolute; top: 2424px; left: 498px; border-right: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_27" style="position: absolute; top: 2578px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_28" style="position: absolute; top: 2755px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_29" style="position: absolute; top: 2755px; left: 99px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_30" style="position: absolute; top: 2755px; left: 699px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_31" style="position: absolute; top: 2915px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_32" style="position: absolute; top: 2954px; left: 303px; border-left: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_33" style="position: absolute; top: 2954px; left: 493px; border-right: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_34" style="position: absolute; top: 3045px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_35" style="position: absolute; top: 3215px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_36" style="position: absolute; top: 3385px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_37" style="position: absolute; top: 3555px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_38" style="position: absolute; top: 3894px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_39" style="position: absolute; top: 4065px; left: 99px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_41" style="position: absolute; top: 4065px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_42" style="position: absolute; top: 4065px; left: 699px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_43" style="position: absolute; top: 4263px; left: 303px; border-left: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_44" style="position: absolute; top: 4263px; left: 493px; border-right: 20px solid rgb(0, 0, 0); border-top: 10px solid transparent; border-bottom: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_45" style="position: absolute; top: 4356px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_46" style="position: absolute; top: 4526px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_47" style="position: absolute; top: 4696px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_48" style="position: absolute; top: 4225px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_49" style="position: absolute; top: 2052px; left: 191px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
<div id="arrow_50" style="position: absolute; top: 3726px; left: 398px; border-top: 20px solid rgb(0, 0, 0); border-left: 10px solid transparent; border-right: 10px solid transparent; z-index: 10;"></div>
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
setInterval(reshtable, 10000);
</script>


</html>
