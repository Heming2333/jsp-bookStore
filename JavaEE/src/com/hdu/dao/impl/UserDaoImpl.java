package com.hdu.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hdu.dao.UserDao;
import com.hdu.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {	
	private HibernateTemplate hibernateTemplate;
	@Override
	public void add(User User) {
		this.hibernateTemplate.save(User);
	}
	
	public User selectByUsername(int username) {
		System.out.println(hibernateTemplate.get(User.class, username));
		User user = (User)hibernateTemplate.get(User.class, username);
		return user;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
