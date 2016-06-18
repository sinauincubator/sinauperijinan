package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.model.MasterPemohon;

@Repository
public class MasterPemohonDAOImpl implements MasterPemohonDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void addPemohon(MasterPemohon pemohon) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(pemohon);
	}

	public void updatePemohon(MasterPemohon pemohon) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(pemohon);
	}

	@SuppressWarnings("unchecked")
	public List<MasterPemohon> listPemohons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<MasterPemohon> pemohonList = session.createQuery("from MasterPemohon").list();
		return pemohonList;
	}

}
