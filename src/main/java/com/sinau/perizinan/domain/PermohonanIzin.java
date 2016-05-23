package com.sinau.perizinan.domain;

public class PermohonanIzin {
	private String nomorPermintaan;
	private String namaPemohon;
	private String idPemohon;
	private String namaPerusahaan;
	private String izin;
	private String noIzin;
	private String status;
	private String prosesSelanjutnya;
	private String tglInput;
	private String tglSelesai;
	private String entryOleh;

	public String getNomorPermintaan() {
		return nomorPermintaan;
	}
	public void setNomorPermintaan(String nomorPermintaan) {
		this.nomorPermintaan = nomorPermintaan;
	}
	public String getNamaPemohon() {
		return namaPemohon;
	}
	public void setNamaPemohon(String namaPemohon) {
		this.namaPemohon = namaPemohon;
	}
	public String getIdPemohon() {
		return idPemohon;
	}
	public void setIdPemohon(String idPemohon) {
		this.idPemohon = idPemohon;
	}
	public String getNamaPerusahaan() {
		return namaPerusahaan;
	}
	public void setNamaPerusahaan(String namaPerusahaan) {
		this.namaPerusahaan = namaPerusahaan;
	}
	public String getIzin() {
		return izin;
	}
	public void setIzin(String izin) {
		this.izin = izin;
	}
	public String getNoIzin() {
		return noIzin;
	}
	public void setNoIzin(String noIzin) {
		this.noIzin = noIzin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProsesSelanjutnya() {
		return prosesSelanjutnya;
	}
	public void setProsesSelanjutnya(String prosesSelanjutnya) {
		this.prosesSelanjutnya = prosesSelanjutnya;
	}
	public String getTglInput() {
		return tglInput;
	}
	public void setTglInput(String tglInput) {
		this.tglInput = tglInput;
	}
	public String getTglSelesai() {
		return tglSelesai;
	}
	public void setTglSelesai(String tglSelesai) {
		this.tglSelesai = tglSelesai;
	}
	public String getEntryOleh() {
		return entryOleh;
	}
	public void setEntryOleh(String entryOleh) {
		this.entryOleh = entryOleh;
	}



}
