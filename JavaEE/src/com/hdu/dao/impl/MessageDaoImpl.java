package com.hdu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hdu.dao.MessageDao;
import com.hdu.model.Message;

@Component("messageDao")
public class MessageDaoImpl implements MessageDao {	
	private HibernateTemplate hibernateTemplate;
	@Override
	public void add(Message Message) {
		this.hibernateTemplate.save(Message);
	}
	
	public List<Message> selectMessagesByStudentId(String studentId) {
		List<Message> list = (List<Message>)hibernateTemplate.find("from Message m where m.t_stu=" + studentId);
		System.out.println(list.get(0).getTime());
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