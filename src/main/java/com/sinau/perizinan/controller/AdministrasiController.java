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
import com.sinau.perizinan.domain.Administrasi;
import com.sinau.perizinan.domain.KepalaBadan;

@Controller
public class AdministrasiController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.ADMINISTRASI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getAdministrasis(Model model){
		logger.info("Received request to show all administrasis");

		List<Administrasi> administrasis = new ArrayList<Administrasi>();
		Administrasi administrasi = new Administrasi();
		administrasi.setNoPermintaan("001");
		administrasi.setPemohon("Heru Santoso");
		administrasi.setNama("Sinau Academy");
		administrasi.setJenisKelamin("Laki-laki");
		administrasi.setNoKtp("123456789");
		administrasi.setTanggalTerima("20-05-2016");
		administrasi.setTelepon("087 xxx xxx xxx");
		administrasi.setJumlahIzinBelumVerifikasi("4");
		administrasi.setAlamat("Simprug");
		administrasis.add(administrasi);

		model.addAttribute("administrasis", administrasis);

		return PerizinanPathMappingConstants.ADMINISTRASI_VIEW_JSP_PAGE;

	}
	@RequestMapping(value = PerizinanPathMappingConstants.ADMINISTRASI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("administrasiAttribute", new Administrasi());

    	return PerizinanPathMappingConstants.ADMINISTRASI_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.ADMINISTRASI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("administrasiAttribute") KepalaBadan kepalaBadan, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Kepala Badan");

		List<Administrasi> administrasis = new ArrayList<Administrasi>();

    	model.addAttribute("administrasis", administrasis);

    	return PerizinanPathMappingConstants.ADMINISTRASI_EDIT_REQUEST_MAPPING;
	}
}
