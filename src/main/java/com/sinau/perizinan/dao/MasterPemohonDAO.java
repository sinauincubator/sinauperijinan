package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.MasterPemohon;

public interface MasterPemohonDAO extends GenericRepositoryDAO<MasterPemohon>{
	public List<MasterPemohon> getAllMasterPemohon(int currentIndex) throws Exception;
	public MasterPemohon getById(Integer idPemohon) throws Exception;
	public int getRowCount() throws Exception;

}
