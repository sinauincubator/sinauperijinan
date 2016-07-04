package com.sinau.perizinan.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.dao.MasterPemohonDAO;
import com.sinau.perizinan.form.MasterPemohonForm;
import com.sinau.perizinan.model.MasterPemohon;

@Service
public class MasterPemohonServiceImpl extends GenericServiceImpl<MasterPemohon> implements MasterPemohonService{

	private final String MASTER_PEMOHON_NOT_FOUND = "Master Pemohon tidak ditemukan.";

	@Autowired
	private MasterPemohonDAO masterPemohonDAO;

	@Transactional
	public PagingRecord<MasterPemohonForm> getAllMasterPemohon(int currentIndex) throws IllegalAccessException, InvocationTargetException, Exception {
		List<MasterPemohon> results = this.masterPemohonDAO.getAllMasterPemohon(currentIndex);

		List<MasterPemohonForm> formResults = new ArrayList<MasterPemohonForm>();
		for(MasterPemohon masterPemohon : results){
			MasterPemohonForm masterPemohonForm = new MasterPemohonForm();
			BeanUtils.copyProperties(masterPemohonForm, masterPemohon);
			formResults.add(masterPemohonForm);
		}

		int totalRecords = this.masterPemohonDAO.getRowCount();

		PagingRecord<MasterPemohonForm> pageList = new PagingRecord<MasterPemohonForm>(formResults, totalRecords, currentIndex);

		return pageList;
	}

	@Transactional
	public MasterPemohonForm getById(Integer idPemohon) throws Exception {
		MasterPemohon masterPemohonResult = this.masterPemohonDAO.getById(idPemohon);
		MasterPemohonForm masterPemohonFormResult = new MasterPemohonForm();

		if(masterPemohonResult != null){
			BeanUtils.copyProperties(masterPemohonFormResult, masterPemohonResult);
		} else {
			throw new Exception(MASTER_PEMOHON_NOT_FOUND);
		}

		return masterPemohonFormResult;
	}

}
