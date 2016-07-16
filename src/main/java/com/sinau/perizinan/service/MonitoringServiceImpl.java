package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.dao.MonitoringDAO;
import com.sinau.perizinan.form.MonitoringForm;
import com.sinau.perizinan.model.Monitoring;

@Service
public class MonitoringServiceImpl extends GenericServiceImpl<Monitoring> implements MonitoringService {
	
	private final String LAPORAN_MONITORING_NOT_FOUND = "Laporan Monitoring tidak ditemukan."; 

	@Autowired
	private MonitoringDAO monitoringDAO;

	@Transactional
	public PagingRecord<MonitoringForm> getAllMonitoring(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception {
		List<Monitoring> results = this.monitoringDAO.getAllMonitoring(currentIndex);
		
		List<MonitoringForm> formResults = new ArrayList<MonitoringForm>();
		for(Monitoring monitoring : results) {
			MonitoringForm MonitoringForm = new MonitoringForm();
			BeanUtils.copyProperties(MonitoringForm, monitoring);
			formResults.add(MonitoringForm);
		}
		
		int totalRecords = this.monitoringDAO.getRowCount();
		
		PagingRecord<MonitoringForm> pageList = new PagingRecord<MonitoringForm>(formResults, totalRecords, currentIndex);
		
		return pageList;
	}

	@Transactional
	public MonitoringForm getById(Integer id) throws Exception {
		Monitoring monitoringResult = this.monitoringDAO.getById(id); 
		MonitoringForm monitoringFormResult = new MonitoringForm();
		
		if(monitoringResult != null) {
			BeanUtils.copyProperties(monitoringFormResult, monitoringResult);
		} else {
			throw new Exception(LAPORAN_MONITORING_NOT_FOUND);
		}
		
		return monitoringFormResult;
	}

}
