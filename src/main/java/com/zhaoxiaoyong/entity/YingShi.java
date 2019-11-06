package com.zhaoxiaoyong.entity;

public class YingShi {
	
	private Integer yid;
	private String yname;
	private String ysname;
	private Double price;
	private String starttime;
	private String ytime;
	private String type;
	private Integer nian;
	private String area;
	private String zt;
	
	public YingShi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YingShi(Integer yid, String yname, String ysname, Double price, String starttime, String ytime, String type,
			Integer nian, String area, String zt) {
		super();
		this.yid = yid;
		this.yname = yname;
		this.ysname = ysname;
		this.price = price;
		this.starttime = starttime;
		this.ytime = ytime;
		this.type = type;
		this.nian = nian;
		this.area = area;
		this.zt = zt;
	}

	public Integer getYid() {
		return yid;
	}

	public void setYid(Integer yid) {
		this.yid = yid;
	}

	public String getYname() {
		return yname;
	}

	public void setYname(String yname) {
		this.yname = yname;
	}

	public String getYsname() {
		return ysname;
	}

	public void setYsname(String ysname) {
		this.ysname = ysname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getYtime() {
		return ytime;
	}

	public void setYtime(String ytime) {
		this.ytime = ytime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNian() {
		return nian;
	}

	public void setNian(Integer nian) {
		this.nian = nian;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	@Override
	public String toString() {
		return "YingShi [yid=" + yid + ", yname=" + yname + ", ysname=" + ysname + ", price=" + price + ", starttime="
				+ starttime + ", ytime=" + ytime + ", type=" + type + ", nian=" + nian + ", area=" + area + ", zt=" + zt
				+ "]";
	}
	
	
	
}
