package com.example.SinhVien.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bangdiem")
public class Bangdiem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name = "msmh")
	private Monhoc monhoc;
	@Id
	@ManyToOne
	@JoinColumn(name = "mssv")
	private Sinhvien sinhvien;
	private float diemthi;
	private int lanthi;
	public Bangdiem() {
		// TODO Auto-generated constructor stub
	}
	public Bangdiem(float diemthi, int lanthi) {
		super();
		this.diemthi = diemthi;
		this.lanthi = lanthi;
	}
	public float getDiemthi() {
		return diemthi;
	}
	public void setDiemthi(float diemthi) {
		this.diemthi = diemthi;
	}
	public int getLanthi() {
		return lanthi;
	}
	public void setLanthi(int lanthi) {
		this.lanthi = lanthi;
	}
	@Override
	public String toString() {
		return "Bangdiem [diemthi=" + diemthi + ", lanthi=" + lanthi + "]";
	}
}
