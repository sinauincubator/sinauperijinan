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
import com.sinau.perizinan.domain.KepalaBagian;

@Controller
public class KepalaBagianController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPBAG_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getKepalaBagians(Model model){
		logger.info("Received request to show all kepalabagians");

		List<KepalaBagian> kepalabagians = new ArrayList<KepalaBagian>();
		KepalaBagian kepalaBagian = new KepalaBagian();
		kepalaBagian.setNoPermintaan("001");
		kepalaBagian.setPemohon("Andita Mega Wahyudi");
		kepalaBagian.setNama("Andita");
		kepalaBagian.setJenisKelamin("Perempuan");
		kepalaBagian.setNoKtp("12345678910");
		kepalaBagian.setTanggalTerima("22-05-2016");
		kepalaBagian.setTelepon("0896 7546 3750");
		kepalaBagian.setJumlahIzinBelumVerifikasi("1");
		kepalaBagian.setAlamat("Cikarang");
		kepalabagians.add(kepalaBagian);

		model.addAttribute("kepalabagians", kepalabagians);

		return PerizinanPathMappingConstants.PERIZINAN_KEPBAG_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPBAG_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("kepalaBagianAttribute", new KepalaBagian());

    	return PerizinanPathMappingConstants.PERIZINAN_KEPBAG_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPBAG_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("kepalaBidangAttribute") KepalaBagian kepalaBagian, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Kepala Bagian");

		List<KepalaBagian> kepalabagians = new ArrayList<KepalaBagian>();

    	model.addAttribute("kepalabagians", kepalabagians);

    	return PerizinanPathMappingConstants.PERIZINAN_KEPBAG_EDIT_JSP_PAGE;
	}
}
