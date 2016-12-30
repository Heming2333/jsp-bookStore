package com.hdu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hdu.model.Major;
import com.hdu.model.Student;

@Component("majorDao")
public class MajorDaoImpl {
	private HibernateTemplate hibernateTemplate;
	
	public void deleteMajor(Major major) {
		hibernateTemplate.delete(major);
	}

	@SuppressWarnings("unchecked")
	public List<Major> findAllMajors() {
		String hql = "from major";
		return (List<Major>)hibernateTemplate.find(hql);
	}

	public void saveMajor(Major major) {
		hibernateTemplate.save(major);
	}
	
	public Major getMajorId(String majorName){
		return hibernateTemplate.get(Major.class, majorName);
	}

	public void update(Major major) {
		hibernateTemplate.update(major);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}

