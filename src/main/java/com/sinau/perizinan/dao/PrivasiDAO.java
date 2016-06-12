package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.Privasi;

public interface PrivasiDAO {

	public void addPrivasi(Privasi privasi);
	public void updatePrivasi(Privasi privasi);
	public List<Privasi> listPrivasis();
}
