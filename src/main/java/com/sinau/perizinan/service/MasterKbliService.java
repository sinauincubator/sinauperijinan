package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.form.MasterKbliForm;
import com.sinau.perizinan.model.MasterKbli;

public interface MasterKbliService extends GenericService<MasterKbli> {

	public PagingRecord<MasterKbliForm> getAllMasterKbli(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception;
	public MasterKbliForm getById(Integer id) throws Exception;
	
}
