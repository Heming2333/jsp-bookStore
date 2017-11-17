package cn.bs.model;

/**
 * BsBooks entity. @author MyEclipse Persistence Tools
 */

public class BsBooks implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String subtitle;
	private String number;
	private String img;
	private String detailimg;
	private String nprice;
	private String oprice;
	private String author;
	private String publish;
	private String publishtime;
	private String classifyid;
	private String percentage;
	private String postage;
	private String evalid;
	private String integer;
	private String store;
	private String sale;

	// Constructors

	/** default constructor */
	public BsBooks() {
	}

	/** minimal constructor */
	public BsBooks(String title, String subtitle) {
		this.title = title;
		this.subtitle = subtitle;
	}

	/** minimal constructor */
	public BsBooks(Integer id, String title, String subtitle) {
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
	}

	/** full constructor */
	public BsBooks(String title, String subtitle, String number, String img,
			String detailimg, String nprice, String oprice, String author,
			String publish, String publishtime, String classifyid,
			String percentage, String postage, String evalid, String integer,
			String store, String sale) {
		this.title = title;
		this.subtitle = subtitle;
		this.number = number;
		this.img = img;
		this.detailimg = detailimg;
		this.nprice = nprice;
		this.oprice = oprice;
		this.author = author;
		this.publish = publish;
		this.publishtime = publishtime;
		this.classifyid = classifyid;
		this.percentage = percentage;
		this.postage = postage;
		this.evalid = evalid;
		this.integer = integer;
		this.store = store;
		this.sale = sale;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDetailimg() {
		return this.detailimg;
	}

	public void setDetailimg(String detailimg) {
		this.detailimg = detailimg;
	}

	public String getNprice() {
		return this.nprice;
	}

	public void setNprice(String nprice) {
		this.nprice = nprice;
	}

	public String getOprice() {
		return this.oprice;
	}

	public void setOprice(String oprice) {
		this.oprice = oprice;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return this.publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getPublishtime() {
		return this.publishtime;
	}

	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}

	public String getClassifyid() {
		return this.classifyid;
	}

	public void setClassifyid(String classifyid) {
		this.classifyid = classifyid;
	}

	public String getPercentage() {
		return this.percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getPostage() {
		return this.postage;
	}

	public void setPostage(String postage) {
		this.postage = postage;
	}

	public String getEvalid() {
		return this.evalid;
	}

	public void setEvalid(String evalid) {
		this.evalid = evalid;
	}

	public String getInteger() {
		return this.integer;
	}

	public void setInteger(String integer) {
		this.integer = integer;
	}

	public String getStore() {
		return this.store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getSale() {
		return this.sale;
	}

	public void setSale(String sale) {
		this.sale = sale;
	}

}