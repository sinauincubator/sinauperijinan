package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.Privasi;

public interface PrivasiDAO extends GenericRepositoryDAO<Privasi>  {

	public Privasi findByExample(Privasi privasi);
	public List<Privasi> getAllPrivasi();

}
