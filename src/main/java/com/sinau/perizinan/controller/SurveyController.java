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
import com.sinau.perizinan.domain.Survey;

@Controller
public class SurveyController {
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_SURVEY_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getSurveys(Model model){
		logger.info("Received request to show all surveys");

		List<Survey> surveys = new ArrayList<Survey>();
		Survey survey = new Survey();
		survey.setNoPermintaan("001");
		survey.setPemohon("Andita Mega Wahyudi");
		survey.setNama("Andita");
		survey.setJenisKelamin("Perempuan");
		survey.setNoKtp("12345678910");
		survey.setTanggalTerima("22-05-2016");
		survey.setTelepon("0896 7546 3750");
		survey.setJumlahIzinBelumVerifikasi("1");
		survey.setAlamat("Cikarang");
		surveys.add(survey);

		model.addAttribute("surveys", surveys);

		return PerizinanPathMappingConstants.PERIZINAN_SURVEY_VIEW_JSP_PAGE;

	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_SURVEY_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");

    	model.addAttribute("surveyAttribute", new Survey());

    	return PerizinanPathMappingConstants.PERIZINAN_SURVEY_EDIT_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_SURVEY_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("surveyAttribute") Survey survey, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update Survey");

		List<Survey> surveys = new ArrayList<Survey>();

    	model.addAttribute("surveys", surveys);

    	return PerizinanPathMappingConstants.PERIZINAN_KEPBAG_EDIT_JSP_PAGE;
	}
}
