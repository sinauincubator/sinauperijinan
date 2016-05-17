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
import com.sinau.perizinan.domain.Pemohon;

@Controller
public class PemohonController {

	protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getPemohons(Model model) {
    	logger.info("Received request to show all pemohons");

    	List<Pemohon> pemohons = new ArrayList<Pemohon>();
    	Pemohon pemohon = new Pemohon();
    	pemohon.setAlamat("jl.mendaki dan berliku no.9");
    	pemohon.setBadanUsaha("PT. Usaha Rakyat");
    	pemohon.setIdPemohon("123");
    	pemohon.setJenisKelamin("Laki-Laki");
    	pemohon.setJenisPemohon("Perorangan");
    	pemohon.setNamaPemohon("Sukijan");
    	pemohon.setNamaUsaha("Usaha Rakyat");
    	pemohons.add(pemohon);

    	model.addAttribute("pemohons", pemohons);

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_VIEW_JSP_PAGE;
	}

    @RequestMapping(value="coba.htm")
    public String sembarang(){
    	return "coba";
    }

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("pemohonAttribute", new Pemohon());

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("pemohonAttribute") Pemohon pemohon, Model model) {
		logger.info("Received request to add new pemohon");

		List<Pemohon> pemohons = new ArrayList<Pemohon>();

   		model.addAttribute("pemohons", pemohons);

   		return PerizinanPathMappingConstants.MASTER_PEMOHON_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("pemohonAttribute", new Pemohon());

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("pemohonAttribute") Pemohon pemohon, @RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to update pemohon");

		List<Pemohon> pemohons = new ArrayList<Pemohon>();

    	model.addAttribute("pemohons", pemohons);

    	return PerizinanPathMappingConstants.MASTER_PEMOHON_EDIT_JSP_PAGE;
	}
}
