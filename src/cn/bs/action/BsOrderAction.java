package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsOrder;

@Controller("bsOrderAction")
@Scope("prototype")
public class BsOrderAction extends BaseAction<BsOrder>  {
    public String query() {
    	session.put("bsOrderList", bsOrderService.query()); 
    	return "order_manage"; 
    } 
}
