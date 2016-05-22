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
import com.sinau.perizinan.domain.KepalaSeksi;

@Controller
public class KepalaSeksiController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPSEK_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getKepalaSeksis(Model model){
		logger.info("Received request to show all kepalaseksis");

		List<KepalaSeksi> kepalaseksis = new ArrayList<KepalaSeksi>();
		KepalaSeksi kepalaSeksi = new KepalaSeksi();
		kepalaSeksi.setNoPermintaan("001");
		kepalaSeksi.setPemohon("Andita Mega Wahyudi");
		kepalaSeksi.setNama("Andita");
		kepalaSeksi.setJenisKelamin("Perempuan");
		kepalaSeksi.setNoKtp("12345678910");
		kepalaSeksi.setTanggalTerima("22-05-2016");
		kepalaSeksi.setTelepon("0896 7546 3750");
		kepalaSeksi.setJumlahIzinBelumVerifikasi("2");
		kepalaSeksi.setAlamat("Cikarang");
		kepalaseksis.add(kepalaSeksi);

		model.addAttribute("kepalaseksis", kepalaseksis);

		return PerizinanPathMappingConstants.PERIZINAN_KEPSEK_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPSEK_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("kepalaSeksiAttribute", new KepalaSeksi());

    	return PerizinanPathMappingConstants.PERIZINAN_KEPSEK_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_KEPSEK_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("kepalaSeksiAttribute") KepalaSeksi kepalaSeksi, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Kepala Seksi");

		List<KepalaSeksi> kepalaseksis = new ArrayList<KepalaSeksi>();

    	model.addAttribute("kepalaseksis", kepalaseksis);

    	return PerizinanPathMappingConstants.PERIZINAN_KEPSEK_EDIT_JSP_PAGE;
	}
}
