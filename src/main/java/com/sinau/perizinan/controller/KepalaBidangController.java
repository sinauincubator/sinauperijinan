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
import com.sinau.perizinan.form.KepalaBidangForm;

@Controller
public class KepalaBidangController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPALABIDANG_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getKepalaBidangs(Model model){
		logger.info("Received request to show all kepalabidangs");

		List<KepalaBidangForm> kepalabidangs = new ArrayList<KepalaBidangForm>();
		KepalaBidangForm kepalaBidang = new KepalaBidangForm();
		kepalaBidang.setNoPermintaan("001");
		kepalaBidang.setPemohon("Heru Santoso");
		kepalaBidang.setNama("Sinau Academy");
		kepalaBidang.setJenisKelamin("Laki-laki");
		kepalaBidang.setNoKtp("123456789");
		kepalaBidang.setTanggalTerima("20-05-2016");
		kepalaBidang.setTelepon("087 xxx xxx xxx");
		kepalaBidang.setJumlahIzinBelumVerifikasi("4");
		kepalaBidang.setAlamat("Simprug");
		kepalabidangs.add(kepalaBidang);

		model.addAttribute("kepalabidangs", kepalabidangs);

		return PerizinanPathMappingConstants.PERIZINAN_KEPALABIDANG_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPALABIDANG_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("kepalaBidangAttribute", new KepalaBidangForm());

    	return PerizinanPathMappingConstants.PERIZINAN_KEPALABIDANG_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPALABIDANG_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("kepalaBidangAttribute") KepalaBidangForm kepalaBidang, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Kepala Bidang");

		List<KepalaBidangForm> kepalabidangs = new ArrayList<KepalaBidangForm>();

    	model.addAttribute("kepalabidangs", kepalabidangs);

    	return PerizinanPathMappingConstants.PERIZINAN_KEPALABIDANG_EDIT_JSP_PAGE;
	}
}
