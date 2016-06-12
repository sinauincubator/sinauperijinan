package com.sinau.perizinan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.PrivasiDAO;
import com.sinau.perizinan.model.Privasi;

@Service
public class PrivasiServiceImpl implements PrivasiService{

	@Autowired
	private PrivasiDAO privasiDAO;

	@Transactional
	public void addPrivasi(Privasi privasi) {
		this.privasiDAO.addPrivasi(privasi);
	}

	@Transactional
	public void updatePrivasi(Privasi privasi) {
		this.privasiDAO.updatePrivasi(privasi);
	}

	@Transactional
	public List<Privasi> listPrivasis() {
		return this.privasiDAO.listPrivasis();
	}


}
