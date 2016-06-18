package com.sinau.perizinan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MASTER_PEMOHON")
public class MasterPemohon implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PEMOHON")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPemohon;

	// detail yang mendaftarkan
	@Column(name="NAMA_WAKIL")
	private String nama;

	@Column(name="NOMOR_KTP_WAKIL")
	private String nomorKtp;

	@Column(name="ALAMAT_WAKIL")
	private String alamatWakil;

	@Column(name="JENIS_PEMOHON")
	private String jenisPemohon;

	// detail pemohon

	@Column(name="NAMA_PEMOHON")
	private String namaPemohon;

	@Column(name="JENIS_KELAMIN")
	private String jenisKelamin;

	@Column(name="TEMAPT_LAHIR")
	private String tempatLahir;

	@Column(name="TANGGAL_LAHIR")
	private String tanggalLahir;

	@Column(name="NPWP")
	private String npwp;

	@Column(name="NO_KTP_PEMOHON")
	private int noKtpPemohon;

	@Column(name="JENIS_IDENTITAS_LAIN")
	private String jenisIdentitasLain;

	@Column(name="NO_IDENTITAS")
	private int noIdentitas;

	@Column(name="NO_HP")
	private String noHp;

	@Column(name="EMAIL")
	private String email;

	@Column(name="PEKERJAAN")
	private String pekerjaan;

	@Column(name="ALAMAT")
	private String alamat;

	@Column(name="PROPINSI")
	private String propinsi;

	@Column(name="KOTA")
	private String kota;

	@Column(name="KECAMATAN")
	private String kecamatan;

	@Column(name="KELURAHAN_DESA")
	private String kelurahanDesa;

	@Column(name="PASSWORD")
	private String password;

	// detail perusahaan

	@Column(name="NAMA_USAHA")
	private String namaUsaha;

	@Column(name="JABATAN")
	private String jabatan;

	@Column(name="BADAN_USAHA")
	private String badanUsaha;

	@Column(name="NAMA_SINGKAT")
	private String namaSingkat;

	@Column(name="ALAMAT_PERUSAHAAN")
	private String alamatPerusahaan;

	@Column(name="PROPINSI_PERUSAHAAN")
	private String propinsiPerusahaan;

	@Column(name="KABUPATEN_PERUSAHAAN")
	private String kabupatenPerusahaan;

	@Column(name="KECAMATAN_PERUSAHAAN")
	private String kecamatanPerusahaan;

	@Column(name="DESA_PERUSAHAAN")
	private String desaPerusahaan;

	@Column(name="LOKASI_PERUSAHAAN")
	private String lokasiPerusahaan;

	@Column(name="NOMOR_TELEPON_PERUSAHAAN")
	private String nomorTeleponPerusahaan;

	@Column(name="NOMOR_FAX")
	private String nomorFax;

	@Column(name="STATUS_TEMPAT_USAHA")
	private String statusTempatUsaha;

	@Column(name="NPWP_PERUSAHAAN")
	private String npwpPerusahaan;

	@Column(name="JENIS_KEGIATAN_PERUSAHAAN")
	private String jenisKegiatanPerusahaan;

	@Column(name="NAMA_NOTARIS")
	private String namaNotaris;

	@Column(name="NOMOR_AKTA_NOTARIS")
	private String nomorAktaNotaris;

	@Column(name="WILAYAH_KERJA_NOTARIS")
	private String wilayahKerjaNotaris;

	@Column(name="ALAMAT_NOTARIS")
	private String alamatNotaris;

	@Column(name="TANGGAL_PENGESAHAN")
	private String tanggalPengesahan;

	@Column(name="DATA_AKTA_PENDIRI_USAHA")
	private String dataAktaPendiriUsaha;

	@Column(name="IZIN_LAIN")
	private String izinLain;

	@Column(name="MODAL_USAHA")
	private String modalUsaha;

	// detailpengurus
	@Column(name="NAMA_PENGURUS")
	private String namaPengurus;

	@Column(name="JABATAN_PENGURUS")
	private String jabatanPengurus;

	@Column(name="JENIS_KELAMIN_PENGURUS")
	private String jenisKelaminPengurus;

	@Column(name="NOMOR_TELEPON_PENGURUS")
	private String nomorTeleponPengurus;

	@Column(name="ALAMAT_PENGURUS")
	private String alamatPengurus;

	public int getIdPemohon() {
		return idPemohon;
	}

	public void setIdPemohon(int idPemohon) {
		this.idPemohon = idPemohon;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNomorKtp() {
		return nomorKtp;
	}

	public void setNomorKtp(String nomorKtp) {
		this.nomorKtp = nomorKtp;
	}

	public String getAlamatWakil() {
		return alamatWakil;
	}

	public void setAlamatWakil(String alamatWakil) {
		this.alamatWakil = alamatWakil;
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

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getNpwp() {
		return npwp;
	}

	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}

	public int getNoKtpPemohon() {
		return noKtpPemohon;
	}

	public void setNoKtpPemohon(int noKtpPemohon) {
		this.noKtpPemohon = noKtpPemohon;
	}

	public String getJenisIdentitasLain() {
		return jenisIdentitasLain;
	}

	public void setJenisIdentitasLain(String jenisIdentitasLain) {
		this.jenisIdentitasLain = jenisIdentitasLain;
	}

	public int getNoIdentitas() {
		return noIdentitas;
	}

	public void setNoIdentitas(int noIdentitas) {
		this.noIdentitas = noIdentitas;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getPropinsi() {
		return propinsi;
	}

	public void setPropinsi(String propinsi) {
		this.propinsi = propinsi;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getKecamatan() {
		return kecamatan;
	}

	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}

	public String getKelurahanDesa() {
		return kelurahanDesa;
	}

	public void setKelurahanDesa(String kelurahanDesa) {
		this.kelurahanDesa = kelurahanDesa;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNamaUsaha() {
		return namaUsaha;
	}

	public void setNamaUsaha(String namaUsaha) {
		this.namaUsaha = namaUsaha;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getBadanUsaha() {
		return badanUsaha;
	}

	public void setBadanUsaha(String badanUsaha) {
		this.badanUsaha = badanUsaha;
	}

	public String getNamaSingkat() {
		return namaSingkat;
	}

	public void setNamaSingkat(String namaSingkat) {
		this.namaSingkat = namaSingkat;
	}

	public String getAlamatPerusahaan() {
		return alamatPerusahaan;
	}

	public void setAlamatPerusahaan(String alamatPerusahaan) {
		this.alamatPerusahaan = alamatPerusahaan;
	}

	public String getPropinsiPerusahaan() {
		return propinsiPerusahaan;
	}

	public void setPropinsiPerusahaan(String propinsiPerusahaan) {
		this.propinsiPerusahaan = propinsiPerusahaan;
	}

	public String getKabupatenPerusahaan() {
		return kabupatenPerusahaan;
	}

	public void setKabupatenPerusahaan(String kabupatenPerusahaan) {
		this.kabupatenPerusahaan = kabupatenPerusahaan;
	}

	public String getKecamatanPerusahaan() {
		return kecamatanPerusahaan;
	}

	public void setKecamatanPerusahaan(String kecamatanPerusahaan) {
		this.kecamatanPerusahaan = kecamatanPerusahaan;
	}

	public String getDesaPerusahaan() {
		return desaPerusahaan;
	}

	public void setDesaPerusahaan(String desaPerusahaan) {
		this.desaPerusahaan = desaPerusahaan;
	}

	public String getLokasiPerusahaan() {
		return lokasiPerusahaan;
	}

	public void setLokasiPerusahaan(String lokasiPerusahaan) {
		this.lokasiPerusahaan = lokasiPerusahaan;
	}

	public String getNomorTeleponPerusahaan() {
		return nomorTeleponPerusahaan;
	}

	public void setNomorTeleponPerusahaan(String nomorTeleponPerusahaan) {
		this.nomorTeleponPerusahaan = nomorTeleponPerusahaan;
	}

	public String getNomorFax() {
		return nomorFax;
	}

	public void setNomorFax(String nomorFax) {
		this.nomorFax = nomorFax;
	}

	public String getStatusTempatUsaha() {
		return statusTempatUsaha;
	}

	public void setStatusTempatUsaha(String statusTempatUsaha) {
		this.statusTempatUsaha = statusTempatUsaha;
	}

	public String getNpwpPerusahaan() {
		return npwpPerusahaan;
	}

	public void setNpwpPerusahaan(String npwpPerusahaan) {
		this.npwpPerusahaan = npwpPerusahaan;
	}

	public String getJenisKegiatanPerusahaan() {
		return jenisKegiatanPerusahaan;
	}

	public void setJenisKegiatanPerusahaan(String jenisKegiatanPerusahaan) {
		this.jenisKegiatanPerusahaan = jenisKegiatanPerusahaan;
	}

	public String getNamaNotaris() {
		return namaNotaris;
	}

	public void setNamaNotaris(String namaNotaris) {
		this.namaNotaris = namaNotaris;
	}

	public String getNomorAktaNotaris() {
		return nomorAktaNotaris;
	}

	public void setNomorAktaNotaris(String nomorAktaNotaris) {
		this.nomorAktaNotaris = nomorAktaNotaris;
	}

	public String getWilayahKerjaNotaris() {
		return wilayahKerjaNotaris;
	}

	public void setWilayahKerjaNotaris(String wilayahKerjaNotaris) {
		this.wilayahKerjaNotaris = wilayahKerjaNotaris;
	}

	public String getAlamatNotaris() {
		return alamatNotaris;
	}

	public void setAlamatNotaris(String alamatNotaris) {
		this.alamatNotaris = alamatNotaris;
	}

	public String getTanggalPengesahan() {
		return tanggalPengesahan;
	}

	public void setTanggalPengesahan(String tanggalPengesahan) {
		this.tanggalPengesahan = tanggalPengesahan;
	}

	public String getDataAktaPendiriUsaha() {
		return dataAktaPendiriUsaha;
	}

	public void setDataAktaPendiriUsaha(String dataAktaPendiriUsaha) {
		this.dataAktaPendiriUsaha = dataAktaPendiriUsaha;
	}

	public String getIzinLain() {
		return izinLain;
	}

	public void setIzinLain(String izinLain) {
		this.izinLain = izinLain;
	}

	public String getModalUsaha() {
		return modalUsaha;
	}

	public void setModalUsaha(String modalUsaha) {
		this.modalUsaha = modalUsaha;
	}

	public String getNamaPengurus() {
		return namaPengurus;
	}

	public void setNamaPengurus(String namaPengurus) {
		this.namaPengurus = namaPengurus;
	}

	public String getJabatanPengurus() {
		return jabatanPengurus;
	}

	public void setJabatanPengurus(String jabatanPengurus) {
		this.jabatanPengurus = jabatanPengurus;
	}

	public String getJenisKelaminPengurus() {
		return jenisKelaminPengurus;
	}

	public void setJenisKelaminPengurus(String jenisKelaminPengurus) {
		this.jenisKelaminPengurus = jenisKelaminPengurus;
	}

	public String getNomorTeleponPengurus() {
		return nomorTeleponPengurus;
	}

	public void setNomorTeleponPengurus(String nomorTeleponPengurus) {
		this.nomorTeleponPengurus = nomorTeleponPengurus;
	}

	public String getAlamatPengurus() {
		return alamatPengurus;
	}

	public void setAlamatPengurus(String alamatPengurus) {
		this.alamatPengurus = alamatPengurus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
