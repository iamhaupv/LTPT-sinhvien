package com.example.SinhVien.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Lophoc")
public class Lophoc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String mslop;
	private int sisoDukien;
	private String tenLop;
	@OneToOne
	@PrimaryKeyJoinColumn
	private HosoLophoc hosolophoc;
	@OneToMany(mappedBy = "lophoc")
	private List<Sinhvien> dssv;
	public Lophoc() {
		// TODO Auto-generated constructor stub
	}
	public String getMslop() {
		return mslop;
	}
	public void setMslop(String mslop) {
		this.mslop = mslop;
	}
	public int getSisoDukien() {
		return sisoDukien;
	}
	public void setSisoDukien(int sisoDukien) {
		this.sisoDukien = sisoDukien;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	@Override
	public String toString() {
		return "LopHoc [mslop=" + mslop + ", sisoDukien=" + sisoDukien + ", tenLop=" + tenLop + "]";
	}
	public Lophoc(String mslop, int sisoDukien, String tenLop) {
		super();
		this.mslop = mslop;
		this.sisoDukien = sisoDukien;
		this.tenLop = tenLop;
	}
}
