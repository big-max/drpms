var unicorn_data_config = {
  "sidebar": {
    "menus": [ 
      { "title": "首页", "icon": "home", "link": "../index/index.html"},
      { "title": "云主机管理", "icon": "th-list", "link": "#","submenus": [
        { "title": "入门向导", "link": "../instance/example_page1.html" },
				{ "title": "平台概况汇总", "link": "../instance/instanceSurvey.html" },
				{ "title": "虚拟主机", "link": "../instance/instanceKvm_1.html" },
				{ "title": "数据卷盘", "link": "../blockstorage/volume_list.html" },
			]},
			{ "title": "安全管理", "icon": "signal", "link": "#", "submenus": [
				{ "title": "安全组", "link": "../network/securityGroups_list.html" },
				{ "title": "密钥对", "link": "../instance/example_page7.html" },
			] },
			{ "title": "负载均衡管理", "icon": "file", "link": "#", "submenus": [
				{ "title": "入门向导", "link": "../lbaas/ibaas_guide.html" },
				{ "title": "负载均衡器", "link": "../lbaas/loadbalancers.html" },
				{ "title": "健康监控", "link": "../lbaas/healthMonitor_list.html" },
				{ "title": "资源池", "link": "../lbaas/pool_list.html" },
			] },
			{ "title": "弹性伸缩管理", "icon": "wrench", "link": "#", "submenus": [
				{ "title": "弹性伸缩", "link": "../elasticexpansion/elasticexpansion.html" },
				{ "title": "监控告警", "link": "../elasticexpansion/alarm_list.html" },
				{ "title": "报警策略(Alarm)", "link": "../elasticexpansion/alarmstrategy.html" }
			] },
			/*{ "title": "中间件管理", "icon": "wrench", "link": "#", "submenus": [
				{ "title": "数据库(mysql)", "link": "../middleware/mysql_list_1.html" },
				{ "title": "应用服务器(tomcat)", "link": "../middleware/tomcat_list_1.html" }
			] },*/
			{ "title": "系统管理", "icon": "globe", "link": "#", "submenus": [
				{ "title": "镜像模板", "link": "../image/image_list.html" },
				{ "title": "虚拟网络", "link": "../network/network_list.html" },
				{ "title": "实例类型", "link": "../instance/example_page6.html" },
				{ "title": "字典管理", "link": "../identity/dictionary_list.html" },
				{ "title": "系统信息", "link": "../network/systeminfo.html" },
				{ "title": "健康巡检", "link": "../network/healthinspection.html" },
			] },
			{ "title": "报表管理", "icon": "chevron-right", "link": "#", "submenus": [
					{ "title": "主机资源使用情况", "link": "../cloudsheet/byhost.html" },
					{ "title": "主机别资源使用情况", "link": "../cloudsheet/byhost2.html" },
					{ "title": "主机运行状态", "link": "../cloudsheet/hostrunstate.html" },
					{ "title": "租户配额使用情况", "link": "../cloudsheet/bytenant.html" },
					{ "title": "租户别配额使用情况", "link": "../cloudsheet/bytenant2.html" },
					{ "title": "网络IP使用情况", "link": "../cloudsheet/bynetwork.html" },
					{ "title": "虚拟机使用实例数", "link": "../cloudsheet/bytime.html" },
					{ "title": "虚拟机TopN使用率", "link": "../cloudsheet/topN.html" }
			] },
			{ "title": "租户管理", "icon": "picture", "link": "#", "submenus": [
				{ "title": "租户管理", "link": "../identity/tenant_list.html" },
				{ "title": "用户管理", "link": "../identity/user_list.html" },
			] }
    ]
  },
  "pages": {
     "home": { "link": "../index/index.html" }
  }
};

