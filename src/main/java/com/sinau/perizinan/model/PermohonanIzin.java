package com.sinau.perizinan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERMOHONAN_IZIN")
public class PermohonanIzin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "NO_PERMINTAAN")
	private String nomorPermintaan;
	@Column(name = "NAMA_PEMOHON")
	private String namaPemohon;
	@Id
	@Column(name = "ID_PEMOHON")
	private String idPemohon;
	@Column(name = "NAMA_PERUSAHAAN")
	private String namaPerusahaan;
	@Column(name = "IZIN")
	private String izin;
	@Column(name = "NO_IZIN")
	private String noIzin;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "PROSES_SELANJUTNYA")
	private String prosesSelanjutnya;
	@Column(name = "TANGGAL_INPUT")
	private String tglInput;
	@Column(name = "TANGGAL_SELESAI")
	private String tglSelesai;
	@Column(name = "ENTRY_OLEH")
	private String entryOleh;

	@Column(name = "ALAMAT")
	private String alamat;
	@Column(name = "TELEPON")
	private String telepon;
	@Column(name = "TANGGAL")
	private String tanggal;
	@Column(name = "WAKTU_PROSES")
	private String waktuProses;
	@Column(name = "EXTERNAL_DOCUMENT")
	private String extDoc;
	@Column(name = "NO_DOCUMENT")
	private String docNo;
	@Column(name = "KODE")
	private String kode;
	@Column(name = "KETERANGAN")
	private String keterangan;
	@Column(name = "PHOTO")
	private String photo;
	
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
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getTelepon() {
		return telepon;
	}
	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}
	public String getTanggal() {
		return tanggal;
	}
	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}
	public String getWaktuProses() {
		return waktuProses;
	}
	public void setWaktuProses(String waktuProses) {
		this.waktuProses = waktuProses;
	}
	public String getExtDoc() {
		return extDoc;
	}
	public void setExtDoc(String extDoc) {
		this.extDoc = extDoc;
	}
	public String getDocNo() {
		return docNo;
	}
	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
}
