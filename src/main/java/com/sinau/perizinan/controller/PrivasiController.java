package com.sinau.perizinan.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

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

import com.sinau.perizinan.common.PerizinanPathMappingConstants;
import com.sinau.perizinan.form.PrivasiForm;
import com.sinau.perizinan.model.Privasi;
import com.sinau.perizinan.service.PrivasiService;


@Controller
public class PrivasiController {
	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private PrivasiService privasiService;

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_VIEW_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getPrivasis(Model model) {
    	logger.info("Received request to show all privasi");

    	List<Privasi> privasis = this.privasiService.getAllPrivasi();

    	List<PrivasiForm> privasisForm = new ArrayList<PrivasiForm>();
    	for(Privasi privasi : privasis){
    		PrivasiForm privasiForm = new PrivasiForm();
    		try {
    			BeanUtils.copyProperties(privasiForm, privasi);
    		} catch (IllegalAccessException e){
    			e.printStackTrace();
    		} catch (InvocationTargetException e){
    			e.printStackTrace();
    		}

    		privasisForm.add(privasiForm);
    	}

    	model.addAttribute("privasis", privasisForm);

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_VIEW_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");

    	model.addAttribute("privasiAttribute", new PrivasiForm());

    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postAdd(@Valid @ModelAttribute("privasiAttribute") PrivasiForm privasiForm, Model model) {
		logger.info("Received request to add new privasi");

		Privasi privasi = new Privasi();
		try{
			BeanUtils.copyProperties(privasi, privasiForm);
			this.privasiService.add(privasi);
		} catch (IllegalAccessException e){
			e.printStackTrace();
		} catch (InvocationTargetException e){
			e.printStackTrace();
		} finally {
			model.addAttribute("privasiAttribute", privasiForm);
		}

   		return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_ADD_JSP_PAGE;
	}

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_REQUEST_MAPPING, method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="idPrivasi", required=true) String idPrivasi, Model model) {
    	logger.info("Received request to show edit page");
    	String resultPage = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_JSP_PAGE;

    	PrivasiForm privasiForm = new PrivasiForm();
    	Privasi privasi = new Privasi();
    	try{
    		if(StringUtils.isNotBlank(idPrivasi)){
    			privasi.setIdPrivasi(Integer.parseInt(idPrivasi));
    			privasi = this.privasiService.findByExample(privasi);
    			if(privasi != null){
    				BeanUtils.copyProperties(privasiForm, privasi);
    			} else {
    				resultPage = PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
    			}
    		} else{
    			resultPage = PerizinanPathMappingConstants.NOT_FOUND_JSP_PAGE;
    		}
    	} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			model.addAttribute("privasiAttribute", privasiForm);
		}

    	return resultPage;
    }

    @RequestMapping(value = PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_REQUEST_MAPPING, method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("privasiAttribute") PrivasiForm privasiForm, Model model) {
    	logger.info("Received request to update privasi");

    	Privasi privasi = new Privasi();
    	try {
    		BeanUtils.copyProperties(privasi, privasiForm);
    		this.privasiService.update(privasi);
    	} catch(IllegalAccessException e){
    		e.printStackTrace();
    	}catch (InvocationTargetException e){
    		e.printStackTrace();
    	} finally {
    		model.addAttribute("privasiAttribute", privasiForm);
    	}


    	return PerizinanPathMappingConstants.PRIVASI_PENGGUNA_PRIVASI_EDIT_JSP_PAGE;
	}
}
