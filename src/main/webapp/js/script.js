/* 
 * TODO 
 * check if everything is okay (framework, algorithm, new stuff, sources)
 */
function check() {
	if($("#upload-file-info").html() != "" && $("#selected-framework").html() != "")
		$("#submit-button").prop('disabled', false);
	else
		$("#submit-button").prop('disabled', true);
}

function new_framework(nf) {
	if(nf) {
		$('#new-framework').show();
	} else {
		$('#new-framework').hide();
	}
}

function new_algorithm(nf) {
	if(nf) {
		$('#new-algorithm').show();
	} else {
		$('#new-algorithm').hide();
	}
}

$(document).ready(function () {
	$(check());
	$(new_framework(false));
	$(new_algorithm(false));
});