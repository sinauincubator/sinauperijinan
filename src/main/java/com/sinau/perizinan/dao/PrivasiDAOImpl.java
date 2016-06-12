package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.model.Privasi;

@Repository
public class PrivasiDAOImpl implements PrivasiDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addPrivasi(Privasi privasi) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(privasi);

	}

	public void updatePrivasi(Privasi privasi) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(privasi);
	}

	@SuppressWarnings("unchecked")
	public List<Privasi> listPrivasis() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Privasi> privasiList = session.createQuery("from Privasi").list();
		return privasiList;
	}

}
