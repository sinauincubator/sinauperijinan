package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.form.PermohonanIzinForm;
import com.sinau.perizinan.model.PermohonanIzin;

public interface PermohonanIzinService extends GenericService<PermohonanIzin> {

	public PagingRecord<PermohonanIzinForm> getAllPermohonanIzin(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception;
	public PermohonanIzinForm getById(Integer id) throws Exception;
}
