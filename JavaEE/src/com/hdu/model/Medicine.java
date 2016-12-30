package com.hdu.model;

public class Medicine {
	
	private String date;		//就医时间
	private String type;        //生病种类
	private String medicine;    //所用药物
	private int price;          //医疗花费
	private String summary;     //就医情况简述
	
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
