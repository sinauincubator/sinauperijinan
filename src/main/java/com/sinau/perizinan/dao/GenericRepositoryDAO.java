package com.sinau.perizinan.dao;

public interface GenericRepositoryDAO<T> {

	public void add(T object);
	public void update(T object);
	
}
