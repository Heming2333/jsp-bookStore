package com.hdu.action;

import com.hdu.model.Medicine;
import com.hdu.model.User;
import com.hdu.service.MedicineStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MedicineManageDeleteAction extends ActionSupport {

	private Medicine medicine;
	private User user;
	private MedicineStudentService medicineStudentService;

	public MedicineStudentService getMedicineStudentService() {
		return medicineStudentService;
	}

	public void setMedicineStudentService(MedicineStudentService medicineStudentService) {
		this.medicineStudentService = medicineStudentService;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try{
			medicineStudentService.deleteMedicine(medicine,user);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	

}

