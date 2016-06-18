package com.sinau.perizinan.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenericRepositoryDAOImpl<T> implements GenericRepositoryDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(T object) {
		sessionFactory.getCurrentSession().save(object);
	}

	public void update(T object) {
		sessionFactory.getCurrentSession().update(object);
	}

}
