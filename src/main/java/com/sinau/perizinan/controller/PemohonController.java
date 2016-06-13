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
import com.sinau.perizinan.form.PemohonForm;
import com.sinau.perizinan.model.Pemohon;
import com.sinau.perizinan.service.PemohonService;

@Controller
public class PemohonController {

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private PemohonService pemohonService;

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getPemohons(Model model) {
    	logger.info("Received request to show all pemohons");

    	List<Pemohon> pemohons = this.pemohonService.listPemohons();

    	List<PemohonForm> pemohonsForm = new ArrayList<PemohonForm>();
    	for(Pemohon pemohon : pemohons){
    		PemohonForm pemohonForm = new PemohonForm();
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

    	model.addAttribute("pemohonAttribute", new PemohonForm());

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("pemohonAttribute") PemohonForm pemohonForm, Model model) {
		logger.info("Received request to add new pemohon");

		Pemohon pemohon = new Pemohon();
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

    	model.addAttribute("pemohonAttribute", new PemohonForm());

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("pemohonAttribute") PemohonForm pemohon, @RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to update pemohon");

		List<PemohonForm> pemohons = new ArrayList<PemohonForm>();

    	model.addAttribute("pemohons", pemohons);

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
	}
}
