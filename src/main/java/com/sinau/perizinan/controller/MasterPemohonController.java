package com.sinau.perizinan.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

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

import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.form.MasterPemohonForm;
import com.sinau.perizinan.model.MasterPemohon;
import com.sinau.perizinan.service.MasterPemohonService;

@Controller
public class MasterPemohonController {

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private MasterPemohonService pemohonService;

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getPemohons(Model model) {
    	logger.info("Received request to show all pemohons");

    	List<MasterPemohon> pemohons = this.pemohonService.listPemohons();

    	List<MasterPemohonForm> pemohonsForm = new ArrayList<MasterPemohonForm>();
    	for(MasterPemohon pemohon : pemohons){
    		MasterPemohonForm pemohonForm = new MasterPemohonForm();
    		try{
    			BeanUtils.copyProperties(pemohonForm, pemohon);
    		} catch (IllegalAccessException e){
    			e.printStackTrace();
    		} catch (InvocationTargetException e){
    			e.printStackTrace();
    		}

    		pemohonsForm.add(pemohonForm);
    	}

    	model.addAttribute("pemohons", pemohonsForm);

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("pemohonAttribute", new MasterPemohonForm());

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("pemohonAttribute") MasterPemohonForm pemohonForm, Model model) {
		logger.info("Received request to add new pemohon");

		MasterPemohon pemohon = new MasterPemohon();
		try{
			BeanUtils.copyProperties(pemohon, pemohonForm);
			this.pemohonService.addPemohon(pemohon);
		} catch (IllegalAccessException e){
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			model.addAttribute("pemohonAttribute", pemohonForm);
		}

   		return PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("pemohonAttribute", new MasterPemohonForm());

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("pemohonAttribute") MasterPemohonForm pemohon, @RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to update pemohon");

		List<MasterPemohonForm> pemohons = new ArrayList<MasterPemohonForm>();

    	model.addAttribute("pemohons", pemohons);

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
	}
}
