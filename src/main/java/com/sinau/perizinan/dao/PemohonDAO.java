package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.Pemohon;

public interface PemohonDAO {

	public void addPemohon(Pemohon pemohon);
	public void updatePemohon(Pemohon pemohon);
	public List<Pemohon> listPemohons();
}
