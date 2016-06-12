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
import com.sinau.perizinan.form.MonitoringForm;

@Controller
public class MonitoringController {

	protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getmonitorings(Model model) {
    	logger.info("Received request to show all monitorings");

    	List<MonitoringForm> monitorings = new ArrayList<MonitoringForm>();
    	MonitoringForm monitoring = new MonitoringForm();
    	monitoring.setPengesahan("Salaph Alghibrany");
    	monitoring.setnoPermintaan("I.000000000034");
    	monitoring.setkodeIzin("11");
    	monitoring.setJenis("SIUP");
    	monitoring.setnomorIzin("123456789");
    	monitoring.setaging("384");
    	
    	monitorings.add(monitoring);
    	model.addAttribute("monitorings", monitorings);

    	return PerizinanPathMappingConstants.LAPORAN_MONITORING_VIEW_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("monitoringAttribute", new MonitoringForm());

    	return PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("monitoringAttribute") MonitoringForm monitoring, Model model) {
		logger.info("Received request to add new monitoring");

		List<MonitoringForm> monitorings = new ArrayList<MonitoringForm>();

   		model.addAttribute("monitorings", monitorings);

   		return PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to show edit page");
    	
    	model.addAttribute("monitoringAttribute", new MonitoringForm());

    	return PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("monitoringAttribute") MonitoringForm monitoring, @RequestParam(value="noPermintaan", required=true) String noPermintaan, Model model) {
    	logger.info("Received request to update monitoring");

		List<MonitoringForm> monitorings = new ArrayList<MonitoringForm>();

    	model.addAttribute("monitorings", monitorings);

    	return PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_JSP_PAGE;
	}
}
