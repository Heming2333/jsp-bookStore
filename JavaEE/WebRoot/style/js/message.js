/**
 * Created by 91606 on 2016/12/28.
 */
$(document).ready(function(){
	//鍒濆鍖栭〉闈�
    $.ajax({
        url: "message_recive",
        data: {
        	"message.t_stu": $("#user").attr("rel")
        },
        type: "POST",
        datatype: "json",
        success: function(result){
        	var text = "";
    		for(var key in result){
    			text = "";
    			text += '<tr>'+
			            '<td>'+result[key]["f_stu"]+'</td>'+
			            '<td>'+result[key]["time"]+'</td>'+
			            '<td>'+result[key]["content"]+'</td>'+
			            '<td>'+
	                    '<div class="am-btn-toolbar">'+
                        '<div class="am-btn-group am-btn-group-xs">'+
                        '<button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="seeMessage(this)"><span class="am-icon-pencil-square-o"></span> 查看内容</button>'+
                        '<button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only" onclick="deleteMessage(this)"><span class="am-icon-trash-o"></span> 删除</button>'+
                        '</div>'+
	                    '</div>'+
		                '</td>'+
			            '</tr>';
    			$("#tableBody").append(text);
    		}
        },
        error: function () {
            alert("error:Something missing");
        }
    });
    $("#sendMessageBtn").click(function(){
    	var date1 = new Date(Date.now());
    	var date2 = new Date(Date.now());
    	$(".am-modal-bd input").eq(1).val(date1.toLocaleDateString()+date2.toLocaleTimeString());
    });
    $("#cancelEdit").click(function(){
    	$(".am-modal-bd input").val("");
    	$(".am-modal-bd textarea").val("");
    });
    $("#submitEdit").click(function(){
    	var studentId = $("#studentId").val();
    	var times = $("#time").val();
    	var content = $("#content").val();
    	$.ajax({
            url: "message_send",
            data: {
            	"message.t_stu":studentId,
            	"message.time":times,
            	"message.f_stu":$("#user").attr("rel"),
            	"message.content":content
            },
            type: "POST",
            datatype: "json",
            success: function(result){
            	location.reload();
            },
            error: function () {
                alert("error:Something missing");
            }
        });
    });
});
function seeMessage(e){
	$("#seeMessage").modal();
	$("#id2").val($(e).parents("tr").children("td").eq(0).text());
	$("#time2").val($(e).parents("tr").children("td").eq(1).text());
	$("#content2").val($(e).parents("tr").children("td").eq(2).text());
}
function deleteMessage(e){
	$.ajax({
        url: "message_delete",
        data: {
        	"message.t_stu":studentId,
        	"message.time":times,
        	"message.f_stu":$("#user").attr("rel"),
        	"message.content":content
        },
        type: "POST",
        datatype: "json",
        success: function(result){
        	location.reload();
        },
        error: function () {
            alert("error:Something missing");
        }
    });
}
