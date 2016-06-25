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
import com.sinau.perizinan.form.PrivasiForm;
import com.sinau.perizinan.model.Privasi;
import com.sinau.perizinan.service.PrivasiService;


@Controller
public class PrivasiController extends ScopeVariableAssigner {

	private final String PRIVASI_ADD_SUCCESS_MESSAGE = "Privasi telah berhasil ditambahkan.";
	private final String PRIVASI_EDIT_SUCCESS_MESSAGE = "Privasi telah berhasil diubah.";

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private PrivasiService privasiService;

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getView(@RequestParam(value="page", required=false) Integer currentIndex, Model model) {
    	logger.info("Received request to show all privasi");

    	String resultPage = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_VIEW_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

    	PagingRecord<PrivasiForm> pageList = null;
		try {
			if(currentIndex == null) {
				currentIndex = 0;
			}
			pageList = this.privasiService.getAllPrivasi(currentIndex);
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

			assignPrivasiScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("privasiAttribute", new PrivasiForm());
    	assignPrivasiScopeVariable(model);

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("privasiAttribute") PrivasiForm privasiForm, Model model) {
		logger.info("Received request to add new privasi");

		String resulPage = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_JSP_PAGE;
		String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = PRIVASI_ADD_SUCCESS_MESSAGE;

		Privasi privasi = new Privasi();
		try{
			BeanUtils.copyProperties(privasi, privasiForm);
			Integer pk = this.privasiService.addAndReturnPrimaryKeyAsInteger(privasi);
			privasiForm.setIdPrivasi(StringUtils.EMPTY + pk);

			resulPage = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_JSP_PAGE;
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
			model.addAttribute("privasiAttribute", privasiForm);

			assignPrivasiScopeVariable(model);
			assignUserMessage(model, status, message);
		}

   		return resulPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="idPrivasi", required=true) Integer idPrivasi, Model model) {
    	logger.info("Received request to show edit page");

    	String resultPage = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

    	PrivasiForm privasiForm = new PrivasiForm();
    	try{
    		privasiForm = this.privasiService.getById(idPrivasi);
    	} catch (Exception e){
    		message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
    		model.addAttribute("privasiAttribute", privasiForm);

    		assignPrivasiScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
    }

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("privasiAttribute") PrivasiForm privasiForm, Model model) {
    	logger.info("Received request to update privasi");

    	String resultPage = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_JSP_PAGE;
    	String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = PRIVASI_EDIT_SUCCESS_MESSAGE;

    	Privasi privasi = new Privasi();
    	try {
    		BeanUtils.copyProperties(privasi, privasiForm);
    		this.privasiService.update(privasi);
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
    		model.addAttribute("privasiAttribute", privasiForm);

    		assignPrivasiScopeVariable(model);
			assignUserMessage(model, status, message);
		}


    	return resultPage;
    }
}