var unicorn_data_render = function(cfg) {

  _.templateSettings.interpolate = /{{([\s\S]+?)}}/g;
  
  var renders = {}
  renders['submenus'] = function(cfg) {
    var lis = '';
    var tpl = _.template('<li><a href="{{link}}">{{title}}</a></li>');
    _.each(cfg, function(v) {
       lis += tpl(v);
    });
    return lis ? '<ul>' + lis + '</ul>' : '';
  }
  renders['menus'] = function(cfg) {
    var subs = '';
    var tpl = _.template('<li class="{{clazzs}} {{status}}"><a href="{{link}}"><i class="icon icon-{{icon}}"></i><span>{{title}}</span>{{label}}</a>{{subs}}</li>');
	var lbl = '<span class="label"></span>';
    _.each(cfg, function(v) {
       v['subs'] = v['submenus'] ? renders['submenus']( v['submenus'] ) : '';
	   v['label'] = v['subs'] ? lbl : '';
       v['clazzs'] = v['submenus'] ? 'submenu' : '';
       subs += tpl(v);
    });
    return subs ? '<ul>' + subs + '</ul>' : '';
  }
  renders['sidebar'] = function(cfg) {
    var seg = '';
    var v = cfg;
    var subs = v['menus'] ? renders['menus']( v['menus'] ) : '';
    var tpl = _.template('<a href="{{link}}" class="{{clazzs}}">{{title}}<i class="icon icon-{{icon}}"></i></a> {{subs}}');
    
    cfg['subs'] = subs;
    return tpl(cfg);
  }
  
  if(cfg && cfg.pages) {
    var find = null;
    var findv = null;
    _.each(cfg.pages, function(v, k) {
      if(v && v.status && v.status.match('active')) {
        find = k;
        findv = v.status;
      }
    });
    _.each(cfg.sidebar.menus, function(v) {
      if(find && v && v.icon == find) {
        v['status'] = findv;
      }
    });
  }	
      
  _.each(cfg, function(v, k) {
    if(renders[k]) {
      var html = renders[k](v);
      $('#' + k).html(html);
    }
  });
};

var unicorn_popwin_render = function(){
  //下一页
  var _popWin = $('.pop-window');
  $(".btn-next", _popWin).click(function(){
    $(this).parents(".aublock").css("display","none");
    $(this).parents(".aublock").next(".aublock").css("display","block");
  })	
  //上一页
  $(".btn-up", _popWin).click(function(){
    $(this).parents(".aublock").css("display","none");
    $(this).parents(".aublock").prev(".aublock").css("display","block");
  })	
  //弹层内部选项卡
  $(".ptab li", _popWin).each( function(i){ 
    $(this).click(function(){
      $(this).addClass("active").siblings("li").removeClass("active");
      $(".p-content").eq(i).addClass("tabnow").siblings(".p-content").removeClass("tabnow");
    });
  });
  //page页面选项卡
  $(".tabselect a").each( function(i){ 
    $(this).click(function(){
      $(this).addClass("active").siblings("a").removeClass("active");
      $(this).parents(".tabselect").siblings(".p-content").eq(i).addClass("tabnow").siblings(".p-content").removeClass("tabnow");
    });
  });
  //镜像点击
  $(".mirror li a,.mirrormin li a,.mirrorBig li a", _popWin).click(function(){
    $(this).addClass("mirrorSayOn").parent("li").siblings().find("a").removeClass("mirrorSayOn"); 
  })
  //选择网络
  $(".mirrorImg li a,.mirrorAuto li a", _popWin).click(function(){
    $(this).toggleClass("mirrorSayOn");
  })
  //查看更多
  $(".moreIcon,.moreShow").click(function(){
    $(this).parent().siblings(".more-content").slideToggle(200);
  })
	$(".moredetail").click(function(){
		$(this).toggleClass("moreup");
    $(this).parent().siblings(".more-content").slideToggle(200);
  })
}

var page_data = null;


//根据下拉框选中的值,切换div 
//1.在jsp页面需要定义一个select id, 然后select 调用onchange事件 onchange=changeDivShow('selectId')
//2.在div的class中添加 "sel_selectvalue" selectvalue 是选中的select下拉的值
//样例 安全组详情页面 添加安全组规则(securityGroups_detail.html)
var changeDivShow = function(selectId){
	var selval = $('#'+selectId).val();//已经选中的select option value
	$("#"+selectId+" option").each(function(){ //遍历全部option
		var value = $(this).val(); //获取option的内容
		if(selval == value){ 
			$('.sel_'+value).show();
		}else{
			$('.sel_'+value).hide();
		}
	});
  }
