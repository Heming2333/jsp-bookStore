$(document).ready(function(){
	$.ajax({
		//写一下action路径
        url: "",
        data: {},
        type: "POST",
        datatype: "json",
        success: function(result){
        	for(var key in result){
        		text = "";
    			text += '<tr>'+
			            '<td>'+result[key]["s_id"]+'</td>'+
			            '<td>'+result[key]["f_type"]+'</td>'+
			            '<td>'+result[key]["f_time"]+'</td>'+
			            '<td>'+result[key]["f_money"]+'</td>'+
			            '<td>'+result[key]["f_content"]+'</td>'+
			            '</tr>';
    			$("#lists").append(text);
        	}
        },
        error: function () {
            alert("error:Something missing");
        }
    });
});