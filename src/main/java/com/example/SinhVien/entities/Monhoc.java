package com.example.SinhVien.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Monhoc")
public class Monhoc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hockygd;
	@Id
	private String msmh;
	private int sotinchi;
	private String tenmh;
	@OneToMany(mappedBy = "monhoc")
	private List<Bangdiem> dsdk; 
	public Monhoc() {
		// TODO Auto-generated constructor stub
	}
	public int getHockygd() {
		return hockygd;
	}
	public void setHockygd(int hockygd) {
		this.hockygd = hockygd;
	}
	public String getMsmh() {
		return msmh;
	}
	public void setMsmh(String msmh) {
		this.msmh = msmh;
	}
	public int getSotinchi() {
		return sotinchi;
	}
	public void setSotinchi(int sotinchi) {
		this.sotinchi = sotinchi;
	}
	public String getTenmh() {
		return tenmh;
	}
	public void setTenmh(String tenmh) {
		this.tenmh = tenmh;
	}
	public Monhoc(int hockygd, String msmh, int sotinchi, String tenmh) {
		super();
		this.hockygd = hockygd;
		this.msmh = msmh;
		this.sotinchi = sotinchi;
		this.tenmh = tenmh;
	}
	@Override
	public String toString() {
		return "Monhoc [hockygd=" + hockygd + ", msmh=" + msmh + ", sotinchi=" + sotinchi + ", tenmh=" + tenmh + "]";
	}
}
