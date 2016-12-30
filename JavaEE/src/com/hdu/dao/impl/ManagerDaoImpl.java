package com.hdu.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hdu.dao.ManagerDao;
import com.hdu.model.Manager;

@Component("managerDao")
public class ManagerDaoImpl implements ManagerDao {	
	private HibernateTemplate hibernateTemplate;
	public void add(Manager manager) {
		this.hibernateTemplate.save(manager);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}