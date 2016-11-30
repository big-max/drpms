// JavaScript Document
$(function(){
//tabnav选项卡
  $(".tabnav li").each( function(i){ 
    $(this).click(function(){
      $(this).addClass("active").siblings("li").removeClass("active");
      $(".tabcontent").eq(i).addClass("tabnow").siblings(".tabcontent").removeClass("tabnow");
    });
  });		 
	//窗口计算
	$('.m_con').height( $(window).height() - 95 );
	$('.modulesl').height( $(window).height() - 135 );
	$('.modules').height( $(window).height() - 95 );
	$('.logl').height( $(window).height() - 95 );
	$(window).resize(function(){
		$('.m_con').height( $(window).height() -95 );	
		$('.modulesl').height( $(window).height() - 135 );
		$('.modules').height( $(window).height() - 95 );
		$('.logl').height( $(window).height() - 95 );
	});	 
	//滚动的表格	
	$(".btable_div").scroll( function () {
	var left = $(this).scrollLeft();
	//alert(left);
	$(".htable_div").scrollLeft(left);
	});			
	//右侧内容的显示隐藏
	 $(".icon-chevron-down").click(function(){
      $(this).toggleClass("icon-chevron-right");
			$(this).parents("h5").toggleClass("nobh5");
      $(this).parents("h5").siblings(".sub_con").toggle();
    });
	//详情的显示隐藏
	$(".dl_column dt .moredetail").click(function(){
		$(this).toggleClass("moreup");
    $(this).parent("dt").siblings("dd").find(".hidemore").slideToggle(200);
  })
})
//DB2选择不同编码显示不同版本
var changeDivShow = function(selectId){
	var selval = $('#'+selectId).val();//已经选中的select option value
	$("#"+selectId+" option").each(function(){ //遍历全部option
		var value = $(this).val(); //获取option的内容
		if(selval == value){ 
			$('.codeVal').val("");
		}else{
			$('.codeVal').val("1386");
		}
	});
  }






