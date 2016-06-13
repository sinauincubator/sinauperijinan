package com.sinau.perizinan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.PemohonDAO;
import com.sinau.perizinan.model.Pemohon;

@Service
public class PemohonServiceImpl implements PemohonService{

	@Autowired
	private PemohonDAO pemohonDAO;

	@Transactional
	public void addPemohon(Pemohon pemohon) {
		this.pemohonDAO.addPemohon(pemohon);
	}

	@Transactional
	public void updatePemohon(Pemohon pemohon) {
		this.pemohonDAO.updatePemohon(pemohon);
	}

	@Transactional
	public List<Pemohon> listPemohons() {
		return this.pemohonDAO.listPemohons();
	}


}
