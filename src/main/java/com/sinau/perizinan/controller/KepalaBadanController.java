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
import com.sinau.perizinan.form.KepalaBadanForm;

@Controller
public class KepalaBadanController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPALABADAN_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getKepalaBadans(Model model){
		logger.info("Received request to show all kepalabadans");

		List<KepalaBadanForm> kepalabadans = new ArrayList<KepalaBadanForm>();
		KepalaBadanForm kepalaBadan = new KepalaBadanForm();
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

		return PerizinanPathMappingConstants.PERIZINAN_KEPALABADAN_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPALABADAN_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("kepalaBadanAttribute", new KepalaBadanForm());

    	return PerizinanPathMappingConstants.PERIZINAN_KEPALABADAN_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPALABADAN_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("kepalaBadanAttribute") KepalaBadanForm kepalaBadan, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Kepala Badan");

		List<KepalaBadanForm> kepalabadans = new ArrayList<KepalaBadanForm>();

    	model.addAttribute("kepalabadans", kepalabadans);

    	return PerizinanPathMappingConstants.PERIZINAN_KEPALABIDANG_EDIT_JSP_PAGE;
	}
}
