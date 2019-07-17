package com.surper.pojo;

import java.io.Serializable;

/**
 * 用户登陆信息表
 * @author lhql
 *
 */
public class userstaff implements Serializable{
	private Integer userid;
	private String username;
	private String password;
	private String mdpassword;
	public userstaff(Integer userid, String username, String password, String mdpassword, String useridentity) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.mdpassword = mdpassword;
		this.useridentity = useridentity;
	}

	private String useridentity;
	
	public Integer getUserid() {
		return userid;
	}
	@Override
	public String toString() {
		return "userstaff [userid=" + userid + ", username=" + username + ", password=" + password + ", mdpassword="
				+ mdpassword + ", useridentity=" + useridentity + "]";
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMdpassword() {
		return mdpassword;
	}
	public void setMdpassword(String mdpassword) {
		this.mdpassword = mdpassword;
	}
	public String getUseridentity() {
		return useridentity;
	}
	public void setUseridentity(String useridentity) {
		this.useridentity = useridentity;
	}
	
	public userstaff() {
		
	}
	
	
}
