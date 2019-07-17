package com.surper.pojo;

import java.io.Serializable;

/**
 * 商品销售信息表
 * @author lhql
 *
 */
public class sales implements Serializable{
	private Integer salid;
	private String salname;
	private String salunit;
	private String salsum;
	private String salprice;
	@Override
	public String toString() {
		return "sales [salid=" + salid + ", salname=" + salname + ", salunit=" + salunit + ", salsum=" + salsum
				+ ", salprice=" + salprice + "]";
	}
	public Integer getSalid() {
		return salid;
	}
	public void setSalid(Integer salid) {
		this.salid = salid;
	}
	public String getSalname() {
		return salname;
	}
	public void setSalname(String salname) {
		this.salname = salname;
	}
	public String getSalunit() {
		return salunit;
	}
	public void setSalunit(String salunit) {
		this.salunit = salunit;
	}
	public String getSalsum() {
		return salsum;
	}
	public void setSalsum(String salsum) {
		this.salsum = salsum;
	}
	public String getSalprice() {
		return salprice;
	}
	public void setSalprice(String salprice) {
		this.salprice = salprice;
	}
	public sales() {
		// TODO Auto-generated constructor stub
	}
	
}
