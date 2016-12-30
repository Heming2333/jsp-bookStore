package com.hdu.model;

import java.util.Date;

@SuppressWarnings("unused")
public class Book {
	
	private int isbn;		//ISBN
	private String bookName;	//����
	private String author;		//����	
	private String publisher;	//������
	private float price;		//�۸�
	private int cnum;			//������
	private int snum;			//�����
	private String summary;		//������Ҫ
	private byte[]photo;		//������Ƭ
	private String lendTime;    //����ʱ��
	private String returnTime;  //����ʱ��
	

	public String name;
	public String tel;
	public int age;
	public String sex;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getLendTime(){
		return lendTime;
	}
	public void setLendTime(String lendTime){
		this.lendTime=lendTime;
	}
	public String getReturnTime(){
		return returnTime;
	}
	public void setReturnTime(String returnTime){
		this.returnTime=returnTime;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
