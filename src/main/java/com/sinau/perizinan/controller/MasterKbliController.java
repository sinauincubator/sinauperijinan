package com.sinau.perizinan.controller;

import java.lang.reflect.InvocationTargetException;

import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
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
import com.sinau.perizinan.form.MasterKbliForm;
import com.sinau.perizinan.model.MasterKbli;
import com.sinau.perizinan.service.MasterKbliService;

@Controller
public class MasterKbliController extends GenericBaseController<MasterKbliForm> {
	protected static Logger logger = Logger.getLogger("controller");
	
	@Autowired
	private MasterKbliService masterKbliService;
	
	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getView(@RequestParam(value="page", required=false) Integer currentIndex, Model model) {
		logger.info("Received request to show all masterkbli");

		String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_VIEW_JSP_PAGE;
		
		PagingRecord<MasterKbliForm> pageList = null;
		try {
			if(currentIndex == null) {
				currentIndex = 0;
			}
			pageList = this.masterKbliService.getAllMasterKbli(currentIndex);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
			resultPage = PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			
			resultPage = PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} catch (Exception e) {
			e.printStackTrace();
			
			resultPage = PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} finally {
			model.addAttribute("pagingRecord", pageList);
		}
		
		return resultPage;
	}
	
	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("masterKbliAttribute", new MasterKbliForm());

    	return PerizinanPathMappingConstants.MASTER_KBLI_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("masterKbliAttribute") MasterKbliForm masterKbliForm, Model model) {
		logger.info("Received request to add new masterkbli");

		String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_ADD_JSP_PAGE;
		
		MasterKbli masterKbli = new MasterKbli();
		try {
			BeanUtils.copyProperties(masterKbli, masterKbliForm);
			this.masterKbliService.add(masterKbli);
		} catch (IllegalAccessException e) {
			return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} catch (InvocationTargetException e) {
			return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} catch (Exception e) {
			// TODO ganti not found dengan meaningful message ke user
			return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} finally {
			model.addAttribute("masterKbliAttribute", masterKbliForm);
		}

   		return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id", required=true) Integer id, Model model) {
    	logger.info("Received request to show edit page");
    	
    	String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE; 

    	MasterKbliForm masterKbliForm = new MasterKbliForm();
    	try {
			masterKbliForm = this.masterKbliService.getById(id);
		} catch (Exception e) {
			e.printStackTrace();
			
			return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} finally {
			model.addAttribute("masterKbliAttribute", masterKbliForm);
		}

    	return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("masterKbliAttribute") MasterKbliForm masterKbliForm, Model model) {
    	logger.info("Received request to update master kbli");

    	String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE;
    	
    	MasterKbli masterKbli = new MasterKbli();
		try {
			BeanUtils.copyProperties(masterKbli, masterKbliForm);
			this.masterKbliService.update(masterKbli);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
			return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			
			return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} catch (Exception e) {
			e.printStackTrace();
			
			return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
		} finally {
			model.addAttribute("masterKbliAttribute", masterKbliForm);
		}

    	return resultPage;
	}
}
