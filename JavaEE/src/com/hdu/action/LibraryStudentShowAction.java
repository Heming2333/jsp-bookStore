package com.hdu.action;

import com.hdu.model.User;
import com.hdu.service.LibraryStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LibraryStudentShowAction extends ActionSupport {

		private User user;
		private LibraryStudentService libraryStudentService;

		public LibraryStudentService getLibraryStudentService() {
			return libraryStudentService;
		}

		public void setLibraryStudentService(LibraryStudentService libraryStudentService) {
			this.libraryStudentService = libraryStudentService;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		@Override
		public String execute() throws Exception {
			// TODO Auto-generated method stub
			try{
				libraryStudentService.getBookById(user);
				return SUCCESS;
			}catch(Exception e){
				e.printStackTrace();
				return ERROR;
			}
		}
		

	}
