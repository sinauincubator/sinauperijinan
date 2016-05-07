package com.sinau.perizinan.domain;

public class Pemohon {
	private String idPemohon;
	private String badanUsaha;
	private String namaUsaha;
	private String jenisPemohon;
	private String namaPemohon;
	private String jenisKelamin;
	private String alamat;
	
	public String getIdPemohon() {
		return idPemohon;
	}
	public void setIdPemohon(String idPemohon) {
		this.idPemohon = idPemohon;
	}
	public String getBadanUsaha() {
		return badanUsaha;
	}
	public void setBadanUsaha(String badanUsaha) {
		this.badanUsaha = badanUsaha;
	}
	public String getNamaUsaha() {
		return namaUsaha;
	}
	public void setNamaUsaha(String namaUsaha) {
		this.namaUsaha = namaUsaha;
	}
	public String getJenisPemohon() {
		return jenisPemohon;
	}
	public void setJenisPemohon(String jenisPemohon) {
		this.jenisPemohon = jenisPemohon;
	}
	public String getNamaPemohon() {
		return namaPemohon;
	}
	public void setNamaPemohon(String namaPemohon) {
		this.namaPemohon = namaPemohon;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}	
}
