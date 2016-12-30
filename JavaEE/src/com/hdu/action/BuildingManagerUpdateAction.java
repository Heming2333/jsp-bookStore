package com.hdu.action;


import com.hdu.model.User;
import com.hdu.service.BuildingStudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BuildingManagerUpdateAction extends ActionSupport {

	private User user;
	private BuildingStudentService buildingStudentService;

	public BuildingStudentService getBuildingStudentService() {
		return buildingStudentService;
	}

	public void setBuildingStudentService(BuildingStudentService buildingStudentService) {
		this.buildingStudentService = buildingStudentService;
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
			buildingStudentService.modifyBuilding(user);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	

}

