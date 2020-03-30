package com.yc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;


public class Shop implements Serializable{
	private Integer sid;
	private String sname;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date sdate;
	private List<Good> goods;
	
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public List<Good> getGoods() {
		return goods;
	}
	public void setGoods(List<Good> goods) {
		this.goods = goods;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
