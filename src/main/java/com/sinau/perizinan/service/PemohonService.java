package com.sinau.perizinan.service;

import java.util.List;

import com.sinau.perizinan.model.Pemohon;

public interface PemohonService {

	public void addPemohon(Pemohon pemohon);
	public void updatePemohon(Pemohon pemohon);
	public List<Pemohon> listPemohons();
}
