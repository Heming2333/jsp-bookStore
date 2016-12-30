package com.hdu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hdu.model.College;

@Component("collegeDao")
public class CollegeDaoImpl {
	private HibernateTemplate hibernateTemplate;
	
	public void deleteCollege(College college) {
		hibernateTemplate.delete(college);
	}

	@SuppressWarnings("unchecked")
	public List<College> findAllColleges() {
		String hql = "from college";
		return (List<College>)hibernateTemplate.find(hql);
	}

	public void saveCollege(College college) {
		hibernateTemplate.save(college);
	}

	public College getCollegeId(String collegeName){
		return hibernateTemplate.get(College.class, collegeName);
	}
	public void update(College college) {
		hibernateTemplate.update(college);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
