package com.hdu.model;

public class Building {
	private int dno;		//�����
	private int bno;        //¥��
	private String bsex;       //Ů����������¥
	private String bintro;        //����¥�������
	private String dgood;      //�Ƿ�Ϊ��������
	private int sbed;
	private String name;
	private String sex;
	private String tel;
	private int age;

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getDno(){
		return dno;
	}
	public void setDno(int dno){
		this.dno=dno;
	}
	public int getBno(){
		return bno;
	}
	public void setBno(int bno){
		this.bno=bno;
	}
	public String getBsex(){
		return bsex;
	}
	public void setBsex(String bsex){
		this.bsex=bsex;
	}
	public String getBintro(){
		return bintro;
	}
	public void setBintro(String bintro){
		this.bintro=bintro;
	}
	public String getDgood() {
		return dgood;
	}
	public void setDgood(String dgood) {
		this.dgood = dgood;
	}
	public int getSbed(){
		return sbed;
	}
	public void setSbed(int sbed){
		this.sbed = sbed;
	}
}
