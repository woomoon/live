var currentInput;
var currentWindow;
function loadWindow(wid,_id,_parent){
	currentInput = $(_id);
	currentWindow = $(wid);
	windowResize(wid,_id);
	if(_parent){
		$(_parent).scroll(function(){
			windowResize();
		});
	}
	$(window).resize(function(){
		windowResize();
	});
	currentWindow.addClass("open");
}

function sendValue(val){
	$(currentInput).val(val);
	closeWindow();
}

function windowResize(){
	var offset = currentInput.offset();
	var left = offset.left;
	var top = offset.top;
	var inputHeight = parseInt(currentInput.css("height"));
	var inputWidth = parseInt(currentInput.css("width"));
	var windowContentHeight = parseInt(currentWindow.css("height"));
	if((windowContentHeight + top + inputHeight) > $(window).height()){
		currentWindow.css("top", top - windowContentHeight - 2 + "px");
		currentWindow.removeClass("_bottom");
		currentWindow.addClass("_top");
	}else{
		currentWindow.css("top", top + inputHeight + 2 + "px");
		currentWindow.removeClass("_top");
		currentWindow.addClass("_bottom");
	}
	currentWindow.css("left" , left + "px");
	currentWindow.css("width",inputWidth + "px");
}

function closeWindow(){
	$(currentWindow).removeClass("open");
}
