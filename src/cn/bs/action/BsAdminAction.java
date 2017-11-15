package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsAdmin;

@Controller("bsAdminAction")
@Scope("prototype")
public class BsAdminAction extends BaseAction<BsAdmin> {
	
	public String login() {
		//进行登陆的判断
		model = bsAdminService.login(model);
		if(model == null) {
			request.put("error", "用户名或密码错误");
			return "error"; 
		} else {
			//登录成功，先将用户存储到session中
			session.put("user", model);
			//根据session中goURL是否有值而决定页面的跳转
			//if(session.get("goURL") == null) {
			return "success"; //跳到首页
			//} else {
			//	return "goURL";
			//}
		}
	}

    public String query() {
//    	request.put("bsAdminList", bsAdminService.query()); 
    	session.put("bsAdminList", bsAdminService.query()); 
//    	application.put("bsAdminList", bsAdminService.query()); 
    	return "user_manage"; 
    } 
    
    //public String update() {  
    //    System.out.println("----update----");   
    //    bsAdminService.update(model); //新加一条语句，来更新数据库 
    //    return "index";  
    //}  
      
    //public String save() {  
    //    System.out.println("----save----");  
    //    System.out.println(model);//整合前后输出不同  
    //    return "index";  
    //} 
}
