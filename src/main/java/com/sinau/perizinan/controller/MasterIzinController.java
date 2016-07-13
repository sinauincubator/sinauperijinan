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
import com.sinau.perizinan.form.*;
import com.sinau.perizinan.model.MasterIzin;
import com.sinau.perizinan.service.MasterIzinService;

@Controller
public class MasterIzinController extends ScopeVariableAssigner  {

	private final String MASTER_IZIN_ADD_SUCCESS_MESSAGE = "MasterIzin telah berhasil ditambahkan.";
	private final String MASTER_IZIN_EDIT_SUCCESS_MESSAGE = "MasterIzin telah berhasil diubah.";

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private MasterIzinService masterIzinService;

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getView(@RequestParam(value="page", required=false) Integer currentIndex, Model model){
		logger.info("Received request to show all masterizin");

    	String resultPage = PerizinanPathMappingConstants.MASTER_IZIN_VIEW_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

		PagingRecord<MasterIzinForm> pageList = null;
		try {
			if(currentIndex == null) {
				currentIndex = 0;
			}
			pageList = this.masterIzinService.getAllMasterIzin(currentIndex);
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

			assignMasterIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("masterIzinAttribute", new MasterIzinForm());
    	assignMasterIzinScopeVariable(model);

    	return PerizinanPathMappingConstants.MASTER_IZIN_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("masterIzinAttribute") MasterIzinForm masterIzinForm, Model model) {
		logger.info("Received request to add new masterizin");

		String resulPage = PerizinanPathMappingConstants.MASTER_IZIN_ADD_JSP_PAGE;
		String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = MASTER_IZIN_ADD_SUCCESS_MESSAGE;

		MasterIzin masterIzin = new MasterIzin();
		try{
			BeanUtils.copyProperties(masterIzin, masterIzinForm);
			Integer pk = this.masterIzinService.addAndReturnPrimaryKeyAsInteger(masterIzin);
			masterIzinForm.setKodeIzin(StringUtils.EMPTY + pk);

			resulPage = PerizinanPathMappingConstants.MASTER_IZIN_EDIT_JSP_PAGE;
		} catch (IllegalAccessException e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("masterIzinAttribute", masterIzinForm);

			assignMasterIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}

   		return resulPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="kodeIzin", required=true) Integer kodeIzin, Model model) {
    	logger.info("Received request to show edit page");

    	String resultPage = PerizinanPathMappingConstants.MASTER_IZIN_EDIT_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

		MasterIzinForm masterIzinForm = new MasterIzinForm();
    	try{
    		masterIzinForm = this.masterIzinService.getById(kodeIzin);
    	} catch (Exception e){
    		message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
    		model.addAttribute("masterIzinAttribute", masterIzinForm);

    		assignMasterIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("masterIzinAttribute") MasterIzinForm masterIzinForm, @RequestParam(value="kodeIzin", required=true) String kodeIzin, Model model) {
    	logger.info("Received request to update master izin");

    	String resultPage = PerizinanPathMappingConstants.MASTER_IZIN_EDIT_JSP_PAGE;
    	String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = MASTER_IZIN_EDIT_SUCCESS_MESSAGE;

		MasterIzin masterIzin = new MasterIzin();
    	try {
    		BeanUtils.copyProperties(masterIzin, masterIzinForm);
    		this.masterIzinService.update(masterIzin);
    	} catch(IllegalAccessException e){
    		message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		}catch (InvocationTargetException e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
    		model.addAttribute("masterIzinAttribute", masterIzinForm);

    		assignMasterIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}
}
