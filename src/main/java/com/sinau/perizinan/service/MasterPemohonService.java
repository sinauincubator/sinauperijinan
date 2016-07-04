package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.form.MasterPemohonForm;
import com.sinau.perizinan.model.MasterPemohon;

public interface MasterPemohonService extends GenericService<MasterPemohon>{

	public PagingRecord<MasterPemohonForm> getAllMasterPemohon(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception;
	public MasterPemohonForm getById(Integer id) throws Exception;

}