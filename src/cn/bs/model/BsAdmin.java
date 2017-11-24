package cn.bs.model;

/**
 * BsAdmin entity. @author MyEclipse Persistence Tools
 */

public class BsAdmin implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String jurisdiction;
	private String headimg;
	private String sex;
	private String birth;
	private String telephone;
	private String truename;
	private String idnumber;
	private Integer level;

	// Constructors

	/** default constructor */
	public BsAdmin() {
	}

	/** minimal constructor */
	public BsAdmin(String username, String password, String jurisdiction,
			String telephone, String truename, String idnumber) {
		this.username = username;
		this.password = password;
		this.jurisdiction = jurisdiction;
		this.telephone = telephone;
		this.truename = truename;
		this.idnumber = idnumber;
	}

	/** minimal constructor */
	public BsAdmin(Integer id, String username, String password, String jurisdiction,
			String telephone, String truename, String idnumber) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.jurisdiction = jurisdiction;
		this.telephone = telephone;
		this.truename = truename;
		this.idnumber = idnumber;
	}

	/** full constructor */
	public BsAdmin(String username, String password, String jurisdiction,
			String headimg, String sex, String birth, String telephone,
			String truename, String idnumber, Integer level) {
		this.username = username;
		this.password = password;
		this.jurisdiction = jurisdiction;
		this.headimg = headimg;
		this.sex = sex;
		this.birth = birth;
		this.telephone = telephone;
		this.truename = truename;
		this.idnumber = idnumber;
		this.level = level;
	}
	public BsAdmin(Integer id, String username, String password, String jurisdiction,
			String headimg, String sex, String birth, String telephone,
			String truename, String idnumber, Integer level) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.jurisdiction = jurisdiction;
		this.headimg = headimg;
		this.sex = sex;
		this.birth = birth;
		this.telephone = telephone;
		this.truename = truename;
		this.idnumber = idnumber;
		this.level = level;
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

	public String getJurisdiction() {
		return this.jurisdiction;
	}

	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
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

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}