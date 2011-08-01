$(function() {
	$(function() { $(".sortable").tablesorter(); });
	$("form.main :input:not(:hidden, :submit):first").focus();
	$('.alert').hide().slideDown();
});
