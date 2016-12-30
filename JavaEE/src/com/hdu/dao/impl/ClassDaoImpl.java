package com.hdu.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.hdu.model.Class;
@Component("classDao")
public class ClassDaoImpl {
private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public List<Class> findAllClass() {
		String hql = "from Class";
		return (List<Class>)hibernateTemplate.find(hql);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
