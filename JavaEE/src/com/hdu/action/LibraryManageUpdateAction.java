package com.hdu.action;

import com.hdu.model.Book;
import com.hdu.service.LibraryStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LibraryManageUpdateAction extends ActionSupport {

	private Book book;
	private LibraryStudentService libraryStudentService;

	public LibraryStudentService getLibraryStudentService() {
		return libraryStudentService;
	}

	public void setLibraryStudentService(LibraryStudentService libraryStudentService) {
		this.libraryStudentService = libraryStudentService;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try{
			libraryStudentService.modifyBook(book);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	

}

