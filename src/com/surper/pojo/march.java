package com.surper.pojo;

import java.io.Serializable;
/**
 * 商品信息表
 * @author lhql
 *
 */
public class march implements Serializable{
	private Integer marid;
	private String marclass;
	private String marname;
	private String marunit;
	private String marnowprice;
	private String marlastprice;
	private String marsum;
	private String mardesc;
	@Override
	public String toString() {
		return "march [marid=" + marid + ", marclass=" + marclass + ", marname=" + marname + ", marunit=" + marunit
				+ ", marnowprice=" + marnowprice + ", marlastprice=" + marlastprice + ", marsum=" + marsum
				+ ", mardesc=" + mardesc + "]";
	}
	public Integer getMarid() {
		return marid;
	}
	public void setMarid(Integer marid) {
		this.marid = marid;
	}
	public String getMarclass() {
		return marclass;
	}
	public void setMarclass(String marclass) {
		this.marclass = marclass;
	}
	public String getMarname() {
		return marname;
	}
	public void setMarname(String marname) {
		this.marname = marname;
	}
	public String getMarunit() {
		return marunit;
	}
	public void setMarunit(String marunit) {
		this.marunit = marunit;
	}
	public String getMarnowprice() {
		return marnowprice;
	}
	public void setMarnowprice(String marnowprice) {
		this.marnowprice = marnowprice;
	}
	public String getMarlastprice() {
		return marlastprice;
	}
	public void setMarlastprice(String marlastprice) {
		this.marlastprice = marlastprice;
	}
	public String getMarsum() {
		return marsum;
	}
	public void setMarsum(String marsum) {
		this.marsum = marsum;
	}
	public String getMardesc() {
		return mardesc;
	}
	public void setMardesc(String mardesc) {
		this.mardesc = mardesc;
	}
	
	public march() {
		// TODO Auto-generated constructor stub
	}
}
