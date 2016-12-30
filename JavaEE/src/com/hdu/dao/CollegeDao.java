package com.hdu.dao;

import java.util.List;

import com.hdu.model.College;

public interface CollegeDao {
	public void saveCollege(College college);
	
	public void deleteCollege(College college);
	
	public List<College> findAllcolleges();
	public College getCollegeId(String collegeName);
	public void update(College college);
}
