package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.model.Pemohon;

@Repository
public class PemohonDAOImpl implements PemohonDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void addPemohon(Pemohon pemohon) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(pemohon);
	}

	public void updatePemohon(Pemohon pemohon) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(pemohon);
	}

	@SuppressWarnings("unchecked")
	public List<Pemohon> listPemohons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Pemohon> pemohonList = session.createQuery("from Pemohon").list();
		return pemohonList;
	}

}