/*云主机管理*/
$(".instanadm").click(function(){
  $(".instanbox").slideToggle();
});
//虚拟主机
$(".instan span").click(function(){
    $(this).find(".instanselect").toggle();
		$(this).addClass("selected").siblings("span").removeClass("selected");
		$(this).removeClass("otherselect");
		$(this).removeClass("shover");
  })
//instan鼠标划过效果
$('.instan .otherselect').live('mouseenter',function(){
	$(this).addClass("shover");
	$(this).siblings("span").addClass("otherselect");
	$(this).siblings("span").find(".instanselect").hide();
}).live('mouseout',function(){
	$(this).removeClass("shover");
});
//滚动的表格	
	$(".btable_div").scroll( function () {
	var left = $(this).scrollLeft();
	//alert(left);
	$(".htable_div").scrollLeft(left);
	});			
//阻止instansel事件冒泡
/*$(".instansel li").click(function(event) {
		event.stopPropagation();
		return false;
});*/
//选择不同的复选按钮显示不同的内容			 	 
		function sortCheckbox(val){
				$(".sortCheck").toggle();
		}
		
		function ignoreCheckbox(){
				$(".ignoreGroup").toggle();
		}

$(function(){
		//租户配额使用情况的显示与隐藏
		$(".tenanttit").click(function(){
			$(this).find(".icon-chevron-down").toggleClass("icon-chevron-right");
			$(this).siblings(".tenantcon").toggle();
		});
//平台概况汇总圆形进度效果
    if($.fn.circleProgress) {
  		  // var colors = {
        //  'red': '#da4f49',
        //  'yellow': '#faa732',
        //  'greed': '#5bb75b',
        //};

		    $('.kvm.cpu.circle').circleProgress({
						value: 0.9,
						fill: { color: '#da4f49' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(90 * progress) + '<i>%</i>');
				});
				$('.kvm.mem.circle').circleProgress({
						value: 0.5,
						fill: { color: '#faa732' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(50 * progress) + '<i>%</i>');
				});
				$('.kvm.storage.circle').circleProgress({
						value: 0.2,
						fill: { color: '#5bb75b' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(20 * progress) + '<i>%</i>');
				});
				$('.vmware.cpu.circle').circleProgress({
						value: 0.5,
						fill: { color: '#faa732' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(50 * progress) + '<i>%</i>');
				});
				$('.vmware.mem.circle').circleProgress({
						value: 0.33,
						fill: { color: '#faa732' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(33 * progress) + '<i>%</i>');
				});
				$('.vmware.storage.circle').circleProgress({
						value: 0.79,
						fill: { color: '#da4f49' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(79 * progress) + '<i>%</i>');
				});
				$('.power.cpu.circle').circleProgress({
						value: 0.1,
						fill: { color: '#5bb75b' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(10 * progress) + '<i>%</i>');
				});
				$('.power.mem.circle').circleProgress({
						value: 0.59,
						fill: { color: '#faa732' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(59 * progress) + '<i>%</i>');
				});
				$('.power.storage.circle').circleProgress({
						value: 0.9,
						fill: { color: '#da4f49' }
				}).on('circle-animation-progress', function(event, progress) {
						$(this).find('strong').html(parseInt(90 * progress) + '<i>%</i>');
				});
		};
		
		
//tr-table奇数行偶数行添加样式
$(".tr-table").find("tr:even").css("background-color", "#f9f9f9");
//input获取失去焦点		
	$('.input_test').bind({ 
	focus:function(){ 
	if (this.value == this.defaultValue){ 
	this.value="";
	this.style.color="#333";
	} 
	}, 
	blur:function(){ 
	if (this.value == ""){ 
	this.value = this.defaultValue;
	this.style.color="#999";
	} 
	} 
	}); 	
		
		
		
		
})
