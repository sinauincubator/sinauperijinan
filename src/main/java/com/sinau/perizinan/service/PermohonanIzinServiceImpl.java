package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.dao.PermohonanIzinDAO;
import com.sinau.perizinan.form.PermohonanIzinForm;
import com.sinau.perizinan.model.PermohonanIzin;

@Service
public class PermohonanIzinServiceImpl extends GenericServiceImpl<PermohonanIzin> implements PermohonanIzinService{

	private final String PERMOHONAN_IZIN_NOT_FOUND = "PermohonanIzin tidak ditemukan.";


	@Autowired
	private PermohonanIzinDAO permohonanIzinDAO;

	@Transactional
	public PagingRecord<PermohonanIzinForm> getAllPermohonanIzin(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception {
		List<PermohonanIzin> results = this.permohonanIzinDAO.getAllPermohonanIzin(currentIndex);

		List<PermohonanIzinForm>  formResults = new ArrayList<PermohonanIzinForm>();
		for(PermohonanIzin PermohonanIzin : results){
			PermohonanIzinForm PermohonanIzinForm = new PermohonanIzinForm();
			BeanUtils.copyProperties(PermohonanIzinForm, PermohonanIzin);
			formResults.add(PermohonanIzinForm);
		}

		int totalRecords = this.permohonanIzinDAO.getRowCount();

		PagingRecord<PermohonanIzinForm> pageList = new PagingRecord<PermohonanIzinForm>(formResults, totalRecords, currentIndex);

		return pageList;
	}

	@Transactional
	public PermohonanIzinForm getById(Integer idPemohon) throws Exception {
		PermohonanIzin PermohonanIzinResult = this.permohonanIzinDAO.getById(idPemohon);
		PermohonanIzinForm PermohonanIzinFormResult = new PermohonanIzinForm();

		if(PermohonanIzinResult != null){
			BeanUtils.copyProperties(PermohonanIzinFormResult, PermohonanIzinResult);
		} else {
			throw new Exception(PERMOHONAN_IZIN_NOT_FOUND);
		}

		return PermohonanIzinFormResult;
	}




}
