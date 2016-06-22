package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.Privasi;

public interface PrivasiDAO extends GenericRepositoryDAO<Privasi>  {

	public List<Privasi> getAllPrivasi(int curentIndex) throws Exception;
	public Privasi getById(Integer idPrivasi) throws Exception;
	public int getRowCount() throws Exception;

}
