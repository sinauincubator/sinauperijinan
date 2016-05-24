package com.sinau.perizinan.domain;

public class Monitoring {
	private String pengesahan;
	private String noPermintaan;
	private String kodeIzin;
	private String Jenis;
	private String nomorIzin;
	private String aging;

	public String getPengesahan() {
		return pengesahan;
	}

	public void setPengesahan(String pengesahan) {
		this.pengesahan = pengesahan;
	}

	public String getnoPermintaan() {
		return noPermintaan;
	}

	public void setnoPermintaan(String noPermintaan) {
		this.noPermintaan = noPermintaan;
	}

	public String getkodeIzin() {
		return kodeIzin;
	}

	public void setkodeIzin(String kodeIzin) {
		this.kodeIzin = kodeIzin;
	}

	public String getJenis() {
		return Jenis;
	}

	public void setJenis(String jenis) {
		Jenis = jenis;
	}

	public String getnomorIzin() {
		return nomorIzin;
	}

	public void setnomorIzin(String nomorIzin) {
		this.nomorIzin = nomorIzin;
	}

	public String getaging() {
		return aging;
	}

	public void setaging(String aging) {
		this.aging = aging;
	}

}