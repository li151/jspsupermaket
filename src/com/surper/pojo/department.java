package com.surper.pojo;

import java.io.Serializable;
/**
 * 部门信息表
 * @author lhql
 *
 */
public class department implements Serializable{
	private Integer depid;
	private String depname;
	@Override
	public String toString() {
		return "department [depid=" + depid + ", depname=" + depname + "]";
	}
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public department() {
		// TODO Auto-generated constructor stub
	}
}
