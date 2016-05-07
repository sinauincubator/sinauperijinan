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
import com.sinau.perizinan.domain.MasterIzin;
import com.sinau.perizinan.domain.MasterKbli;

@Controller
public class MasterKbliController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getMasterKblis(Model model){
		logger.info("Received request to show all masterkblis");

		List<MasterKbli> masterKblis = new ArrayList<MasterKbli>();
		MasterKbli masterKbli = new MasterKbli();
		masterKbli.setKbli("4212");
		masterKbli.setDeskripsi("PERDAGANGAN ");
		masterKblis.add(masterKbli);

		model.addAttribute("masterkblis", masterKblis);

		return PerizinanPathMappingConstants.MASTER_KBLI_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("masterKbliAttribute", new MasterKbli());

    	return PerizinanPathMappingConstants.MASTER_KBLI_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("masterKbliAttribute") MasterKbli masterKbli, Model model) {
		logger.info("Received request to add new masterkbli");

		List<MasterKbli> masterkblis = new ArrayList<MasterKbli>();

   		model.addAttribute("masterkblis", masterkblis);

   		return PerizinanPathMappingConstants.MASTER_KBLI_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="kbli", required=true) String kbli, Model model) {
    	logger.info("Received request to show edit page");

		List<MasterKbli> masterkblis = new ArrayList<MasterKbli>();

    	model.addAttribute("masterIzinAttribute", masterkblis);

    	return PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_KBLI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("masterKbliAttribute") MasterKbli masterKbli, @RequestParam(value="kbli", required=true) String kbli, Model model) {
    	logger.info("Received request to update master kbli");

		List<MasterKbli> masterkblis = new ArrayList<MasterKbli>();

    	model.addAttribute("masterkblis", masterkblis);

    	return PerizinanPathMappingConstants.MASTER_KBLI_EDIT_JSP_PAGE;
	}
}
