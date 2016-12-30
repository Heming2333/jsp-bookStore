package com.hdu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hdu.dao.FinanceDao;
import com.hdu.model.Finance;

@Component("financeDao")
public class FinanceDaoImpl implements FinanceDao {	
	private HibernateTemplate hibernateTemplate;
	@Override
	public void add(Finance finance) {
		try{
		System.out.println("Finance:" + finance.getS_id());
		this.hibernateTemplate.save(finance);
		} catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public List<Finance> queryFinances() {
		List<Finance> list = (List<Finance>)hibernateTemplate.find("from Finance");
		System.out.println(list.get(0).getF_time());
		return list;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}