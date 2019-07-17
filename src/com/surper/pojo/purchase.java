package com.surper.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品采购信息表
 * @author lhql
 *
 */
public class purchase implements Serializable{
	private Integer purid;
	private Integer marid;
	private String purname;
	private Integer puruserid;
	private String purcontact;
	private String pursum;
	private String purprice;
	private Date purtime;
	private String puraddres;
	private String purdesc;
	private Date purdate;
	
	@Override
	public String toString() {
		return "purchase [purid=" + purid + ", marid=" + marid + ", purname=" + purname + ", puruserid=" + puruserid
				+ ", purcontact=" + purcontact + ", pursum=" + pursum + ", purprice=" + purprice + ", purtime="
				+ purtime + ", puraddres=" + puraddres + ", purdesc=" + purdesc + ", purdate=" + purdate + "]";
	}

	public Integer getPurid() {
		return purid;
	}

	public void setPurid(Integer purid) {
		this.purid = purid;
	}

	public Integer getMarid() {
		return marid;
	}

	public void setMarid(Integer marid) {
		this.marid = marid;
	}

	public String getPurname() {
		return purname;
	}

	public void setPurname(String purname) {
		this.purname = purname;
	}

	public Integer getPuruserid() {
		return puruserid;
	}

	public void setPuruserid(Integer puruserid) {
		this.puruserid = puruserid;
	}

	public String getPurcontact() {
		return purcontact;
	}

	public void setPurcontact(String purcontact) {
		this.purcontact = purcontact;
	}

	public String getPursum() {
		return pursum;
	}

	public void setPursum(String pursum) {
		this.pursum = pursum;
	}

	public String getPurprice() {
		return purprice;
	}

	public void setPurprice(String purprice) {
		this.purprice = purprice;
	}

	public Date getPurtime() {
		return purtime;
	}

	public void setPurtime(Date purtime) {
		this.purtime = purtime;
	}

	public String getPuraddres() {
		return puraddres;
	}

	public void setPuraddres(String puraddres) {
		this.puraddres = puraddres;
	}

	public String getPurdesc() {
		return purdesc;
	}

	public void setPurdesc(String purdesc) {
		this.purdesc = purdesc;
	}

	public Date getPurdate() {
		return purdate;
	}

	public void setPurdate(Date purdate) {
		this.purdate = purdate;
	}

	public purchase() {
		// TODO Auto-generated constructor stub
	}
}
