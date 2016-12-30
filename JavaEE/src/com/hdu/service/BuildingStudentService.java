package com.hdu.service;

import java.util.List;

import com.hdu.model.Building;
import com.hdu.model.User;

public interface BuildingStudentService {
	public void addBuilding(Building building) throws Exception;

	public List<Building> getAllBuilding() throws Exception;

	public void getBuilding(User user) throws Exception;

	public void modifyBuilding(User user) throws Exception;

	//public void deleteBuilding(Building building,User user) throws Exception;

}
