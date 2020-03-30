package com.yc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Good implements Serializable{
	private Integer gid;
	private String gname;
	private List<Shop> shops;
	
	public List<Shop> getShops() {
		return shops;
	}
	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	
}
