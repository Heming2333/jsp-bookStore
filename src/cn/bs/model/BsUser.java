package cn.bs.model;

import java.util.Date;

/**
 * BsUser entity. @author MyEclipse Persistence Tools
 */

public class BsUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String headimg;
	private String sex;
	private String birth;
	private String telephone;
	private Boolean auth;
	private String carid;
	private String collectid;
	private String evalid;
	private String addressid;
	private String orderid;
	private String money;
	private Long integer;
	private String check;
	private Integer level;
	private Date time;

	// Constructors

	/** default constructor */
	public BsUser() {
	}

	/** minimal constructor */
	public BsUser(String username, String password, String telephone,
			Boolean auth) {
		this.username = username;
		this.password = password;
		this.telephone = telephone;
		this.auth = auth;
	}

	/** minimal constructor */
	public BsUser(Integer id, String username, String password, String telephone,
			Boolean auth) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.telephone = telephone;
		this.auth = auth;
	}

	/** full constructor */
	public BsUser(String username, String password, String headimg, String sex,
			String birth, String telephone, Boolean auth, String carid,
			String collectid, String evalid, String addressid, String orderid,
			String money, Long integer, String check, Integer level, Date time) {
		this.username = username;
		this.password = password;
		this.headimg = headimg;
		this.sex = sex;
		this.birth = birth;
		this.telephone = telephone;
		this.auth = auth;
		this.carid = carid;
		this.collectid = collectid;
		this.evalid = evalid;
		this.addressid = addressid;
		this.orderid = orderid;
		this.money = money;
		this.integer = integer;
		this.check = check;
		this.level = level;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHeadimg() {
		return this.headimg;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Boolean getAuth() {
		return this.auth;
	}

	public void setAuth(Boolean auth) {
		this.auth = auth;
	}

	public String getCarid() {
		return this.carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getCollectid() {
		return this.collectid;
	}

	public void setCollectid(String collectid) {
		this.collectid = collectid;
	}

	public String getEvalid() {
		return this.evalid;
	}

	public void setEvalid(String evalid) {
		this.evalid = evalid;
	}

	public String getAddressid() {
		return this.addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getMoney() {
		return this.money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public Long getInteger() {
		return this.integer;
	}

	public void setInteger(Long integer) {
		this.integer = integer;
	}

	public String getCheck() {
		return this.check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}