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
import com.sinau.perizinan.domain.KepalaBadan;

@Controller
public class KepalaBadanController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KEPALABADAN_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getKepalaBadans(Model model){
		logger.info("Received request to show all kepalabadans");

		List<KepalaBadan> kepalabadans = new ArrayList<KepalaBadan>();
		KepalaBadan kepalaBadan = new KepalaBadan();
		kepalaBadan.setNoPermintaan("001");
		kepalaBadan.setPemohon("Heru Santoso");
		kepalaBadan.setNama("Sinau Academy");
		kepalaBadan.setJenisKelamin("Laki-laki");
		kepalaBadan.setNoKtp("123456789");
		kepalaBadan.setTanggalTerima("20-05-2016");
		kepalaBadan.setTelepon("087 xxx xxx xxx");
		kepalaBadan.setJumlahIzinBelumVerifikasi("4");
		kepalaBadan.setAlamat("Simprug");
		kepalabadans.add(kepalaBadan);

		model.addAttribute("kepalabadans", kepalabadans);

		return PerizinanPathMappingConstants.MASTER_KEPALABADAN_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KEPALABADAN_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("kepalaBadanAttribute", new KepalaBadan());

    	return PerizinanPathMappingConstants.MASTER_KEPALABADAN_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KEPALABADAN_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("kepalaBadanAttribute") KepalaBadan kepalaBadan, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Kepala Badan");

		List<KepalaBadan> kepalabadans = new ArrayList<KepalaBadan>();

    	model.addAttribute("kepalabadans", kepalabadans);

    	return PerizinanPathMappingConstants.MASTER_KEPALABIDANG_EDIT_JSP_PAGE;
	}
}
