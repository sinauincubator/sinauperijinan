package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.common.PerijinanConstantsDefinitions;
import com.sinau.perizinan.model.MasterIzin;

@Repository
public class MasterIzinDAOImpl extends GenericRepositoryDAOImpl<MasterIzin>implements MasterIzinDAO{

	private final String HQL_COUNT_ALL = "select count(m.id) from MasterIzin m order by m.id";
	private final String HQL_SELECT_MASTER_IZIN_ALL =  "from MasterIzin";

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<MasterIzin> getAllMasterIzin(int curentIndex) throws Exception {
		int index = 0;
		if(curentIndex > 1){
			index = curentIndex -1;
		}

		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(HQL_SELECT_MASTER_IZIN_ALL);
		query.setFirstResult(index * PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		query.setMaxResults(PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);

		List<MasterIzin> masterIzinResultList = query.list();

		return masterIzinResultList;
	}

	public MasterIzin getById(Integer kodeIzin) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		MasterIzin masterIzinResult = (MasterIzin) session.get(MasterIzin.class, kodeIzin);

		return masterIzinResult;
	}

	public int getRowCount() throws Exception {
		int result = 0;

		Session session = this.sessionFactory.getCurrentSession();
		Long countResult = (Long) session.createQuery(HQL_COUNT_ALL).uniqueResult();
		if(countResult != null){
			result = countResult.intValue();
		}
		return result;
	}

}
