package com.surper.pojo;

import java.io.Serializable;
/**
 * 员工考勤信息表
 * @author lhql
 *
 */
import java.util.Date;
public class attendance implements Serializable{
	private Integer attid;
	private Integer staid;
	private Date atttime;
	private String attend;
	private String attfraction;
	private String attdesc;
	@Override
	public String toString() {
		return "attendance [attid=" + attid + ", staid=" + staid + ", atttime=" + atttime + ", attend=" + attend
				+ ", attfraction=" + attfraction + ", attdesc=" + attdesc + "]";
	}
	public Integer getAttid() {
		return attid;
	}
	public void setAttid(Integer attid) {
		this.attid = attid;
	}
	public Integer getStaid() {
		return staid;
	}
	public void setStaid(Integer staid) {
		this.staid = staid;
	}
	public Date getAtttime() {
		return atttime;
	}
	public void setAtttime(Date atttime) {
		this.atttime = atttime;
	}
	public String getAttend() {
		return attend;
	}
	public void setAttend(String attend) {
		this.attend = attend;
	}
	public String getAttfraction() {
		return attfraction;
	}
	public void setAttfraction(String attfraction) {
		this.attfraction = attfraction;
	}
	public String getAttdesc() {
		return attdesc;
	}
	public void setAttdesc(String attdesc) {
		this.attdesc = attdesc;
	}
	public attendance() {
		// TODO Auto-generated constructor stub
	}
}
