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
import com.sinau.perizinan.domain.Sekretariat;

@Controller
public class SekretariatController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_SEKRETARIAT_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getSekretariats(Model model){
		logger.info("Received request to show all sekretariats");

		List<Sekretariat> sekretariats = new ArrayList<Sekretariat>();
		Sekretariat sekretariat = new Sekretariat();
		sekretariat.setNoPermintaan("001");
		sekretariat.setPemohon("Heru Santoso");
		sekretariat.setNama("Sinau Academy");
		sekretariat.setJenisKelamin("Laki-laki");
		sekretariat.setNoKtp("123456789");
		sekretariat.setTanggalTerima("20-05-2016");
		sekretariat.setTelepon("087 xxx xxx xxx");
		sekretariat.setJumlahIzinBelumVerifikasi("4");
		sekretariat.setAlamat("Simprug");
		sekretariats.add(sekretariat);

		model.addAttribute("sekretariats", sekretariats);

		return PerizinanPathMappingConstants.MASTER_SEKRETARIAT_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_SEKRETARIAT_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("sekretariatAttribute", new Sekretariat());

    	return PerizinanPathMappingConstants.MASTER_SEKRETARIAT_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_SEKRETARIAT_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("sekretariatAttribute") Sekretariat sekretariat, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Sekretariat");

		List<Sekretariat> sekretariats = new ArrayList<Sekretariat>();

    	model.addAttribute("sekretariats", sekretariats);

    	return PerizinanPathMappingConstants.MASTER_SEKRETARIAT_EDIT_JSP_PAGE;
	}
}
