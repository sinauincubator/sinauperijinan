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
import com.sinau.perizinan.domain.Privasi;

@Controller
public class PrivasiController {

	protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getPrivasis(Model model) {
    	logger.info("Received request to show all privasis");

    	List<Privasi> privasis = new ArrayList<Privasi>();
    	Privasi privasi = new Privasi();
    	privasi.setIdPrivasi("1234");
    	privasi.setRoleName("Nddiettmega");

    	privasis.add(privasi);

    	model.addAttribute("privasis", privasis);

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_VIEW_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("privasiAttribute", new Privasi());

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("privasiAttribute") Privasi privasi, Model model) {
		logger.info("Received request to add new privasi");

		List<Privasi> privasis = new ArrayList<Privasi>();

   		model.addAttribute("privasis", privasis);

   		return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="idPrivasi", required=true) String idPrivasi, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("privasiAttribute", new Privasi());

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("privasiAttribute") Privasi privasi, @RequestParam(value="idPrivasi", required=true) String idPrivasi, Model model) {
    	logger.info("Received request to update privasi");

		List<Privasi> privasis = new ArrayList<Privasi>();

    	model.addAttribute("privasis", privasis);

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_JSP_PAGE;
	}
}
