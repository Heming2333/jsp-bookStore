package com.hdu.service;

import java.util.List;

import com.hdu.model.Book;
import com.hdu.model.User;

public interface LibraryStudentService {
	public void addBook(Book book) throws Exception;

	public List<Book> getAllBook() throws Exception;

	public void getBookById(User user) throws Exception;

	public void modifyBook(Book book) throws Exception;

	public void deleteBook(Book book,User user) throws Exception;

}
