package com.sinau.perizinan.service;

import java.util.List;

import com.sinau.perizinan.model.MasterKbli;

public interface MasterKbliService {

	public void addMasterKbli(MasterKbli masterKbli);
	public void updateMasterKbli(MasterKbli masterKbli);
	public MasterKbli findByExample(MasterKbli masterKbli);
	public List<MasterKbli> listMasterKblis();
	
}
