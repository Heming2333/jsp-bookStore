package com.hdu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hdu.model.Building;
import com.hdu.model.User;
import com.hdu.util.JdbcUtils;
import com.opensymphony.xwork2.ActionContext;

public class BuildingStudentShowDao {
	
	private String buildings;
	private String dgood;
	private int dno;
	private int sbed;
	
	@SuppressWarnings("unused")
	private int pageNow = 1;	//初始页面为第1页
	@SuppressWarnings("unused")
	private int pageSize = 7;	//每页显示7条记录
	
	// 添加
	@SuppressWarnings({ "rawtypes", "unused" })
	public void addBuilding(Building building) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "insert into dom_info(d_good),student(s_bed)values('"
				+ dgood
				+ "','"
				+ sbed
				+ "','";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

	// 管理员获取展示列表
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public List<Building> getAllBuilding() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		if(buildings==null||buildings.equals("")) {
			sql = "select building_info.b_no,"
					+ "building_info.b_sex,"
					+ "building_info.b_intro,"
					+ "dom_info.d_no,"
					+ "dom_info.d_good,"
					+ "student.name,"
					+ "student.sex,"
					+ "student.tel,"
					+ "student.age,"
					+ "student.s_bed"
					+ "from building_info,dom_info,student"
					+ "where dom_info.d_building=building_info.b_no and "
					+ "student.d_no=dom_info.d_no";
		} else{
			sql = "select building_info.b_no,"
					+ "building_info.b_sex,"
					+ "building_info.b_intro,"
					+ "dom_info.d_no,"
					+ "dom_info.d_good,"
					+ "student.name,"
					+ "student.sex,"
					+ "student.tel,"
					+ "student.age,"
					+ "student.s_bed"
					+ "from building_info,dom_info,student"
					+ "where dom_info.d_building=building_info.b_no and "
					+ "student.d_no=dom_info.d_no"
					+ "and dom_info.d_no like '%%"+buildings+"%%' ";
		}
		ResultSet rs = JdbcUtils.executeQuery(sql);
		List<Building>buildingm = new ArrayList<Building>();
		try {
			while(rs.next()) {
				Building building = new Building();
				building.setAge(rs.getInt("student.age"));
				building.setBintro(rs.getString("building_info.b_intro"));
				building.setBno(rs.getInt("building_info.b_no"));
				building.setBsex(rs.getString("building_info.b_sex"));
				building.setDgood(rs.getString("dom_info.d_good"));
				building.setDno(rs.getInt("dom_info.d_no"));
				building.setName(rs.getString("student.name"));
				building.setSbed(rs.getInt("student.s_bed"));
				building.setSex(rs.getString("student.sex"));
				building.setTel(rs.getString("student.tel"));
				buildingm.add(building);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.put("buildingm", buildingm);
		request.put("buildings", buildings);
		return buildingm;
	}
	
	// 学生获取展示列表
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getBuilding(User user) throws Exception {
		@SuppressWarnings("unused")
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		
		if(buildings==null||buildings.equals("")) {
			sql = "select building_info.b_no,"
					+ "building_info.b_sex,"
					+ "building_info.b_intro,"
					+ "dom_info.d_no,"
					+ "dom_info.d_good"
					+ "from building_info,dom_info,student"
					+ "where dom_info.d_build=building_info.b_no "
					+ "and student.d_no=dom_info.d_no "
					+ "and student.id='"+user.getIdentity()+"'";
		}else {
			sql = "select building_info.b_no,"
					+ "building_info.b_sex,"
					+ "building_info.b_intro,"
					+ "dom_info.d_no,"
					+ "dom_info.d_good"
					+ "from building_info,dom_info,student"
					+ "where dom_info.d_build=building_info.b_no "
					+ "and student.d_no=dom_info.d_no "
					+ "and student.id='"+user.getIdentity()+"'"
					+ "and dom_info.d_no like '%%"+buildings+"%%' ";
		}
		ResultSet rs = JdbcUtils.executeQuery(sql);
		List<Building>buildingstu = new ArrayList<Building>();
		while(rs.next()) {
			Building building = new Building();
			building.setAge(rs.getInt("student.age"));
			building.setBintro(rs.getString("building_info.b_intro"));
			building.setBno(rs.getInt("building_info.b_no"));
			building.setBsex(rs.getString("building_info.b_sex"));
			building.setDgood(rs.getString("dom_info.d_good"));
			building.setDno(rs.getInt("dom_info.d_no"));
			building.setName(rs.getString("student.name"));
			building.setSbed(rs.getInt("student.s_bed"));
			building.setSex(rs.getString("student.sex"));
			building.setTel(rs.getString("student.tel"));
			buildingstu.add(building);
		}
		request.put("buildingstu", buildingstu);
		request.put("buildings", buildings);
	}

	// 更新信息
	@SuppressWarnings({ "unused", "rawtypes" })
	public void modifyBuilding(User user) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "update student,dom_info set "
				+ "student.d_no='"+dno+"'"
						+ "student.s_bed='"+sbed+"'"
								+ "dom_info.d_good='"+dgood+"'"
										+ "where student.id='"+user.getIdentity()+"'";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

	// 删除信息
/*	public void deleteBuilding(Building building,User user) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "delete from building_info,dom_info where ";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}*/

}
