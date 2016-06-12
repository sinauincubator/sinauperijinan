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
import com.sinau.perizinan.form.*;

@Controller
public class MasterIzinController {

	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getMasterIzins(Model model){
		logger.info("Received request to show all masterizins");

		List<MasterIzinForm> masterIzins = new ArrayList<MasterIzinForm>();
		MasterIzinForm masterIzin = new MasterIzinForm();
		masterIzin.setKodeIzin("12345");
		masterIzin.setJenis("SIUP");
		masterIzin.setIzin("Siup");
		masterIzin.setDasar("-");
		masterIzin.setPeraturan("-");
		masterIzin.setKpi("KPI");
		masterIzin.setAktif("aktif");
		masterIzin.setKodeIzinSyarat("12345");
		masterIzin.setKodeSyarat("23");
		masterIzin.setSyarat("Fotocopy KTP");
		masterIzin.setAktifSyarat("AKTIF");
		masterIzins.add(masterIzin);

		model.addAttribute("masterizins", masterIzins);

		return PerizinanPathMappingConstants.MASTER_IZIN_VIEW_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("masterIzinAttribute", new MasterIzinForm());

    	return PerizinanPathMappingConstants.MASTER_IZIN_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("masterIzinAttribute") MasterIzinForm masterIzin, Model model) {
		logger.info("Received request to add new masterizin");

		List<MasterIzinForm> masterizins = new ArrayList<MasterIzinForm>();

   		model.addAttribute("masterizins", masterizins);

   		return PerizinanPathMappingConstants.MASTER_IZIN_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="kodeIzin", required=true) String kodeIzin, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("masterIzinAttribute", new MasterIzinForm());

    	return PerizinanPathMappingConstants.MASTER_IZIN_EDIT_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_IZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("pemohonAttribute") MasterIzinForm masterIzin, @RequestParam(value="kodeIzin", required=true) String kodeIzin, Model model) {
    	logger.info("Received request to update master izin");

		List<MasterIzinForm> masterizins = new ArrayList<MasterIzinForm>();

    	model.addAttribute("masterizins", masterizins);

    	return PerizinanPathMappingConstants.MASTER_IZIN_EDIT_JSP_PAGE;
	}
}
