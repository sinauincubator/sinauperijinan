package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.MasterIzin;

public interface MasterIzinDAO extends GenericRepositoryDAO<MasterIzin>{

	public List<MasterIzin> getAllMasterIzin(int curentIndex) throws Exception;
	public MasterIzin getById(Integer kodeIzin) throws Exception;
	public int getRowCount() throws Exception;
}
