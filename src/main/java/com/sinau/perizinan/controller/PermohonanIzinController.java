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
import com.sinau.perizinan.form.PermohonanIzinForm;
import com.sinau.perizinan.model.PermohonanIzin;
import com.sinau.perizinan.service.PermohonanIzinService;


@Controller
public class PermohonanIzinController extends ScopeVariableAssigner {

	private final String PERMOHONAN_IZIN_ADD_SUCCESS_MESSAGE = "PermohonanIzin telah berhasil ditambahkan.";
	private final String PERMOHONAN_IZIN_EDIT_SUCCESS_MESSAGE = "PermohonanIzin telah berhasil diubah.";

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private PermohonanIzinService permohonanIzinService;

    @RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getView(@RequestParam(value="page", required=false) Integer currentIndex, Model model) {
    	logger.info("Received request to show all PermohonanIzin");

    	String resultPage = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_VIEW_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

    	PagingRecord<PermohonanIzinForm> pageList = null;
		try {
			if(currentIndex == null) {
				currentIndex = 0;
			}
			pageList = this.permohonanIzinService.getAllPermohonanIzin(currentIndex);
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

			assignPermohonanIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("PermohonanIzinAttribute", new PermohonanIzinForm());
    	assignPermohonanIzinScopeVariable(model);

    	return PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("PermohonanIzinAttribute") PermohonanIzinForm permohonanIzinForm, Model model) {
		logger.info("Received request to add new PermohonanIzin");

		String resulPage = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_ADD_JSP_PAGE;
		String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = PERMOHONAN_IZIN_ADD_SUCCESS_MESSAGE;

		PermohonanIzin PermohonanIzin = new PermohonanIzin();
		try{
			BeanUtils.copyProperties(PermohonanIzin, permohonanIzinForm);
			Integer pk = this.permohonanIzinService.addAndReturnPrimaryKeyAsInteger(PermohonanIzin);
			permohonanIzinForm.setIdPemohon(StringUtils.EMPTY + pk);

			resulPage = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_JSP_PAGE;
		} catch (IllegalAccessException e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (InvocationTargetException e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
			model.addAttribute("PermohonanIzinAttribute", permohonanIzinForm);

			assignPermohonanIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}

   		return resulPage;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="idPemohon", required=true) Integer idPemohon, Model model) {
    	logger.info("Received request to show edit page");

    	String resultPage = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_JSP_PAGE;
    	String status = StringUtils.EMPTY;
		String message = StringUtils.EMPTY;

    	PermohonanIzinForm permohonanIzinForm = new PermohonanIzinForm();
    	try{
    		permohonanIzinForm = this.permohonanIzinService.getById(idPemohon);
    	} catch (Exception e){
    		message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
    		model.addAttribute("PermohonanIzinAttribute", permohonanIzinForm);

    		assignPermohonanIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}

    	return resultPage;
    }

    @RequestMapping(value = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("PermohonanIzinAttribute") PermohonanIzinForm permohonanIzinForm, Model model) {
    	logger.info("Received request to update PermohonanIzin");

    	String resultPage = PerizinanPathMappingConstants.PERIZINAN_PERMOHONANIZIN_EDIT_JSP_PAGE;
    	String status = USER_MESSAGE_STATUS_SUCCESS;
		String message = PERMOHONAN_IZIN_EDIT_SUCCESS_MESSAGE;

    	PermohonanIzin PermohonanIzin = new PermohonanIzin();
    	try {
    		BeanUtils.copyProperties(PermohonanIzin, permohonanIzinForm);
    		this.permohonanIzinService.update(PermohonanIzin);
    	} catch(IllegalAccessException e){
    		message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		}catch (InvocationTargetException e){
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} catch (Exception e) {
			message = e.getMessage();
			status = USER_MESSAGE_STATUS_FAILED;
		} finally {
    		model.addAttribute("PermohonanIzinAttribute", permohonanIzinForm);

    		assignPermohonanIzinScopeVariable(model);
			assignUserMessage(model, status, message);
		}


    	return resultPage;
    }
}
