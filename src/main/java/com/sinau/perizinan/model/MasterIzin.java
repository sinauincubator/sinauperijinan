package com.sinau.perizinan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name="MASTER_IZIN")
public class MasterIzin implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="KODE_IZIN")
	@Min(
         value = 1,
         message = "Id privasi harus angka dan tidak boleh 0."
    )
	private int kodeIzin;

	@Column(name="JENIS")
	private String jenis;

	@Column(name="IZIN")
	private String izin;

	@Column(name="DASAR")
	private String dasar;

	@Column(name="PERATURAN")
	private String peraturan;

	@Column(name="KPI")
	private String kpi;

	@Column(name="AKTIF")
	private String aktif;

	public int getKodeIzin() {
		return kodeIzin;
	}

	public void setKodeIzin(int kodeIzin) {
		this.kodeIzin = kodeIzin;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public String getIzin() {
		return izin;
	}

	public void setIzin(String izin) {
		this.izin = izin;
	}

	public String getDasar() {
		return dasar;
	}

	public void setDasar(String dasar) {
		this.dasar = dasar;
	}

	public String getPeraturan() {
		return peraturan;
	}

	public void setPeraturan(String peraturan) {
		this.peraturan = peraturan;
	}

	public String getKpi() {
		return kpi;
	}

	public void setKpi(String kpi) {
		this.kpi = kpi;
	}

	public String getAktif() {
		return aktif;
	}

	public void setAktif(String aktif) {
		this.aktif = aktif;
	}

}
