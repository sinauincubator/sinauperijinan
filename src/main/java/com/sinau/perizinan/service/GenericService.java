package com.sinau.perizinan.service;

public interface GenericService<T> {

	public void add(T object) throws Exception;
	public void update(T object) throws Exception;
	public Long addAndReturnPrimaryKeyAsLong(T object) throws Exception;
	public Integer addAndReturnPrimaryKeyAsInteger(T object) throws Exception;
	
}
