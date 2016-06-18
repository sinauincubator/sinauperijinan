package com.sinau.perizinan.service;

import java.util.List;

import com.sinau.perizinan.model.MasterKbli;

public interface MasterKbliService extends GenericService<MasterKbli> {

	public MasterKbli findByExample(MasterKbli masterKbli);
	public List<MasterKbli> getAllMasterKbli();
	
}
