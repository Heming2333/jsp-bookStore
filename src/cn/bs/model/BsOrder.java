package cn.bs.model;

import java.util.Date;

/**
 * BsOrder entity. @author MyEclipse Persistence Tools
 */

public class BsOrder implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userid;
	private String goodsid;
	private String addressid;
	private String num;
	private Date time;
	private String status;

	// Constructors

	/** default constructor */
	public BsOrder() {
	}

	/** full constructor */
	public BsOrder(String userid, String goodsid, String addressid, String num,
			Date time, String status) {
		this.userid = userid;
		this.goodsid = goodsid;
		this.addressid = addressid;
		this.num = num;
		this.time = time;
		this.status = status;
	}
	public BsOrder(Integer id, String userid, String goodsid, String addressid, String num,
			Date time, String status) {
		this.id = id;
		this.userid = userid;
		this.goodsid = goodsid;
		this.addressid = addressid;
		this.num = num;
		this.time = time;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getAddressid() {
		return this.addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}