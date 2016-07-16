package com.sinau.perizinan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "MONITORING")
public class Monitoring implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "PENGESAHAN")
	private String pengesahan;
	@Column(name = "NO_PERMINTAAN", unique = true, nullable = false)
	@NotBlank(message = "Kode KBLI tidak boleh kosong.")
	private String noPermintaan;
	@Column(name = "KODE_IZIN")
	private String kodeIzin;
	@Column(name = "JENIS")
	private String Jenis;
	@Column(name = "NOMOR_IZIN")
	private String nomorIzin;
	@Column(name = "AGING")
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
