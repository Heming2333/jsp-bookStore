package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsQuestion;

@Controller("bsQuestionAction")
@Scope("prototype")
public class BsQuestionAction extends BaseAction<BsQuestion> {
    public String query() {
    	session.put("bsQuestionList", bsQuestionService.query()); 
    	return "question_manage"; 
    } 
}
