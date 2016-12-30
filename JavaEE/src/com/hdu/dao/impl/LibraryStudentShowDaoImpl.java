package com.hdu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hdu.model.Book;
import com.hdu.model.User;
import com.hdu.service.LibraryStudentService;


public class LibraryStudentShowDaoImpl implements LibraryStudentService{
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void getBookById(User user) {
		String hql = "from Book";
		hibernateTemplate.find(hql);
	}

	@Override
	public void addBook(Book book) throws Exception {
		hibernateTemplate.save(book);
	}

	@Override
	public void modifyBook(Book book) throws Exception {
		hibernateTemplate.update(book);
	}

	@Override
	public void deleteBook(Book book, User user) throws Exception {
		hibernateTemplate.delete(book);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBook() throws Exception {
		String hql = "from Book";
		return (List<Book>)hibernateTemplate.find(hql);
	}
}
