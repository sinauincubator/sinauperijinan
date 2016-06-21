package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.model.Privasi;

@Repository
public class PrivasiDAOImpl extends GenericRepositoryDAOImpl<Privasi>implements PrivasiDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Privasi> getAllPrivasi() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Privasi> privasiList = session.createQuery("from Privasi").list();
		return privasiList;
	}

	public Privasi findByExample(Privasi privasi) {
		Example example = Example.create(privasi);
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Privasi.class).add(example);

		Privasi privasiResult = new Privasi();

		if(criteria != null && !criteria.list().isEmpty()){
			privasiResult = (Privasi) criteria.list().get(0);
		}

		return privasiResult;
	}

}
