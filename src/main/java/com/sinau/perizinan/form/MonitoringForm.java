package com.sinau.perizinan.form;

public class MonitoringForm {
	private Integer id;
	private String pengesahan;
	private String noPermintaan;
	private String kodeIzin;
	private String Jenis;
	private String nomorIzin;
	private String aging;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPengesahan() {
		return pengesahan;
	}

	public void setPengesahan(String pengesahan) {
		this.pengesahan = pengesahan;
	}

	public String getNoPermintaan() {
		return noPermintaan;
	}

	public void setNoPermintaan(String noPermintaan) {
		this.noPermintaan = noPermintaan;
	}

	public String getKodeIzin() {
		return kodeIzin;
	}

	public void setKodeIzin(String kodeIzin) {
		this.kodeIzin = kodeIzin;
	}

	public String getJenis() {
		return Jenis;
	}

	public void setJenis(String jenis) {
		Jenis = jenis;
	}

	public String getNomorIzin() {
		return nomorIzin;
	}

	public void setNomorIzin(String nomorIzin) {
		this.nomorIzin = nomorIzin;
	}

	public String getAging() {
		return aging;
	}

	public void setAging(String aging) {
		this.aging = aging;
	}

}