package com.hdu.action;


import java.util.HashMap;
import java.util.Map;

import com.hdu.dao.ManagerDao;
import com.hdu.model.Manager;
import com.opensymphony.xwork2.ActionSupport;
public class RegisteAction extends ActionSupport {
	private Map<String, Object> dataMap;

	private ManagerDao managerDao;
	
	public String username;
	public String password;
	public String name;
	public int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String execute() throws Exception {
		Manager manager = new Manager();
		manager.setUsername(getUsername());
		manager.setPassword(getPassword());
		manager.setName(getName());
		manager.setAge(getAge());
		managerDao.add(manager);
		dataMap = new HashMap<String, Object>();
		dataMap.put("test", "aa");
		return "success";
	}
	
	public ManagerDao getManagerDao() {
		return managerDao;
	}
	
	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}
