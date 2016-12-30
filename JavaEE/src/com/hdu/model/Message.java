package com.hdu.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Message implements Serializable {
	public String f_stu;
	public String t_stu;
	public String time;
	public String content;
	public String getF_stu() {
		return f_stu;
	}
	public void setF_stu(String f_stu) {
		this.f_stu = f_stu;
	}
	public String getT_stu() {
		return t_stu;
	}
	public void setT_stu(String t_stu) {
		this.t_stu = t_stu;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
