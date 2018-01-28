function initializeBar() {
	$(".pbar .bari .bart").click(function() {
		var parent = $(this).parent(".bari");
		if(parent.attr("class").indexOf("open") != -1) {
			parent.removeClass("open");
		} else {
			$(".pbar .bari.open").removeClass("open");
			parent.addClass("open");
		}
	});
}

var _openingDropdown;

function initializeDropdown() {
	$(".pdp>*:first-child").click(function() {
		console.log(2)
		var parent = $(this).parent(".pdp");
		if(parent.attr("class").indexOf("open") == -1) {
			parent.addClass("open");
			_openingDropdown = true;
		} else {
			parent.removeClass("open");
			_openingDropdown = false;
		}
	})
	document.addEventListener('click', function() {
		if(!_openingDropdown) {
			$(".pdp").removeClass("open");
		}
		_openingDropdown = false;
	}, false);
}