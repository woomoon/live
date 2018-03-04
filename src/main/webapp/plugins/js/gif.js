var _targetObject_;

var _html = "<div class=\"spinner_\"><div class=\"spinner\"><div class=\"spinner-container container1\">  <div class=\"circle1\"></div>  <div class=\"circle2\"></div>  <div class=\"circle3\"></div>  <div class=\"circle4\"></div></div><div class=\"spinner-container container2\">  <div class=\"circle1\"></div>  <div class=\"circle2\"></div>  <div class=\"circle3\"></div>  <div class=\"circle4\"></div></div><div class=\"spinner-container container3\">  <div class=\"circle1\"></div>  <div class=\"circle2\"></div>  <div class=\"circle3\"></div>  <div class=\"circle4\"></div></div></div></div></div>"

var isAnimation_;

function openAnimation(_id, parent_id){
	if(_id && _id.length > 0){
		_targetObject_ = $(_id);
		isAnimation_ = true;
		$(window).resize(function(){
			setAnimationLocation();
		})
	}
	if(parent_id){
		$(parent_id).scroll(function(){
			setAnimationLocation();
		});
	}else{
		$("body").scroll(function(){
			setAnimationLocation();
		});
	}
	$("body").append(_html);
	setAnimationLocation();
}

function setAnimationLocation(){
	if(_targetObject_ && isAnimation_){
		var width = parseInt(_targetObject_.css("width"));
		var height = parseInt(_targetObject_.css("height"));
		var left = _targetObject_.offset().left;
		var top = _targetObject_.offset().top;
		var spinner = $(".spinner_");
		$(spinner).css("width", width + "px");
		$(spinner).css("height", height + "px");
		$(spinner).css("left", left);
		$(spinner).css("top", top);
	}
}

function closeAnimation(){
	var spinner = $(".spinner_");
	if(spinner){
		$(spinner).remove();
		_targetObject_ = null;
		isAnimation_ = false;
	}
}
