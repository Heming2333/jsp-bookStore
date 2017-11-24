package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsBanner;

@Controller("bsBannerAction")
@Scope("prototype")
public class BsBannerAction extends BaseAction<BsBanner> {
    public String query() {
    	session.put("bsBannerList", bsBannerService.query()); 
    	return "banner_manage"; 
    } 
}
