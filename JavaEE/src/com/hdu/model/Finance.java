package com.hdu.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Finance implements Serializable {	 
	public String f_type;
	public String f_content;
	public String f_time;	 	
	public int f_money;	 //交易金额
	public String s_id;		 //学生账号
	
	public String getF_type() {
		return f_type;
	}
	public void setF_type(String f_type) {
		this.f_type = f_type;
	}
	public String getF_content() {
		return f_content;
	}
	public void setF_content(String f_content) {
		this.f_content = f_content;
	}
	public String getF_time() {
		return f_time;
	}
	public void setF_time(String f_time) {
		this.f_time = f_time;
	}
	public int getF_money() {
		return f_money;
	}
	public void setF_money(int f_money) {
		this.f_money = f_money;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	
	
}
