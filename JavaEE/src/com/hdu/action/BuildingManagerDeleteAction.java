/*package com.hdu.action;

import com.hdu.model.Building;
import com.hdu.model.User;
import com.hdu.service.BuildingStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BuildingManagerDeleteAction extends ActionSupport {

	private Building building;
	private User user
	private BuildingStudentService buildingStudentService;

	public BuildingStudentService getBuildingStudentService() {
		return buildingStudentService;
	}

	public void setBuildingStudentService(BuildingStudentService buildingStudentService) {
		this.buildingStudentService = buildingStudentService;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user=user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try{
			buildingStudentService.deleteBuilding(building,user);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	

}*/
