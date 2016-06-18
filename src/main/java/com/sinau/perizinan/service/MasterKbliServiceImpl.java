package com.sinau.perizinan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.MasterKbliDAO;
import com.sinau.perizinan.model.MasterKbli;

@Service
public class MasterKbliServiceImpl implements MasterKbliService {

	@Autowired
	private MasterKbliDAO masterKbliDAO;

	@Transactional
	public void addMasterKbli(MasterKbli masterKbli) {
		this.masterKbliDAO.addMasterKbli(masterKbli);
	}

	@Transactional
	public void updateMasterKbli(MasterKbli masterKbli) {
		this.masterKbliDAO.updateMasterKbli(masterKbli);
	}

	@Transactional
	public List<MasterKbli> listMasterKblis() {
		return this.masterKbliDAO.listMasterKblis();
	}

	@Transactional
	public MasterKbli findByExample(MasterKbli masterKbli) {		
		return this.masterKbliDAO.findByExample(masterKbli);
	}

}
