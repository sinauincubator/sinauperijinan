package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.dao.PrivasiDAO;
import com.sinau.perizinan.form.PrivasiForm;
import com.sinau.perizinan.model.Privasi;

@Service
public class PrivasiServiceImpl extends GenericServiceImpl<Privasi> implements PrivasiService{

	@Autowired
	private PrivasiDAO privasiDAO;

	@Transactional
	public PagingRecord<PrivasiForm> getAllPrivasi(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception {
		List<Privasi> results = this.privasiDAO.getAllPrivasi(currentIndex);

		List<PrivasiForm>  formResults = new ArrayList<PrivasiForm>();
		for(Privasi privasi : results){
			PrivasiForm privasiForm = new PrivasiForm();
			BeanUtils.copyProperties(privasiForm, privasi);
			formResults.add(privasiForm);
		}

		int totalRecords = this.privasiDAO.getRowCount();

		PagingRecord<PrivasiForm> pageList = new PagingRecord<PrivasiForm>(formResults, totalRecords, currentIndex);

		return pageList;
	}

	@Transactional
	public PrivasiForm getById(Integer idPrivasi) throws Exception {
		Privasi privasiResult = this.privasiDAO.getById(idPrivasi);
		PrivasiForm privasiFormResult = new PrivasiForm();

		if(privasiResult != null){
			BeanUtils.copyProperties(privasiFormResult, privasiResult);
		}

		return privasiFormResult;
	}




}
