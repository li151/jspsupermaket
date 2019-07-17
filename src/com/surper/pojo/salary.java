package com.surper.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工工资信息表
 * @author lhql
 *
 */
public class salary implements Serializable{
	private Integer larid;
	private Integer staid;
	private String stasalary;
	private String larjdjj;
	private String larndjj;
	private String largljj;
	private Date lartime;
	@Override
	public String toString() {
		return "salary [larid=" + larid + ", staid=" + staid + ", stasalary=" + stasalary + ", larjdjj=" + larjdjj
				+ ", larndjj=" + larndjj + ", largljj=" + largljj + ", lartime=" + lartime + "]";
	}
	public Integer getLarid() {
		return larid;
	}
	public void setLarid(Integer larid) {
		this.larid = larid;
	}
	public Integer getStaid() {
		return staid;
	}
	public void setStaid(Integer staid) {
		this.staid = staid;
	}
	public String getStasalary() {
		return stasalary;
	}
	public void setStasalary(String stasalary) {
		this.stasalary = stasalary;
	}
	public String getLarjdjj() {
		return larjdjj;
	}
	public void setLarjdjj(String larjdjj) {
		this.larjdjj = larjdjj;
	}
	public String getLarndjj() {
		return larndjj;
	}
	public void setLarndjj(String larndjj) {
		this.larndjj = larndjj;
	}
	public String getLargljj() {
		return largljj;
	}
	public void setLargljj(String largljj) {
		this.largljj = largljj;
	}
	public Date getLartime() {
		return lartime;
	}
	public void setLartime(Date lartime) {
		this.lartime = lartime;
	}
	
	public salary() {
		// TODO Auto-generated constructor stub
	}
	
}
