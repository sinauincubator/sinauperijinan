package com.sinau.perizinan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.MasterKbliDAO;
import com.sinau.perizinan.model.MasterKbli;

@Service
public class MasterKbliServiceImpl extends GenericServiceImpl<MasterKbli> implements MasterKbliService {

	@Autowired
	private MasterKbliDAO masterKbliDAO;

	@Transactional
	public List<MasterKbli> getAllMasterKbli() {
		return this.masterKbliDAO.getAllMasterKbli();
	}

	@Transactional
	public MasterKbli findByExample(MasterKbli masterKbli) {		
		return this.masterKbliDAO.findByExample(masterKbli);
	}

}
