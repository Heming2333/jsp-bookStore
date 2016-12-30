package com.hdu.action;

import com.hdu.model.User;
import com.hdu.service.MedicineStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MedicineStudentShowAction extends ActionSupport {

	private User user;
	private MedicineStudentService medicineStudentService;

	public MedicineStudentService getMedicineStudentService() {
		return medicineStudentService;
	}

	public void setMedicineStudentService(MedicineStudentService medicineStudentService) {
		this.medicineStudentService = medicineStudentService;
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
			medicineStudentService.getMedicine(user);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	

}
