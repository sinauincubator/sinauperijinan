package com.sinau.perizinan.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sinau.perizinan.common.PerijinanConstantsDefinitions;
import com.sinau.perizinan.model.PermohonanIzin;

@Repository
public class PermohonanIzinDAOImpl extends GenericRepositoryDAOImpl<PermohonanIzin>implements PermohonanIzinDAO {

	private final String HQL_COUNT_ALL = "select count(p.id) from PermohonanIzin p order by p.id";
	private final String HQL_SELECT_PERMOHONAN_IZIN_ALL =  "from PermohonanIzin";

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<PermohonanIzin> getAllPermohonanIzin(int curentIndex) throws Exception {
		int index = 0;
		if(curentIndex > 1){
			index = curentIndex -1;
		}

		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(HQL_SELECT_PERMOHONAN_IZIN_ALL);
		query.setFirstResult(index * PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);
		query.setMaxResults(PerijinanConstantsDefinitions.PAGINATION_PAGE_SIZE);

		List<PermohonanIzin> PermohonanIzinResultList = query.list();

		return PermohonanIzinResultList;
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

	public PermohonanIzin getById(Integer idPemohon) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		PermohonanIzin PermohonanIzinResult = (PermohonanIzin) session.get(PermohonanIzin.class, idPemohon);

		return PermohonanIzinResult;
	}
}
