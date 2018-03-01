$(document).ready(function(){
	$(".nav_title").click(function(){
		var parent = $(this).parent();
		if(parent.attr("class").indexOf("out") != -1){
			$(parent).removeClass("out");
		}else{
			$.each($(".item_nav"), function(index,object) {
				$(object).removeClass("out");
			});
			parent.addClass("out");
		}
	})
	$(window).resize(function(){
		var body_ = $("body");
		$(".tab_body").width(body_.width()-270);
		$(".tab_body").find(".tab_body_item").width(body_.width()-290)
	});
	$(window).resize();
})
