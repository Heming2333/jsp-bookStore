/**
 * Created by 91606 on 2016/12/28.
 */
$(document).ready(function(){
	//初始化页面
    $.ajax({
        url: "studentPersonal_studentsQuery",
        data: {},
        type: "POST",
        datatype: "json",
        success: function(result){
        	var text = "";
    		for(var key in result){
    			text = "";
    			text += '<tr>'+
			            '<td>'+result[key]["name"]+'</td>'+
			            '<td>'+result[key]["studentId"]+'</td>'+
			            '<td>'+result[key]["sex"]+'</td>'+
			            '<td rel="'+result[key]["collegeId"]+'">'+result[key]["collegeName"]+'</td>'+
			            '<td rel="'+result[key]["majorId"]+'">'+result[key]["majorName"]+'</td>'+
			            '<td>'+result[key]["classId"]+'</td>'+
			            '<td>'+
	                    '<div class="am-btn-toolbar">'+
                        '<div class="am-btn-group am-btn-group-xs">'+
                        '<button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="editStudent(this)" data-am-modal="{target: "#modifyStudent",width: 525}"><span class="am-icon-pencil-square-o"></span> 编辑</button>'+
                        '<button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only" onclick="deleteStudent(this)"><span class="am-icon-trash-o"></span> 删除</button>'+
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
    
    //提交修改
    $("#modifySubmit").click(function(){
    	var name = $("#modifyStudentName").val();
        var studentId = $("#modifyStudentId").val();
        var collegeId = $("#modifyStudentCollege option:selected").attr("rel");
        var majorId = $("#modifyStudentMajor option:selected").attr("rel");
        var classId = $("#modifyStudentClass option:selected").attr("rel");
        if(name != "" && studentId != "" && collegeId != "" && majorId != "" && classId != ""){
            $.ajax({
                url: "studentPersonal_studentUpdate",
                data: {
                	"student.name":name,
                	"student.studentId":studentId,
                	"student.collegeId":collegeId,
                	"student.majorId":majorId,
                	"student.classId":classId
                },
                type: "POST",
                datatype: "json",
                success: function(){
                    location.reload();
                },
                error: function () {
                    //alert("error:Something missing");
                }
            });
        }else{
            alert("请填写完整信息");
        }
    });
    
});
//编辑学生
function editStudent(e){
	var tds = $(e).parents("tr").children("td");
	
//先设置好姓名学号
    $("#modifyStudentName").val(tds.eq(0).text());
    $("#modifyStudentId").val(tds.eq(1).text());
    
  //设置学院
  	$.ajax({
          url: "studentPersonal_queryCollege",
          data: {},
          type: "POST",
          datatype: "json",
          success: function(result){
          	$("#modifyStudentCollege").attr("rel",tds.eq(3).attr("rel"));
          	$("#modifyStudentCollege").empty();
          	var text = "";
      		for(var key in result){
      			text = "";
      			text +='<option rel="'+result[key]["collegeId"]+'" value="'+result[key]["name"]+'">'+result[key]["name"]+'</option>';
      			$("#modifyStudentCollege").append(text);
      		}
      		$("#modifyStudentCollege").val(tds.eq(3).text());
          },
          error: function () {
              alert("error:Something missing");
          }
      });
  //设置专业
  	$.ajax({
          url: "studentPersonal_queryMajor",
          data: {
          	"student.collegeId":tds.eq(3).attr("rel")
          },
          type: "POST",
          datatype: "json",
          success: function(result){
          	$("#modifyStudentMajor").attr("rel",tds.eq(4).attr("rel"));
          	$("#modifyStudentMajor").empty();
          	var text = "";
      		for(var key in result){
      			text = "";
      			text +='<option rel="'+result[key]["majorId"]+'" value="'+result[key]["name"]+'">'+result[key]["name"]+'</option>';
      			$("#modifyStudentMajor").append(text);
      		}
      		$("#modifyStudentMajor").val(tds.eq(4).text());
          },
          error: function () {
              alert("error:Something missing");
          }
      });
	//设置班级
		$.ajax({
	        url: "studentPersonal_queryClass",
	        data: {
	        	"student.majorId":tds.eq(4).attr("rel")
	        },
	        type: "POST",
	        datatype: "json",
	        success: function(result){
	        	$("#modifyStudentClass").empty();
	        	var text = "";
	    		for(var key in result){
	    			text = "";
	    			text +='<option rel="'+result[key]["classId"]+'" value="'+result[key]["classId"]+'">'+result[key]["classId"]+'</option>';
	    			$("#modifyStudentClass").append(text);
	    		}
	    		$("#modifyStudentClass").val(tds.eq(5).text());
	        },
	        error: function () {
	            alert("error:Something missing");
	        }
	    });
//打开modal    
    $('#modifyStudent').modal();
}
//删除学生
function deleteStudent(e){
	var id = $(e).parents("tr").children("td").eq(1).text();
    $.ajax({
        url: "studentPersonal_deleteStudent",
        data: {
            "student.studentId":id
        },
        type: "POST",
        datatype: "json",
        success: function(result){
        	if(result["status"] == "success"){
        		location.reload();
        	}else{
        		alert("something missing");
        	}
        },
        error: function () {
            //alert("error:Something missing");
        }
    });
}

function college(e){
	$("#modifyStudentMajor").empty();
	$("#modifyStudentClass").empty();
	$("#modifyStudentCollege").attr("rel",$("#modifyStudentCollege option:selected").attr("rel"));
//设置专业
  	$.ajax({
          url: "studentPersonal_queryMajor",
          data: {
          	"student.collegeId":$("#modifyStudentCollege").attr("rel")
          },
          type: "POST",
          datatype: "json",
          success: function(result){
          	var text = "";
      		for(var key in result){
      			text = "";
      			text +='<option rel="'+result[key]["majorId"]+'" value="'+result[key]["name"]+'">'+result[key]["name"]+'</option>';
      			$("#modifyStudentMajor").append(text);
      		}
      	  	$("#modifyStudentMajor").attr("rel",$("#modifyStudentMajor option:selected").attr("rel"));
          },
          error: function () {
              alert("error:Something missing");
          }
      });
  //设置班级
  		$.ajax({
  	        url: "studentPersonal_queryClass",
  	        data: {
  	        	"student.majorId":$("#modifyStudentMajor").attr("rel")
  	        },
  	        type: "POST",
  	        datatype: "json",
  	        success: function(result){
  	        	$("#modifyStudentClass").empty();
  	        	var text = "";
  	    		for(var key in result){
  	    			text = "";
  	    			text +='<option rel="'+result[key]["classId"]+'" value="'+result[key]["classId"]+'">'+result[key]["classId"]+'</option>';
  	    			$("#modifyStudentClass").append(text);
  	    		}
  	    		$("#modifyStudentClass").attr("rel",$("#modifyStudentClass option:selected").attr("rel"));
  	        },
  	        error: function () {
  	            alert("error:Something missing");
  	        }
  	    });
}
function major(e){
	$("#modifyStudentClass").empty();
	$("#modifyStudentMajor").attr("rel",$("#modifyStudentMajor option:selected").attr("rel"));
	//设置班级
		$.ajax({
	        url: "studentPersonal_queryClass",
	        data: {
	        	"student.majorId":$("#modifyStudentMajor").attr("rel")
	        },
	        type: "POST",
	        datatype: "json",
	        success: function(result){
	        	$("#modifyStudentClass").empty();
	        	var text = "";
	    		for(var key in result){
	    			text = "";
	    			text +='<option rel="'+result[key]["classId"]+'" value="'+result[key]["classId"]+'">'+result[key]["classId"]+'</option>';
	    			$("#modifyStudentClass").append(text);
	    		}
	    		$("#modifyStudentClass").attr("rel",$("#modifyStudentClass option:selected").attr("rel"));
	        },
	        error: function () {
	            alert("error:Something missing");
	        }
	    });
}