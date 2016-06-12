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

import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.form.MasterProfilForm;

@Controller
public class MasterProfilController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_PROFIL_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("masterProfilAttribute", new MasterProfilForm());

    	return PerizinanPathMappingConstants.MASTER_PROFIL_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.MASTER_PROFIL_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("masterProfilAttribute") MasterProfilForm masterProfil, Model model) {
		logger.info("Received request to add new masterprofil");

		List<MasterProfilForm> masterprofils = new ArrayList<MasterProfilForm>();

   		model.addAttribute("masterprofils", masterprofils);

   		return PerizinanPathMappingConstants.MASTER_PROFIL_EDIT_JSP_PAGE;
	}

}
