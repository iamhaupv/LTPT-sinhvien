package com.example.SinhVien.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Diachi implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String duong;
	private String phuong;
	private String quan;
	private String sonha;
	private String thanhPho;
	public Diachi() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DiaChi [duong=" + duong + ", phuong=" + phuong + ", quan=" + quan + ", sonha=" + sonha + ", thanhPho="
				+ thanhPho + "]";
	}
	public String getDuong() {
		return duong;
	}
	public void setDuong(String duong) {
		this.duong = duong;
	}
	public String getPhuong() {
		return phuong;
	}
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	public String getQuan() {
		return quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public String getSonha() {
		return sonha;
	}
	public void setSonha(String sonha) {
		this.sonha = sonha;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	public Diachi(String duong, String phuong, String quan, String sonha, String thanhPho) {
		super();
		this.duong = duong;
		this.phuong = phuong;
		this.quan = quan;
		this.sonha = sonha;
		this.thanhPho = thanhPho;
	}
	
}
