package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsAnswer;

@Controller("bsAnswerAction")
@Scope("prototype")
public class BsAnswerAction extends BaseAction<BsAnswer> {
    public String query() {
    	session.put("bsAnswerList", bsAnswerService.query()); 
    	return "answer_manage"; 
    } 
}
