package com.sinau.perizinan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinau.perizinan.common.PerizinanPathMappingConstants;

@Controller
public class WelcomeController {
	
	protected static Logger logger = Logger.getLogger("controller");

	@RequestMapping(PerizinanPathMappingConstants.WELCOME_REQUEST_MAPPING)
	public String redirect()
	{
		logger.info("Received request to welcome page");
		return PerizinanPathMappingConstants.WELCOME_JSP_PAGE;
	}
}
