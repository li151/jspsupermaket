package com.surper.pojo;

import java.io.Serializable;

/**
 * 商品供应商信息
 * @author lhql
 *
 */
public class gyslxr implements Serializable{
	private Integer gysid;
	private Integer suppid;
	private String gysname;
	private String gyssex;
	private String gysposition;
	private String gyscompany;
	private String gysah;
	private String gysphone;
	private String gysdesc;
	@Override
	public String toString() {
		return "gyslxr [gysid=" + gysid + ", suppid=" + suppid + ", gysname=" + gysname + ", gyssex=" + gyssex
				+ ", gysposition=" + gysposition + ", gyscompany=" + gyscompany + ", gysah=" + gysah + ", gysphone="
				+ gysphone + ", gysdesc=" + gysdesc + "]";
	}
	public Integer getGysid() {
		return gysid;
	}
	public void setGysid(Integer gysid) {
		this.gysid = gysid;
	}
	public Integer getSuppid() {
		return suppid;
	}
	public void setSuppid(Integer suppid) {
		this.suppid = suppid;
	}
	public String getGysname() {
		return gysname;
	}
	public void setGysname(String gysname) {
		this.gysname = gysname;
	}
	public String getGyssex() {
		return gyssex;
	}
	public void setGyssex(String gyssex) {
		this.gyssex = gyssex;
	}
	public String getGysposition() {
		return gysposition;
	}
	public void setGysposition(String gysposition) {
		this.gysposition = gysposition;
	}
	public String getGyscompany() {
		return gyscompany;
	}
	public void setGyscompany(String gyscompany) {
		this.gyscompany = gyscompany;
	}
	public String getGysah() {
		return gysah;
	}
	public void setGysah(String gysah) {
		this.gysah = gysah;
	}
	public String getGysphone() {
		return gysphone;
	}
	public void setGysphone(String gysphone) {
		this.gysphone = gysphone;
	}
	public String getGysdesc() {
		return gysdesc;
	}
	public void setGysdesc(String gysdesc) {
		this.gysdesc = gysdesc;
	}
	
	public gyslxr() {
		// TODO Auto-generated constructor stub
	}
}
