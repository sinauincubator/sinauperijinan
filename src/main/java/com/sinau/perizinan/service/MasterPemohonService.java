package com.sinau.perizinan.service;

import java.util.List;

import com.sinau.perizinan.model.MasterPemohon;

public interface MasterPemohonService {

	public void addPemohon(MasterPemohon pemohon);
	public void updatePemohon(MasterPemohon pemohon);
	public List<MasterPemohon> listPemohons();
}
