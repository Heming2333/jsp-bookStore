package com.hdu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hdu.model.Medicine;
import com.hdu.model.User;
import com.hdu.util.JdbcUtils;
import com.opensymphony.xwork2.ActionContext;

public class MedicineStudentShowDao {
	
	private String date;		//就医时间
	private String type;        //生病种类
	private String medicines;    //所用药物
	private int price;          //医疗花费
	private String summary;
	
	@SuppressWarnings("unused")
	private int pageNow = 1;	//初始页面为第1页
	@SuppressWarnings("unused")
	private int pageSize = 7;	//每页显示7条记录
	
	// 添加
	@SuppressWarnings({ "unused", "rawtypes" })
	public void addMedicine(Medicine medicine) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "insert into med_info(m_date,m_type,m_medicine,m_price,m_sum) values('"
				+ date + "','"+ type + "','"+ medicines +"','"+ price +"','"+ summary +"')";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

	// 管理员获取展示列表
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public List<Medicine> getAllMedicine() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		if(medicines==null||medicines.equals("")) {
			sql = "select med_info.s_id,"
					+ "med_info.mm_id,"
					+ "med_info.m_date,"
					+ "med_info.m_type,"
					+ "med_info.m_medicine,"
					+ "med_info.m_price,"
					+ "med_info.m_sum,"
					+ "student.id"
					+ "from med_info,student"
					+ "where med_info.s_id=student.id";
		} else{
			sql = "select med_info.s_id,"
					+ "med_info.mm_id,"
					+ "med_info.m_date,"
					+ "med_info.m_type,"
					+ "med_info.m_medicine,"
					+ "med_info.m_price,"
					+ "med_info.m_sum,"
					+ "student.id"
					+ "from med_info,student"
					+ "where med_info.s_id=student.id"
					+ "and med_info.m_medicine like '%%"+medicines+"%%' ";
		}
		ResultSet rs = JdbcUtils.executeQuery(sql);
		List<Medicine>medicinem = new ArrayList<Medicine>();
		try {
			while(rs.next()) {
				Medicine medicine = new Medicine();
				medicine.setDate(rs.getString("med_info.m_date"));
				medicine.setMedicine(rs.getString("med_info.m_medicine"));
				medicine.setPrice(rs.getInt("med_info.m_price"));
				medicine.setSummary(rs.getString("med_info.m_sum"));
				medicine.setType(rs.getString("med_info.m_type"));
				medicinem.add(medicine);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.put("medicinem", medicinem);
		return medicinem;
	}
	
	// 学生获取展示列表
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getMedicine(User user) throws Exception {
		// Book book = null;
		// 从数据库获取数据
		@SuppressWarnings("unused")
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		
		if(medicines==null||medicines.equals("")) {
			sql = "select med_info.m_date,"
					+ "med_info.m_type,"
					+ "med_info.m_medicine,"
					+ "med_info.m_price,"
					+ "med_info.m_sum,"
					+ "from med_info"
					+ "where med_info.s_id='"+user.getIdentity()+"'";
		}else {
			sql = "select med_info.m_date,"
					+ "med_info.m_type,"
					+ "med_info.m_medicine,"
					+ "med_info.m_price,"
					+ "med_info.m_sum,"
					+ "from med_info"
					+ "where med_info.s_id='"+user.getIdentity()+"'"
					+ "and med_info.m_medicine like '%%"+medicines+"%%' ";
		}
		ResultSet rs = JdbcUtils.executeQuery(sql);
		List<Medicine>medicines = new ArrayList<Medicine>();
		while(rs.next()) {
			Medicine medicine = new Medicine();
			medicine.setDate(rs.getString("med_info.m_date"));
			medicine.setMedicine(rs.getString("med_info.m_medicine"));
			medicine.setPrice(rs.getInt("med_info.m_price"));
			medicine.setSummary(rs.getString("med_info.m_sum"));
			medicine.setType(rs.getString("med_info.m_type"));
			medicines.add(medicine);
		}
		request.put("medicines", medicines);
	}

	// 更新信息
	@SuppressWarnings({ "unused", "rawtypes" })
	public void modifyMedicine(Medicine medicine) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "update med_info set "
				+ "m_date='"+date+"'"
						+ "m_type='"+type+"'"
								+ "m_medicine='"+medicines+"'"
										+ "m_price='"+price+"'"
												+ "m_sum='"+summary+"'"
								+ "where m_medicine='"+medicine.getMedicine()+"'";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

	// 删除信息
	@SuppressWarnings({ "unused", "rawtypes" })
	public void deleteMedicine(Medicine medicine,User user) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "delete from med_info where "
				+ "med_info.s_id='"+user.getIdentity()+"'";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

}
