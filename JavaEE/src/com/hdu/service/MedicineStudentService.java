package com.hdu.service;

import java.util.List;

import com.hdu.model.Medicine;
import com.hdu.model.User;

public interface MedicineStudentService {
	public void addMedicine(Medicine medicine) throws Exception;

	public List<Medicine> getAllMedicine() throws Exception;

	public void getMedicine(User user) throws Exception;

	public void modifyMedicine(Medicine medicine) throws Exception;

	public void deleteMedicine(Medicine medicine,User user) throws Exception;

}
