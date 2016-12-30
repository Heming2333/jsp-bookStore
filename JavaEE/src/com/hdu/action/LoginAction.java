package com.hdu.action;

import java.util.HashMap;
import java.util.Map;

import com.hdu.dao.UserDao;
import com.hdu.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private Map<String, Object> dataMap;
	private UserDao userDao;
	public int username;
	public String password;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String excute() throws Exception {
		User user = userDao.selectByUsername(username);
		dataMap = new HashMap<String, Object>();
		if(user == null) 
		{
			dataMap.put("status", 1);
			dataMap.put("message", "Œﬁ¥À’À∫≈");
		}
		else if(user.getPassword().equals(getPassword()))
		{
			dataMap.put("status", 0);
			 ActionContext.getContext().getSession().put("username",user.getUsername());
			 return "success";
		} else {
			dataMap.put("status", 1);
			dataMap.put("message", "√‹¬Î¥ÌŒÛ");
		}
		
		return "input";
	}
	public UserDao getUserDao() {
		return userDao;
	}
	
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
