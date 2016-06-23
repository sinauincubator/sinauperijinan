package com.sinau.perizinan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.GenericRepositoryDAO;

public class GenericServiceImpl<T> implements GenericService<T> {

	@Autowired
	private GenericRepositoryDAO<T> repositoryDAO;
	
	@Transactional
	public void add(T object) throws Exception {
		this.repositoryDAO.add(object);
	}

	@Transactional
	public void update(T object) throws Exception {
		this.repositoryDAO.update(object);
	}

	@Transactional
	public Long addAndReturnPrimaryKeyAsLong(T object) throws Exception {
		return this.repositoryDAO.addAndReturnPrimaryKeyAsLong(object);
	}

	@Transactional
	public Integer addAndReturnPrimaryKeyAsInteger(T object) throws Exception {
		return this.repositoryDAO.addAndReturnPrimaryKeyAsInteger(object);
	}

}
