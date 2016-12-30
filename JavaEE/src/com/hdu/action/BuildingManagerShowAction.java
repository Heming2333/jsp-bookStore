package com.hdu.action;

import com.hdu.model.Building;
import com.hdu.service.BuildingStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BuildingManagerShowAction extends ActionSupport {

	private Building building;
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try{
			buildingStudentService.getAllBuilding();
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	

}
