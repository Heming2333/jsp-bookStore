package com.hdu.model;

public class Medicine {
	
	private String date;		//��ҽʱ��
	private String type;        //��������
	private String medicine;    //����ҩ��
	private int price;          //ҽ�ƻ���
	private String summary;     //��ҽ�������
	
	public String getSummary(){
		return summary;
	}
	public void setSummary(String summary){
		this.summary=summary;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public String getMedicine(){
		return medicine;
	}
	public void setMedicine(String medicine){
		this.medicine=medicine;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
