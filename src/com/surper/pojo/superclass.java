package com.surper.pojo;

import java.io.Serializable;

/**
 * 商品类别表
 */
public class superclass implements Serializable{
	private Integer supid;
	private String supname;
	@Override
	public String toString() {
		return "superclass [supid=" + supid + ", supname=" + supname + "]";
	}
	public Integer getSupid() {
		return supid;
	}
	public void setSupid(Integer supid) {
		this.supid = supid;
	}
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	
	public superclass() {
		// TODO Auto-generated constructor stub
	}
	
}
