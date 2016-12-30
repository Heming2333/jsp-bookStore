package com.hdu.action;

import com.hdu.model.Medicine;
import com.hdu.service.MedicineStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MedicineManageAddAction extends ActionSupport {

	private Medicine medicine;
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try{
			medicineStudentService.addMedicine(medicine);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	

}
