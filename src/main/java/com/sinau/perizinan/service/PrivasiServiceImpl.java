package com.sinau.perizinan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.PrivasiDAO;
import com.sinau.perizinan.model.Privasi;

@Service
public class PrivasiServiceImpl extends GenericServiceImpl<Privasi> implements PrivasiService{

	@Autowired
	private PrivasiDAO privasiDAO;

	@Transactional
	public List<Privasi> getAllPrivasi() {
		return this.privasiDAO.getAllPrivasi();
	}

	@Transactional
	public Privasi findByExample(Privasi privasi) {
		return this.privasiDAO.findByExample(privasi);
	}
}
