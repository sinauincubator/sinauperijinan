package com.sinau.perizinan.controller;

import java.lang.reflect.InvocationTargetException;

import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sinau.perizinan.common.PagingRecord;
import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.common.ScopeVariableAssigner;
import com.sinau.perizinan.form.MonitoringForm;
import com.sinau.perizinan.model.Monitoring;
import com.sinau.perizinan.service.MonitoringService;

@Controller
public class MonitoringController extends ScopeVariableAssigner {
	
	private final String LAPORAN_MONITORING_ADD_SUCCESS_MESSAGE = "Monitoring telah berhasil ditambahkan.";
	private final String LAPORAN_MONITORING_EDIT_SUCCESS_MESSAGE = "Monitoring telah berhasil diubah.";
	
	protected static Logger logger = Logger.getLogger("controller");
	
	@Autowired
	private MonitoringService monitoringService;
	
	@RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
	public String getView(@RequestParam(value="page", required=false) Integer currentIndex, Model model) {
		logger.info("Received request to show all Monitoring");

		String resultPage = PerizinanPathMappingConstants.LAPORAN_MONITORING_VIEW_JSP_PAGE;
		String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;
		
		PagingRecord<MonitoringForm> pageList = null;
		try {
			if(currentIndex == null) {
				currentIndex = 0;
			}
			pageList = this.monitoringService.getAllMonitoring(currentIndex);
		} catch (IllegalAccessException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("pagingRecord", pageList);
			model.addAttribute("MonitoringAttribute", new MonitoringForm());
			
			assignMonitoringScopeVariable(model);
			assignUserMessage(model, status, message);
		}
		
		return resultPage;
	}
	
	@RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("monitoringAttribute", new MonitoringForm());
    	assignMonitoringScopeVariable(model);

    	return PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_JSP_PAGE;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("monitoringAttribute") MonitoringForm monitoringForm, Model model) {
		logger.info("Received request to add new Monitoring");

		String resultPage = PerizinanPathMappingConstants.LAPORAN_MONITORING_ADD_JSP_PAGE;
		String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = LAPORAN_MONITORING_ADD_SUCCESS_MESSAGE;
		
		Monitoring monitoring = new Monitoring();
		try {
			BeanUtils.copyProperties(monitoring, monitoringForm);
			Integer pk = this.monitoringService.addAndReturnPrimaryKeyAsInteger(monitoring);
			monitoringForm.setId(pk);
			
			resultPage = PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_JSP_PAGE;
		} catch (IllegalAccessException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("monitoringAttribute", monitoringForm);
			
			assignMonitoringScopeVariable(model);
			assignUserMessage(model, status, message);
		}

   		return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id", required=true) Integer id, Model model) {
    	logger.info("Received request to show edit page");
    	
    	String resultPage = PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

    	MonitoringForm MonitoringForm = new MonitoringForm();
    	try {
			MonitoringForm = this.monitoringService.getById(id);
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("monitoringAttribute", MonitoringForm);
			
			assignMonitoringScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}

	@RequestMapping(value = PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("monitoringAttribute") MonitoringForm monitoringForm, Model model) {
    	logger.info("Received request to update master kbli");

    	String resultPage = PerizinanPathMappingConstants.LAPORAN_MONITORING_EDIT_JSP_PAGE;
    	String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = LAPORAN_MONITORING_EDIT_SUCCESS_MESSAGE;
    	
    	Monitoring Monitoring = new Monitoring();
		try {
			BeanUtils.copyProperties(Monitoring, monitoringForm);
			this.monitoringService.update(Monitoring);
		} catch (IllegalAccessException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("monitoringAttribute", monitoringForm);
			
			assignMonitoringScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}
}
