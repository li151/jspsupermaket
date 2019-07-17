package com.surper.pojo;

import java.io.Serializable;
/**
 * 用户权限表
 * @author lhql
 *
 */
public class userqx implements Serializable{
	private Integer userid;
	private String userqxmk;
	private String userqxzmk;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserqxmk() {
		return userqxmk;
	}
	public void setUserqxmk(String userqxmk) {
		this.userqxmk = userqxmk;
	}
	public String getUserqxzmk() {
		return userqxzmk;
	}
	public void setUserqxzmk(String userqxzmk) {
		this.userqxzmk = userqxzmk;
	}
	@Override
	public String toString() {
		return "userqx [userid=" + userid + ", userqxmk=" + userqxmk + ", userqxzmk=" + userqxzmk + "]";
	}
	
	public userqx() {
		
	}
	
}
