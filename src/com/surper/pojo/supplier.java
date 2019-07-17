package com.surper.pojo;

import java.io.Serializable;
/**
 * 商品供应商信息
 * @author lhql
 *
 */
public class supplier implements Serializable{
	private Integer suppid;
	private String suppname;
	private String suppaddres;
	private String suppyb;
	private String suppproduct;
	@Override
	public String toString() {
		return "supplier [suppid=" + suppid + ", suppname=" + suppname + ", suppaddres=" + suppaddres + ", suppyb="
				+ suppyb + ", suppproduct=" + suppproduct + "]";
	}
	public Integer getSuppid() {
		return suppid;
	}
	public void setSuppid(Integer suppid) {
		this.suppid = suppid;
	}
	public String getSuppname() {
		return suppname;
	}
	public void setSuppname(String suppname) {
		this.suppname = suppname;
	}
	public String getSuppaddres() {
		return suppaddres;
	}
	public void setSuppaddres(String suppaddres) {
		this.suppaddres = suppaddres;
	}
	public String getSuppyb() {
		return suppyb;
	}
	public void setSuppyb(String suppyb) {
		this.suppyb = suppyb;
	}
	public String getSuppproduct() {
		return suppproduct;
	}
	public void setSuppproduct(String suppproduct) {
		this.suppproduct = suppproduct;
	}
	public supplier() {
		// TODO Auto-generated constructor stub
	}
}
