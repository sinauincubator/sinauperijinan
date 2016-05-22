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
    public String getSurveys(Model model) {
    	logger.info("Received request to show all surveys");

    	List<Survey> surveys = new ArrayList<Survey>();
    	Survey survey = new Survey();
    	survey.setNoPermintaan("123456");
    	survey.setPemohon("Andita Mega Wahyudi");
    	survey.setNama("Andita");
    	survey.setJenisKelamin("Perempuan");
    	survey.setNoKTP("9868752936263");
    	survey.setTglTerima("21-05-2016");
    	survey.setTelepon("089675463750");
    	survey.setJmlIzinBelumSurvey("5");


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
    	logger.info("Received request to update survey");

    	model.addAttribute("surveyAttribute", new Survey());

    	return PerizinanPathMappingConstants.PERIZINAN_SURVEY_EDIT_JSP_PAGE;
	}
}
