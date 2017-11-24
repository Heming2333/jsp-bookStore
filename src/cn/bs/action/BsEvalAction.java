package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsEval;

@Controller("bsEvalAction")
@Scope("prototype")
public class BsEvalAction extends BaseAction<BsEval> {
    public String query() {
    	session.put("bsEvalList", bsEvalService.query()); 
    	return "eval_manage"; 
    } 
}
