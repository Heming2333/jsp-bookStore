package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsUser;

@Controller("bsUserAction")
@Scope("prototype")
public class BsUserAction extends BaseAction<BsUser> {
    public String query() {
    	session.put("bsUserList", bsUserService.query()); 
    	return "user_manage"; 
    } 
}
