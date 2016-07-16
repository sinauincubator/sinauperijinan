package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.common.PerijinanConstantsDefinitions;
import com.sinau.perizinan.model.Monitoring;

@Repository
public class MonitoringDAOImpl extends GenericRepositoryDAOImpl<Monitoring> implements MonitoringDAO {

	private final String HQL_COUNT_ALL = "select count(m.id) from Monitoring m order by m.id";
	private final String HQL_SELECT_LAPORAN_MONITORING_ALL =  "from Monitoring";
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Monitoring> getAllMonitoring(int currentIndex) throws Exception {
		int index = 0;
		if(currentIndex > 1) {
			index = currentIndex - 1;
		}
		
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(HQL_SELECT_LAPORAN_MONITORING_ALL);
		query.setFirstResult(index * PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		query.setMaxResults(PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		
		List<Monitoring> MonitoringResultList = query.list();
		
		return MonitoringResultList;
	}

	public int getRowCount() throws Exception {
		int result = 0;
		
		Session session = this.sessionFactory.getCurrentSession();
		Long countResult = (Long) session.createQuery(HQL_COUNT_ALL).uniqueResult();
		if(countResult != null) {
			result = countResult.intValue(); 
		}
		
		return result;
	}

	public Monitoring getById(Integer id) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		Monitoring MonitoringResult = (Monitoring) session.get(Monitoring.class, id);
		
		return MonitoringResult;
	}

}
