package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.MasterKbli;

public interface MasterKbliDAO {

	public void addMasterKbli(MasterKbli masterKbli);
	public void updateMasterKbli(MasterKbli masterKbli);
	public MasterKbli findByExample(MasterKbli masterKbli);
	public List<MasterKbli> listMasterKblis();
	
}
