package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.MasterKbli;

public interface MasterKbliDAO extends GenericRepositoryDAO<MasterKbli> {

	public MasterKbli findByExample(MasterKbli masterKbli);
	public List<MasterKbli> getAllMasterKbli();
	
}
