package com.sinau.perizinan.dao;

import java.util.List;
import com.sinau.perizinan.model.Monitoring;

public interface MonitoringDAO extends GenericRepositoryDAO<Monitoring> {

	public List<Monitoring> getAllMonitoring(int currentIndex) throws Exception;
	public Monitoring getById(Integer id) throws Exception;
	public int getRowCount() throws Exception;
	

}
