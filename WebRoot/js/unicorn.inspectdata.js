var unicorn_data_config = {
  "sidebar": {
    "menus": [ 
      { "title": "首页", "icon": "home", "link": "../index/index.html"},
			{ "title": "巡检管理", "icon": "file", "link": "#", "submenus": [
				{ "title": "定时状态", "link": "../autoinspection/inspect_list.html" },
				{ "title": "任务面板", "link": "../autoinspection/inspectpanels.html" },
				{ "title": "巡检结果", "link": "../autoinspection/inspectresult.html" },
				{ "title": "服务器列表", "link": "../autoinspection/inspectresult.html" },
			] },
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
    $(this).parent().siblings(".more-content").slideToggle(500);
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

//选择不同的复选按钮显示不同的内容			 	 
		function sortCheckbox(val){
				$(".sortCheck").toggle();
		}
		
		function ignoreCheckbox(){
				$(".ignoreGroup").toggle();
		}