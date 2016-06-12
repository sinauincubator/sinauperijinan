package com.sinau.perizinan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.form.PemohonForm;

@Controller
public class PemohonController {

	protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getPemohons(Model model) {
    	logger.info("Received request to show all pemohons");

    	List<PemohonForm> pemohons = new ArrayList<PemohonForm>();
    	PemohonForm pemohon = new PemohonForm();
    	pemohon.setAlamat("jl.mendaki dan berliku no.9");
    	pemohon.setBadanUsaha("PT. Usaha Rakyat");
    	pemohon.setIdPemohon("123");
    	pemohon.setJenisKelamin("Laki-Laki");
    	pemohon.setJenisPemohon("Perorangan");
    	pemohon.setNamaPemohon("Sukijan");
    	pemohon.setNamaUsaha("Usaha Rakyat");
    	pemohons.add(pemohon);

    	model.addAttribute("pemohons", pemohons);

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("pemohonAttribute", new PemohonForm());

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("pemohonAttribute") PemohonForm pemohon, Model model) {
		logger.info("Received request to add new pemohon");

		List<PemohonForm> pemohons = new ArrayList<PemohonForm>();

   		model.addAttribute("pemohons", pemohons);

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
