package com.sinau.perizinan.controller;

import java.lang.reflect.InvocationTargetException;
import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.common.ScopeVariableAssigner;
import com.sinau.perizinan.form.MasterPemohonForm;
import com.sinau.perizinan.model.MasterPemohon;
import com.sinau.perizinan.service.MasterPemohonService;

@Controller
public class MasterPemohonController extends ScopeVariableAssigner{

	private final String MASTER_PEMOHON_ADD_SUCCESS_MESSAGE = "Master Pemohon telah berhasil ditambahkan.";
	private final String MASTER_PEMOHON_EDIT_SUCCESS_MESSAGE = "Master Pemohon telah berhasil diubah.";

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private MasterPemohonService masterPemohonService;

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getView(@RequestParam(value="page", required=false) Integer currentIndex, Model model) {
    	logger.info("Received request to show all master pemohon");

    	String resultPage = PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

		PagingRecord<MasterPemohonForm> pageList = null;
		try {
			if(currentIndex == null) {
				currentIndex = 0;
			}
			pageList = this.masterPemohonService.getAllMasterPemohon(currentIndex);
		} catch (IllegalAccessException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("pagingRecord", pageList);

			assignMasterPemohonScopeVariable(model);
			assignUserMessage(model, status, message);
		}

		return resultPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("masterPemohonAttribute", new MasterPemohonForm());
    	assignMasterPemohonScopeVariable(model);

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("masterPemohonAttribute") MasterPemohonForm masterPemohonForm, Model model) {
		logger.info("Received request to add new master pemohon");

		String resultPage = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
		String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = MASTER_PEMOHON_ADD_SUCCESS_MESSAGE;

		MasterPemohon masterPemohon = new MasterPemohon();
		try{
			BeanUtils.copyProperties(masterPemohon, masterPemohonForm);
			Integer pk = this.masterPemohonService.addAndReturnPrimaryKeyAsInteger(masterPemohon);
			masterPemohonForm.setIdPemohon(pk);

			resultPage = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
		} catch (IllegalAccessException e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		}finally {
			model.addAttribute("masterPemohonAttribute", masterPemohonForm);

			assignMasterPemohonScopeVariable(model);
			assignUserMessage(model, status, message);
		}

   		return resultPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="idPemohon", required=true) Integer idPemohon, Model model) {
    	logger.info("Received request to show edit page");

    	String resultPage = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

		MasterPemohonForm masterPemohonForm = new MasterPemohonForm();
		try{
			masterPemohonForm = this.masterPemohonService.getById(idPemohon);
		} catch (Exception e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
	    	model.addAttribute("masterPemohonAttribute", masterPemohonForm);

	    	assignMasterPemohonScopeVariable(model);
	    	assignUserMessage(model, status, message);
		}

    	return resultPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("masterPemohonAttribute") MasterPemohonForm masterPemohonForm, Model model) {
    	logger.info("Received request to update pemohon");

    	String resultPage = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
    	String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = MASTER_PEMOHON_EDIT_SUCCESS_MESSAGE;

		MasterPemohon masterPemohon = new MasterPemohon();
		try {
			BeanUtils.copyProperties(masterPemohon, masterPemohonForm);
			this.masterPemohonService.update(masterPemohon);
		} catch (IllegalAccessException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("masterPemohonAttribute", masterPemohonForm);

			assignMasterPemohonScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}
}
