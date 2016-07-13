package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.form.MasterIzinForm;
import com.sinau.perizinan.model.MasterIzin;

public interface MasterIzinService extends GenericService<MasterIzin> {

	public PagingRecord<MasterIzinForm> getAllMasterIzin(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception;
	public MasterIzinForm getById(Integer kodeIzin) throws Exception;
}
