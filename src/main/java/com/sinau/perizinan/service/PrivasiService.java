package com.sinau.perizinan.service;

import java.util.List;

import com.sinau.perizinan.model.Privasi;

public interface PrivasiService extends GenericService<Privasi> {

	public Privasi findByExample(Privasi privasi);
	public List<Privasi> getAllPrivasi();

}
