/**
 * Created by 91606 on 2016/12/21.
 */
//前端交互函数
$(document).ready(function(){
    $("#studentInfoModify").click(function(){
        var inputs = $("#studentInfoBox input");
        for(var i = 0;i < inputs.length -1;i++){
            if(i%2 == 0){
                inputs.eq(i).css("background-color","rgb(230,230,230)");
                inputs.eq(i).removeAttr("disabled");
            }
        }
        $("#submitBtn").css("display","block");
    });
    $("#studentInfoCancel").click(function(){
        var inputs = $("#studentInfoBox input");
        for(var i = 0;i < inputs.length -1;i++){
            if(i%2 == 0){
                inputs.eq(i).css("background-color","white");
                inputs.eq(i).attr("disabled","disabled");
            }
        }
        $("#submitBtn").css("display","none");
    });
});

//数据交互函数
$(document).ready(function(){
	//数据封装，包含读写操作
    var boxes = {
        data:new Array(),
        inputs:$("#studentInfoBox input"),
        getValues:function(){
            var i;
            for(i = 0; i < this.inputs.length; i++){
                this.data[i] = this.inputs.eq(i).val();
            }
        },
        setValues:function(){
            var i;
            for(i = 0;i < this.inputs.length; i++){
                this.inputs.eq(i).val(this.data[i]);
            }
        },
        switchAdd:function(para,paraData){
        	switch(para){
        		case "name":this.data[0] = paraData;break;
        		case "id":this.data[1] = paraData;break;
        		case "sex":this.data[2] = paraData;break;
        		case "class":this.data[3] = paraData;break;
        		case "age":this.data[4] = paraData;break;
        		case "major":this.data[5] = paraData;break;
        		case "tel":this.data[6] = paraData;break;
        		case "college":this.data[7] = paraData;break;
        		case "nativePalce":this.data[8] = paraData;break;
        		case "building":this.data[9] = paraData;break;
        		case "dom":this.data[10] = paraData;break;
        		defalut:break;
        	}
        }
    };
    
    //页面初始化的时候查询
    $.ajax({
        url: "studentPersonal_studentPersonalQuery",
        data: {
        	"student.studentId":$("#user").attr("rel")
        },
        type: "POST",
        datatype: "json",
        success: function(result){
        	for(var key in result){
        		boxes.switchAdd(key,result[key]);
        	}
            boxes.setValues();
            boxes.getValues();
        },
        error: function () {
            alert("error:Something missing");
        }
    });
    
    //取消编辑后恢复数据
    $("#studentInfoCancel").click(function(){
        boxes.setValues();
    });
    
    //提交编辑数据
    $("#studentInfoSubmit").click(function(){
        boxes.getValues();
        $.ajax({
            url: "studentPersonal_studentPersonalUpdate",
            data: {
            	"student.name":boxes.data[0],
            	"student.studentId":boxes.data[1],
            	"student.sex":boxes.data[2],
            	"student.classId":boxes.data[3],
            	"student.age":boxes.data[4],
            	"student.majorName":boxes.data[5],
            	"student.tel":boxes.data[6],
            	"student.collegeName":boxes.data[7],
            	"student.nativePlace":boxes.data[8],
            	"student.b_no":boxes.data[9],
            	"student.d_no":boxes.data[10]
            },
            type: "POST",
            datatype: "String",
            success: function(result){
            	if(result["status"] == "success"){
            		location.reload();
            	}else{
            		alert("提交失败");
            	}
            },
            error: function (err) {
                alert("err:" + err);
            }
        });
    })
});
