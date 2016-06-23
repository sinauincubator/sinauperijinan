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
import com.sinau.perizinan.form.MasterKbliForm;
import com.sinau.perizinan.model.MasterKbli;
import com.sinau.perizinan.service.MasterKbliService;

@Controller
public class MasterKbliController extends ScopeVariableAssigner {
	
	private final String MASTER_KBLI_ADD_SUCCESS_MESSAGE = "Master KBLI telah berhasil ditambahkan.";
	private final String MASTER_KBLI_EDIT_SUCCESS_MESSAGE = "Master KBLI telah berhasil diubah.";
	
	protected static Logger logger = Logger.getLogger("controller");
	
	@Autowired
	private MasterKbliService masterKbliService;
	
	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getView(@RequestParam(value="page", required=false) Integer currentIndex, Model model) {
		logger.info("Received request to show all masterkbli");

		String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_VIEW_JSP_PAGE;
		String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;
		
		PagingRecord<MasterKbliForm> pageList = null;
		try {
			if(currentIndex == null) {
				currentIndex = 0;
			}
			pageList = this.masterKbliService.getAllMasterKbli(currentIndex);
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
			
			assignMasterKbliScopeVariable(model);
			assignUserMessage(model, status, message);
		}
		
		return resultPage;
	}
	
	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("masterKbliAttribute", new MasterKbliForm());
    	assignMasterKbliScopeVariable(model);

    	return PerizinanPathMappingConstants.MASTER_KBLI_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("masterKbliAttribute") MasterKbliForm masterKbliForm, Model model) {
		logger.info("Received request to add new masterkbli");

		String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_ADD_JSP_PAGE;
		String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = MASTER_KBLI_ADD_SUCCESS_MESSAGE;
		
		MasterKbli masterKbli = new MasterKbli();
		try {
			BeanUtils.copyProperties(masterKbli, masterKbliForm);
			Integer pk = this.masterKbliService.addAndReturnPrimaryKeyAsInteger(masterKbli);
			masterKbliForm.setId(pk);
			
			resultPage = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE;
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
			model.addAttribute("masterKbliAttribute", masterKbliForm);
			
			assignMasterKbliScopeVariable(model);
			assignUserMessage(model, status, message);
		}

   		return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id", required=true) Integer id, Model model) {
    	logger.info("Received request to show edit page");
    	
    	String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

    	MasterKbliForm masterKbliForm = new MasterKbliForm();
    	try {
			masterKbliForm = this.masterKbliService.getById(id);
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("masterKbliAttribute", masterKbliForm);
			
			assignMasterKbliScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("masterKbliAttribute") MasterKbliForm masterKbliForm, Model model) {
    	logger.info("Received request to update master kbli");

    	String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE;
    	String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = MASTER_KBLI_EDIT_SUCCESS_MESSAGE;
    	
    	MasterKbli masterKbli = new MasterKbli();
		try {
			BeanUtils.copyProperties(masterKbli, masterKbliForm);
			this.masterKbliService.update(masterKbli);
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
			model.addAttribute("masterKbliAttribute", masterKbliForm);
			
			assignMasterKbliScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}
}
