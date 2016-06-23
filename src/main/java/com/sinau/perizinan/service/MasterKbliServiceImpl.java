package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.dao.MasterKbliDAO;
import com.sinau.perizinan.form.MasterKbliForm;
import com.sinau.perizinan.model.MasterKbli;

@Service
public class MasterKbliServiceImpl extends GenericServiceImpl<MasterKbli> implements MasterKbliService {
	
	private final String MASTER_KBLI_NOT_FOUND = "Master KBLI tidak ditemukan."; 

	@Autowired
	private MasterKbliDAO masterKbliDAO;

	@Transactional
	public PagingRecord<MasterKbliForm> getAllMasterKbli(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception {
		List<MasterKbli> results = this.masterKbliDAO.getAllMasterKbli(currentIndex);
		
		List<MasterKbliForm> formResults = new ArrayList<MasterKbliForm>();
		for(MasterKbli masterKbli : results) {
			MasterKbliForm masterKbliForm = new MasterKbliForm();
			BeanUtils.copyProperties(masterKbliForm, masterKbli);
			formResults.add(masterKbliForm);
		}
		
		int totalRecords = this.masterKbliDAO.getRowCount();
		
		PagingRecord<MasterKbliForm> pageList = new PagingRecord<MasterKbliForm>(formResults, totalRecords, currentIndex);
		
		return pageList;
	}

	@Transactional
	public MasterKbliForm getById(Integer id) throws Exception {
		MasterKbli masterKbliResult = this.masterKbliDAO.getById(id); 
		MasterKbliForm masterKbliFormResult = new MasterKbliForm();
		
		if(masterKbliResult != null) {
			BeanUtils.copyProperties(masterKbliFormResult, masterKbliResult);
		} else {
			throw new Exception(MASTER_KBLI_NOT_FOUND);
		}
		
		return masterKbliFormResult;
	}

}
