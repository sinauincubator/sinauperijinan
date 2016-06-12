package com.sinau.perizinan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinau.perizinan.model.MasterKbli;

@Repository
public class MasterKbliDAOImpl implements MasterKbliDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addMasterKbli(MasterKbli masterKbli) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(masterKbli);
	}

	public void updateMasterKbli(MasterKbli masterKbli) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(masterKbli);
	}

	@SuppressWarnings("unchecked")
	public List<MasterKbli> listMasterKblis() {
		Session session = this.sessionFactory.getCurrentSession();
		List<MasterKbli> masterKbliList = session.createQuery("from MasterKbli").list();
		
		return masterKbliList;
	}

}
