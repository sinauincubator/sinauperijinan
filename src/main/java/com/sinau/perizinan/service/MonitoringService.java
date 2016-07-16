package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.form.MonitoringForm;
import com.sinau.perizinan.model.Monitoring;

public interface MonitoringService extends GenericService<Monitoring> {

	public PagingRecord<MonitoringForm> getAllMonitoring(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception;
	public MonitoringForm getById(Integer id) throws Exception;
	

}
