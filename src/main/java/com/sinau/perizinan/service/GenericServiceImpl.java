package com.sinau.perizinan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.dao.GenericRepositoryDAO;

public class GenericServiceImpl<T> implements GenericService<T> {

	@Autowired
	private GenericRepositoryDAO<T> repositoryDAO;
	
	@Transactional
	public void add(T object) {
		this.repositoryDAO.add(object);
	}

	@Transactional
	public void update(T object) {
		this.repositoryDAO.update(object);
	}

}
