package com.example.SinhVien.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "HosoLophoc")
public class HosoLophoc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ghichu;
	@Id
	private String mshs;
	private Date ngaylap;
	@OneToOne
	@MapsId
	@JoinColumn(name = "mshs")
	private Lophoc lophoc;
	public HosoLophoc() {
		// TODO Auto-generated constructor stub
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	public String getMshs() {
		return mshs;
	}
	public void setMshs(String mshs) {
		this.mshs = mshs;
	}
	public Date getNgaylap() {
		return ngaylap;
	}
	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}
	public HosoLophoc(String ghichu, String mshs, Date ngaylap) {
		super();
		this.ghichu = ghichu;
		this.mshs = mshs;
		this.ngaylap = ngaylap;
	}
	@Override
	public String toString() {
		return "HoSoLopHoc [ghichu=" + ghichu + ", mshs=" + mshs + ", ngaylap=" + ngaylap + "]";
	}
}
