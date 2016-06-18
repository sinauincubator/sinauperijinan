package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.MasterPemohon;

public interface MasterPemohonDAO {

	public void addPemohon(MasterPemohon pemohon);
	public void updatePemohon(MasterPemohon pemohon);
	public List<MasterPemohon> listPemohons();
}
