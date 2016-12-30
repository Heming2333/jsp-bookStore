package com.hdu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hdu.model.Medicine;
import com.hdu.model.User;
import com.hdu.service.MedicineStudentService;

public class MedicineStudentShowDaoImpl implements MedicineStudentService{
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void getMedicine(User user) {
		String hql = "from Medicine";
		hibernateTemplate.find(hql);
	}

	@Override
	public void addMedicine(Medicine medicine) throws Exception {
		hibernateTemplate.save(medicine);
	}

	@Override
	public void modifyMedicine(Medicine medicine) throws Exception {
		hibernateTemplate.update(medicine);
	}

	@Override
	public void deleteMedicine(Medicine medicine, User user) throws Exception {
		hibernateTemplate.delete(medicine);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medicine> getAllMedicine() throws Exception {
		String hql = "from Medicine";
		return (List<Medicine>)hibernateTemplate.find(hql);
	}
}
