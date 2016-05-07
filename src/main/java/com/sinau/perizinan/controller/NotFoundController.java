package com.sinau.perizinan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinau.perizinan.common.PerizinanPathMappingConstants;

@Controller
public class NotFoundController {

	@RequestMapping(PerizinanPathMappingConstants.NOT_FOUND_REQUEST_MAPPING)
	public String redirect()
	{
		return PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
	}
	
}
