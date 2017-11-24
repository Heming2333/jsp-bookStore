package cn.bs.model;

/**
 * BsAddress entity. @author MyEclipse Persistence Tools
 */

public class BsAddress implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userid;
	private Boolean isdefault;
	private String province;
	private String city;
	private String district;
	private String street;
	private String detail;

	// Constructors

	/** default constructor */
	public BsAddress() {
	}

	/** full constructor */
	public BsAddress(String userid, Boolean isdefault, String province,
			String city, String district, String street, String detail) {
		this.userid = userid;
		this.isdefault = isdefault;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.detail = detail;
	}
	public BsAddress(Integer id, String userid, Boolean isdefault, String province,
			String city, String district, String street, String detail) {
		this.id = id;
		this.userid = userid;
		this.isdefault = isdefault;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.detail = detail;
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

	public Boolean getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}