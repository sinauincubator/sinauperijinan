package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.dao.MasterIzinDAO;
import com.sinau.perizinan.form.MasterIzinForm;
import com.sinau.perizinan.model.MasterIzin;

@Service
public class MasterIzinServiceImpl extends GenericServiceImpl<MasterIzin> implements MasterIzinService{

	private final String MASTER_IZIN_NOT_FOUND = "Master izin tidak ditemukan.";

	@Autowired
	private MasterIzinDAO masterIzinDao;

	@Transactional
	public PagingRecord<MasterIzinForm> getAllMasterIzin(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception {
		List<MasterIzin> results = this.masterIzinDao.getAllMasterIzin(currentIndex);

		List<MasterIzinForm>  formResults = new ArrayList<MasterIzinForm>();
		for(MasterIzin masterIzin : results){
			MasterIzinForm masterIzinForm = new MasterIzinForm();
			BeanUtils.copyProperties(masterIzinForm, masterIzin);
			formResults.add(masterIzinForm);
		}

		int totalRecords = this.masterIzinDao.getRowCount();

		PagingRecord<MasterIzinForm> pageList = new PagingRecord<MasterIzinForm>(formResults, totalRecords, currentIndex);

		return pageList;
	}

	@Transactional
	public MasterIzinForm getById(Integer kodeIzin) throws Exception {
		MasterIzin masterIzinResult = this.masterIzinDao.getById(kodeIzin);
		MasterIzinForm masterIzinFormResult = new MasterIzinForm();

		if(masterIzinResult != null){
			BeanUtils.copyProperties(masterIzinFormResult, masterIzinResult);
		} else {
			throw new Exception(MASTER_IZIN_NOT_FOUND);
		}

		return masterIzinFormResult;
	}

}
