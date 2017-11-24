package cn.bs.model;

/**
 * BsAuth entity. @author MyEclipse Persistence Tools
 */

public class BsAuth implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String truename;
	private String idnumber;
	private String telephone;
	private String car;

	// Constructors

	/** default constructor */
	public BsAuth() {
	}

	/** minimal constructor */
	public BsAuth(Integer userId, String truename, String idnumber,
			String telephone) {
		this.userId = userId;
		this.truename = truename;
		this.idnumber = idnumber;
		this.telephone = telephone;
	}
	public BsAuth(Integer id, Integer userId, String truename, String idnumber,
			String telephone) {
		this.id = id;
		this.userId = userId;
		this.truename = truename;
		this.idnumber = idnumber;
		this.telephone = telephone;
	}

	/** full constructor */
	public BsAuth(Integer userId, String truename, String idnumber,
			String telephone, String car) {
		this.userId = userId;
		this.truename = truename;
		this.idnumber = idnumber;
		this.telephone = telephone;
		this.car = car;
	}
	public BsAuth(Integer id, Integer userId, String truename, String idnumber,
			String telephone, String car) {
		this.id = id;
		this.userId = userId;
		this.truename = truename;
		this.idnumber = idnumber;
		this.telephone = telephone;
		this.car = car;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTruename() {
		return this.truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCar() {
		return this.car;
	}

	public void setCar(String car) {
		this.car = car;
	}

}