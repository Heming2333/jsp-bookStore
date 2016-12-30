package com.hdu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hdu.model.Building;
import com.hdu.model.User;
import com.hdu.service.BuildingStudentService;

public class BuildingStudentShowDaoImpl implements BuildingStudentService{
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void getBuilding(User user) {
		String hql = "from Building";
		hibernateTemplate.find(hql);
	}

	@Override
	public void addBuilding(Building building) throws Exception {
		hibernateTemplate.save(building);
	}

	@Override
	public void modifyBuilding(User user) throws Exception {
		hibernateTemplate.update(user);
	}

	/*public void deleteBuilding(Building building, User user) throws Exception {
		hibernateTemplate.delete(building);
	}*/

	@SuppressWarnings("unchecked")
	@Override
	public List<Building> getAllBuilding() throws Exception {
		String hql = "from Building";
		return (List<Building>)hibernateTemplate.find(hql);
	}
}
