package com.surper.pojo;

import java.io.Serializable;

/**
 * 店铺表
 * @author lhql
 *
 */
public class shop implements Serializable{
	private Integer shoid;
	private String shoclass;
	private String shoname;
	@Override
	public String toString() {
		return "shop [shoid=" + shoid + ", shoclass=" + shoclass + ", shoname=" + shoname + "]";
	}
	public Integer getShoid() {
		return shoid;
	}
	public void setShoid(Integer shoid) {
		this.shoid = shoid;
	}
	public String getShoclass() {
		return shoclass;
	}
	public void setShoclass(String shoclass) {
		this.shoclass = shoclass;
	}
	public String getShoname() {
		return shoname;
	}
	public void setShoname(String shoname) {
		this.shoname = shoname;
	}
	
	public shop() {
		// TODO Auto-generated constructor stub
	}
}
