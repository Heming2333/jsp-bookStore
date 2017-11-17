package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsBooks;

@Controller("bsBooksAction")
@Scope("prototype")
public class BsBooksAction extends BaseAction<BsBooks> {
    public String query() {
    	session.put("bsBooksList", bsBooksService.query()); 
    	return "book_manage"; 
    } 
}
