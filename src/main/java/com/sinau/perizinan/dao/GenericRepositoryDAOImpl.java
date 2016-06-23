package com.sinau.perizinan.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenericRepositoryDAOImpl<T> implements GenericRepositoryDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(T object) throws Exception {
		sessionFactory.getCurrentSession().save(object);
	}

	public void update(T object) throws Exception {
		sessionFactory.getCurrentSession().update(object);
	}

	public Long addAndReturnPrimaryKeyAsLong(T object) throws Exception {
		return (Long) sessionFactory.getCurrentSession().save(object);
	}

	public Integer addAndReturnPrimaryKeyAsInteger(T object) throws Exception {
		return (Integer) sessionFactory.getCurrentSession().save(object);
	}

}
