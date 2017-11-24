package cn.bs.model;

/**
 * BsAnswer entity. @author MyEclipse Persistence Tools
 */

public class BsAnswer implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userid;
	private String goodsid;
	private String questionid;
	private String content;
	private String time;
	private String likeid;

	// Constructors

	/** default constructor */
	public BsAnswer() {
	}

	/** full constructor */
	public BsAnswer(String userid, String goodsid, String questionid,
			String content, String time, String likeid) {
		this.userid = userid;
		this.goodsid = goodsid;
		this.questionid = questionid;
		this.content = content;
		this.time = time;
		this.likeid = likeid;
	}
	public BsAnswer(Integer id, String userid, String goodsid, String questionid,
			String content, String time, String likeid) {
		this.id = id;
		this.userid = userid;
		this.goodsid = goodsid;
		this.questionid = questionid;
		this.content = content;
		this.time = time;
		this.likeid = likeid;
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

	public String getQuestionid() {
		return this.questionid;
	}

	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLikeid() {
		return this.likeid;
	}

	public void setLikeid(String likeid) {
		this.likeid = likeid;
	}

}