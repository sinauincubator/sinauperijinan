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
import com.sinau.perizinan.domain.Pengguna;

@Controller
public class PenggunaController {

	protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getPenggunas(Model model) {
    	logger.info("Received request to show all penggunas");

    	List<Pengguna> penggunas = new ArrayList<Pengguna>();
    	Pengguna pengguna = new Pengguna();
    	pengguna.setIdPengguna("123456");
    	pengguna.setNamaLengkap("Andita Mega Wahyudi");
    	pengguna.setRoleManajemen("123");
    	pengguna.setUserID("1234");

    	penggunas.add(pengguna);

    	model.addAttribute("penggunas", penggunas);

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_VIEW_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("penggunaAttribute", new Pengguna());

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("penggunaAttribute") Pengguna pengguna, Model model) {
		logger.info("Received request to add new pengguna");

		model.addAttribute("penggunaAttribute", new Pengguna());

   		return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="idPengguna", required=true) String idPengguna, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("penggunaAttribute", new Pengguna());

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_EDIT_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("penggunaAttribute") Pengguna pengguna, @RequestParam(value="idPengguna", required=true) String idPengguna, Model model) {
    	logger.info("Received request to update pengguna");

    	model.addAttribute("penggunaAttribute", new Pengguna());

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PENGGUNA_EDIT_JSP_PAGE;
	}
}
