package cn.bs.model;

import java.util.Date;

/**
 * BsEval entity. @author MyEclipse Persistence Tools
 */

public class BsEval implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userid;
	private String goodsid;
	private String content;
	private Integer stars;
	private String img;
	private Date time;

	// Constructors

	/** default constructor */
	public BsEval() {
	}

	/** minimal constructor */
	public BsEval(String userid, String goodsid, Integer stars, Date time) {
		this.userid = userid;
		this.goodsid = goodsid;
		this.stars = stars;
		this.time = time;
	}
	
	public BsEval(Integer id, String userid, String goodsid, Integer stars, Date time) {
		this.id = id;
		this.userid = userid;
		this.goodsid = goodsid;
		this.stars = stars;
		this.time = time;
	}

	/** full constructor */
	public BsEval(String userid, String goodsid, String content, Integer stars,
			String img, Date time) {
		this.userid = userid;
		this.goodsid = goodsid;
		this.content = content;
		this.stars = stars;
		this.img = img;
		this.time = time;
	}
	public BsEval(Integer id, String userid, String goodsid, String content, Integer stars,
			String img, Date time) {
		this.id = id;
		this.userid = userid;
		this.goodsid = goodsid;
		this.content = content;
		this.stars = stars;
		this.img = img;
		this.time = time;
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStars() {
		return this.stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}