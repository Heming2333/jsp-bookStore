package com.hdu.dao;

import java.util.List;

import com.hdu.model.Major;

public interface MajorDao {
	public void saveMajor(Major major);
	
	public void deleteMajor(Major major);
	
	public List<Major> findAllMajors();
	
	public void update(Major major);

	public Major getMajorId(String majorName);

}
