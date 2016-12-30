package com.hdu.action;

import java.util.HashMap;
import java.util.Map;







import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hdu.dao.UserDao;
import com.hdu.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")
@Component("userAction")
public class UserAction extends ActionSupport {
	private Map<String, Object> dataMap;
	private User user;
	private UserDao userDao;
	
	public String login(){
			System.out.println("aa");
			User user1 = userDao.selectByUsername(user.getUsername());
			dataMap = new HashMap<String, Object>();
			if(user1 == null) 
			{
				dataMap.put("status", 1);
				dataMap.put("message", "Œﬁ¥À’À∫≈");
				return "input";
			}
			else if(user1.getPassword().equals(user.getPassword()))
			{
				dataMap.put("status", 0);
				dataMap.put("identity", user1.getIdentity());
				System.out.println(user1.getIdentity());
				ActionContext.getContext().getSession().put("user",user1);
				return "login";
			} else {
				dataMap.put("status", 1);
				dataMap.put("message", "√‹¬Î¥ÌŒÛ");
				return "input";
			}
	
			
		}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		System.out.println("aa");
		this.user = user;
		System.out.println(user.username);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}