package com.surper.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工信息表
 * @author lhql
 *
 */
public class staff implements Serializable{
	private Integer staid;
	private String staname;
	private String stasex;
	private String stajg;
	private Date stabirth; 
	private String staedu;
	private String stamarry;
	private String stacard;
	private String staphone;
	private String staadress;
	private String stadesc;
	private Date stacretime;
	@Override
	public String toString() {
		return "staff [staid=" + staid + ", staname=" + staname + ", stasex=" + stasex + ", stajg=" + stajg
				+ ", stabirth=" + stabirth + ", staedu=" + staedu + ", stamarry=" + stamarry + ", stacard=" + stacard
				+ ", staphone=" + staphone + ", staadress=" + staadress + ", stadesc=" + stadesc + ", stacretime="
				+ stacretime + "]";
	}
	public Integer getStaid() {
		return staid;
	}
	public void setStaid(Integer staid) {
		this.staid = staid;
	}
	public String getStaname() {
		return staname;
	}
	public void setStaname(String staname) {
		this.staname = staname;
	}
	public String getStasex() {
		return stasex;
	}
	public void setStasex(String stasex) {
		this.stasex = stasex;
	}
	public String getStajg() {
		return stajg;
	}
	public void setStajg(String stajg) {
		this.stajg = stajg;
	}
	public Date getStabirth() {
		return stabirth;
	}
	public void setStabirth(Date stabirth) {
		this.stabirth = stabirth;
	}
	public String getStaedu() {
		return staedu;
	}
	public void setStaedu(String staedu) {
		this.staedu = staedu;
	}
	public String getStamarry() {
		return stamarry;
	}
	public void setStamarry(String stamarry) {
		this.stamarry = stamarry;
	}
	public String getStacard() {
		return stacard;
	}
	public void setStacard(String stacard) {
		this.stacard = stacard;
	}
	public String getStaphone() {
		return staphone;
	}
	public void setStaphone(String staphone) {
		this.staphone = staphone;
	}
	public String getStaadress() {
		return staadress;
	}
	public void setStaadress(String staadress) {
		this.staadress = staadress;
	}
	public String getStadesc() {
		return stadesc;
	}
	public void setStadesc(String stadesc) {
		this.stadesc = stadesc;
	}
	public Date getStacretime() {
		return stacretime;
	}
	public void setStacretime(Date stacretime) {
		this.stacretime = stacretime;
	} 
	
	public staff() {
		// TODO Auto-generated constructor stub
	}
}
