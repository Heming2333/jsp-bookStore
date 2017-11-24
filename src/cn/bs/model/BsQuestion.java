package cn.bs.model;

import java.util.Date;

/**
 * BsQuestion entity. @author MyEclipse Persistence Tools
 */

public class BsQuestion implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userid;
	private String goodid;
	private String content;
	private String answerid;
	private Date time;

	// Constructors

	/** default constructor */
	public BsQuestion() {
	}

	/** full constructor */
	public BsQuestion(Integer id, String userid, String goodid, String content,
			String answerid, Date time) {
		this.id = id;
		this.userid = userid;
		this.goodid = goodid;
		this.content = content;
		this.answerid = answerid;
		this.time = time;
	}
	public BsQuestion(String userid, String goodid, String content,
			String answerid, Date time) {
		this.userid = userid;
		this.goodid = goodid;
		this.content = content;
		this.answerid = answerid;
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

	public String getGoodid() {
		return this.goodid;
	}

	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnswerid() {
		return this.answerid;
	}

	public void setAnswerid(String answerid) {
		this.answerid = answerid;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}