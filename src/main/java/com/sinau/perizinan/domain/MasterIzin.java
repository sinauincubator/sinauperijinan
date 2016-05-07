package com.sinau.perizinan.domain;

public class MasterIzin {
	private String kodeIzin;
	private String jenis;
	private String izin;
	private String dasar;
	private String peraturan;
	private String kpi;
	private String aktif;

	public String getKodeIzin() {
		return kodeIzin;
	}
	public void setKodeIzin(String kodeIzin) {
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
