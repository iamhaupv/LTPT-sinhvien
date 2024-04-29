package com.example.SinhVien.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(name = "Sinhvien")
public class Sinhvien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ElementCollection
	@CollectionTable(
	name = "Dienthoai", 
	joinColumns = @JoinColumn(name="mssv"),
	uniqueConstraints = @UniqueConstraint(columnNames = {"mssv", "dienthoai"})
	)
	@Column(name = "dienthoai", nullable = false)
	private Set<String> dsDienthoai;
	private String gioitinh;
	private String ho;
	@Id
	private String mssv;
	private LocalDate ngaysinh;
	private String ten;
	@Embedded
	private Diachi diachi;
	@ManyToOne
	@JoinColumn(name = "mslop")
	private Lophoc lophoc;
	@OneToMany(mappedBy = "sinhvien")
	private List<Bangdiem> dsdk;
	public Set<String> getDsDienthoai() {
		return dsDienthoai;
	}
	public void setDsDienthoai(Set<String> dsDienthoai) {
		this.dsDienthoai = dsDienthoai;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public LocalDate getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Diachi getDiachi() {
		return diachi;
	}
	public void setDiachi(Diachi diachi) {
		this.diachi = diachi;
	}
	public Sinhvien(Set<String> dsDienthoai, String gioitinh, String ho, String mssv, LocalDate ngaysinh, String ten,
			Diachi diachi) {
		super();
		this.dsDienthoai = dsDienthoai;
		this.gioitinh = gioitinh;
		this.ho = ho;
		this.mssv = mssv;
		this.ngaysinh = ngaysinh;
		this.ten = ten;
		this.diachi = diachi;
	}
	@Override
	public String toString() {
		return "Sinhvien [dsDienthoai=" + dsDienthoai + ", gioitinh=" + gioitinh + ", ho=" + ho + ", mssv=" + mssv
				+ ", ngaysinh=" + ngaysinh + ", ten=" + ten + ", diachi=" + diachi + "]";
	}
	
}
