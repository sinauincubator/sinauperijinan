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

import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.form.PermohonanIzinForm;

@Controller
public class PermohonanIzinController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getPermohonanIzins(Model model){
		logger.info("Received request to show all permohonanizins");

		List<PermohonanIzinForm> permohonanIzins = new ArrayList<PermohonanIzinForm>();
		PermohonanIzinForm permohonanIzin = new PermohonanIzinForm();
		permohonanIzin.setNomorPermintaan("125167346");
		permohonanIzin.setNamaPemohon("Andita Mega Wahyudi ");
		permohonanIzin.setIdPemohon("12345");
		permohonanIzin.setNamaPerusahaan("Sinau Academy ");
		permohonanIzin.setIzin("BLABLABLA");
		permohonanIzin.setNoIzin("154266 ");
		permohonanIzin.setStatus("OK ");
		permohonanIzin.setProsesSelanjutnya("SELESAI");
		permohonanIzin.setTglInput("22-05-2016 ");
		permohonanIzin.setTglSelesai("23-05-2016");
		permohonanIzin.setEntryOleh("Aku ");

		permohonanIzins.add(permohonanIzin);

		model.addAttribute("permohonanizins", permohonanIzins);

		return PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("permohonanIzinAttribute", new PermohonanIzinForm());

    	return PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("permohonanIzinAttribute") PermohonanIzinForm permohonanIzin, Model model) {
		logger.info("Received request to add new permohonanizin");

		List<PermohonanIzinForm> permohonanizins = new ArrayList<PermohonanIzinForm>();

   		model.addAttribute("permohonanizins", permohonanizins);

   		return PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("permohonanIzinAttribute", new PermohonanIzinForm());

    	return PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("permohonanIzinAttribute") PermohonanIzinForm permohonanIzin,  Model model) {
    	logger.info("Received request to update permohonan izin");

    	List<PermohonanIzinForm> permohonanizins = new ArrayList<PermohonanIzinForm>();

    	model.addAttribute("permohonanizins", permohonanizins);

    	return PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_JSP_PAGE;
	}
}
