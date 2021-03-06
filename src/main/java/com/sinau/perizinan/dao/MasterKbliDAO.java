package com.sinau.perizinan.dao;

import java.util.List;

import com.sinau.perizinan.model.MasterKbli;

public interface MasterKbliDAO extends GenericRepositoryDAO<MasterKbli> {

	public List<MasterKbli> getAllMasterKbli(int currentIndex) throws Exception;
	public MasterKbli getById(Integer id) throws Exception;
	public int getRowCount() throws Exception;
	
}
