package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.form.PrivasiForm;
import com.sinau.perizinan.model.Privasi;

public interface PrivasiService extends GenericService<Privasi> {

	public PagingRecord<PrivasiForm> getAllPrivasi(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception;
	public PrivasiForm getById(Integer id) throws Exception;
}
