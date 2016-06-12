package com.sinau.perizinan.service;

import java.util.List;

import com.sinau.perizinan.model.Privasi;

public interface PrivasiService {

	public void addPrivasi(Privasi privasi);
	public void updatePrivasi(Privasi privasi);
	public List<Privasi> listPrivasis();

}
