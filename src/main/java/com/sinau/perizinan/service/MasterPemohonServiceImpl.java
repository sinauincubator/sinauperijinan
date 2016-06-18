package com.sinau.perizinan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.MasterPemohonDAO;
import com.sinau.perizinan.model.MasterPemohon;

@Service
public class MasterPemohonServiceImpl implements MasterPemohonService{

	@Autowired
	private MasterPemohonDAO pemohonDAO;

	@Transactional
	public void addPemohon(MasterPemohon pemohon) {
		this.pemohonDAO.addPemohon(pemohon);
	}

	@Transactional
	public void updatePemohon(MasterPemohon pemohon) {
		this.pemohonDAO.updatePemohon(pemohon);
	}

	@Transactional
	public List<MasterPemohon> listPemohons() {
		return this.pemohonDAO.listPemohons();
	}


}
