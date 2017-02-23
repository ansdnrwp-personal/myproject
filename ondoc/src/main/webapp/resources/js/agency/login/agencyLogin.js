$(document).ready(function(){
	
	$("#btn_login").click(function(){
		
		var formdata = $("#frm_login").serialize();
		
		$.ajax({
			url : "/agencyLoginCheck.do",
			type : "post",
			data : JSON.stringify(formdata),
			dataType : "application/json",
			success : function(data){
				var list = data.list;
				$.each(JSON.parse(data.list),function(key, value){
					alert(value.name);
				});
			}

		});
	});
	
	
});