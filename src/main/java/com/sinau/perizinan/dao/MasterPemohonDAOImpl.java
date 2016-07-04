package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.common.PerijinanConstantsDefinitions;
import com.sinau.perizinan.model.MasterPemohon;

@Repository
public class MasterPemohonDAOImpl extends GenericRepositoryDAOImpl<MasterPemohon> implements MasterPemohonDAO{

	private final String HQL_COUNT_ALL = "select count(m.id) from MasterPemohon m order by m.id";
	private final String HQL_SELECT_MASTER_PEMOHON_ALL =  "from MasterPemohon";

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<MasterPemohon> getAllMasterPemohon(int currentIndex) throws Exception {
		int index = 0;
		if(currentIndex > 1) {
			index = currentIndex - 1;
		}

		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(HQL_SELECT_MASTER_PEMOHON_ALL);
		query.setFirstResult(index * PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		query.setMaxResults(PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);

		List<MasterPemohon> masterPemohonResultList = query.list();

		return masterPemohonResultList;
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

	public MasterPemohon getById(Integer idPemohon) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		MasterPemohon masterPemohonResult = (MasterPemohon) session.get(MasterPemohon.class, idPemohon);

		return masterPemohonResult;
	}

}
