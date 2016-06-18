package com.sinau.perizinan.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

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

import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.form.MasterKbliForm;
import com.sinau.perizinan.model.MasterKbli;
import com.sinau.perizinan.service.MasterKbliService;

@Controller
public class MasterKbliController {
	protected static Logger logger = Logger.getLogger("controller");
	
	@Autowired
	private MasterKbliService masterKbliService;
	
	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getMasterKblis(Model model){
		logger.info("Received request to show all masterkbli");

		List<MasterKbli> masterKblis = this.masterKbliService.listMasterKblis();

		List<MasterKbliForm> masterKblisForm = new ArrayList<MasterKbliForm>();
		for(MasterKbli masterKbli : masterKblis) {
			MasterKbliForm masterKbliForm = new MasterKbliForm();
			try {
				BeanUtils.copyProperties(masterKbliForm, masterKbli);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			
			masterKblisForm.add(masterKbliForm);
		}
		
		model.addAttribute("masterkblis", masterKblisForm);

		return PerizinanPathMappingConstants.MASTER_KBLI_VIEW_JSP_PAGE;

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

		MasterKbli masterKbli = new MasterKbli();
		try {
			BeanUtils.copyProperties(masterKbli, masterKbliForm);
			this.masterKbliService.addMasterKbli(masterKbli);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			model.addAttribute("masterKbliAttribute", masterKbliForm);
		}

   		return PerizinanPathMappingConstants.MASTER_KBLI_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to show edit page");
    	String resultPage = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE; 

    	MasterKbliForm masterKbliForm = new MasterKbliForm();
    	MasterKbli masterKbli = new MasterKbli();
		try {
			if(StringUtils.isNotBlank(id)) {
				masterKbli.setId(Integer.parseInt(id));
				masterKbli = this.masterKbliService.findByExample(masterKbli);
				if(masterKbli != null) {
					BeanUtils.copyProperties(masterKbliForm, masterKbli);
				} else {
					resultPage = PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
				}
			} else {
				resultPage = PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			model.addAttribute("masterKbliAttribute", masterKbliForm);
		}

    	return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("masterKbliAttribute") MasterKbliForm masterKbliForm, Model model) {
    	logger.info("Received request to update master kbli");

    	MasterKbli masterKbli = new MasterKbli();
		try {
			BeanUtils.copyProperties(masterKbli, masterKbliForm);
			this.masterKbliService.updateMasterKbli(masterKbli);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			model.addAttribute("masterKbliAttribute", masterKbliForm);
		}

    	return PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE;
	}
}
