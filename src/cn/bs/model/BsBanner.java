package cn.bs.model;

/**
 * BsBanner entity. @author MyEclipse Persistence Tools
 */

public class BsBanner implements java.io.Serializable {

	// Fields

	private Integer id;
	private String img;
	private String url;

	// Constructors

	/** default constructor */
	public BsBanner() {
	}

	/** minimal constructor */
	public BsBanner(String img) {
		this.img = img;
	}
	public BsBanner(Integer id, String img) {
		this.id = id;
		this.img = img;
	}

	/** full constructor */
	public BsBanner(String img, String url) {
		this.img = img;
		this.url = url;
	}
	public BsBanner(Integer id, String img, String url) {
		this.id = id;
		this.img = img;
		this.url = url;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}