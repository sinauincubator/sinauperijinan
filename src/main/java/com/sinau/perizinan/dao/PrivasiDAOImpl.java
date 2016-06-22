package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.common.PerijinanConstantsDefinitions;
import com.sinau.perizinan.model.Privasi;

@Repository
public class PrivasiDAOImpl extends GenericRepositoryDAOImpl<Privasi>implements PrivasiDAO {

	private final String HQL_COUNT_ALL = "select count(p.id) from Privasi p order by p.id";
	private final String HQL_SELECT_PRIVASI_ALL =  "from Privasi";

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Privasi> getAllPrivasi(int curentIndex) throws Exception {
		int index = 0;
		if(curentIndex > 1){
			index = curentIndex -1;
		}

		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(HQL_SELECT_PRIVASI_ALL);
		query.setFirstResult(index * PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		query.setMaxResults(PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);

		List<Privasi> privasiResultList = query.list();

		return privasiResultList;
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

	public Privasi getById(Integer idPrivasi) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		Privasi privasiResult = (Privasi) session.get(Privasi.class, idPrivasi);

		return privasiResult;
	}
}
