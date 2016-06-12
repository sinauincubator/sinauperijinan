package com.sinau.perizinan.controller;

import java.util.List;
import java.util.ArrayList;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sinau.perizinan.form.MahasiswaForm;

@Controller
public class MahasiswaController {

	protected static Logger logger = Logger.getLogger("controller");
	
    @RequestMapping(value = "/mahasiswa.htm", method = RequestMethod.GET)
    public String getMahasiswas(Model model) {    	
    	logger.info("Received request to show all mahasiswas");
    	
    	List<MahasiswaForm> mahasiswas = new ArrayList<MahasiswaForm>();
    	
    	model.addAttribute("mahasiswas", mahasiswas);
    	
    	return "mahasiswapage";
	}
    
    @RequestMapping(value = "/mahasiswaadd.htm", method = RequestMethod.GET)
    public String getAdd(Model model) {
    	logger.info("Received request to show add page");
    
    	model.addAttribute("mahasiswaAttribute", new MahasiswaForm());

    	return "mahasiswaadd";
	}
 
    @RequestMapping(value = "/mahasiswaadd.htm", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute("mahasiswaAttribute") MahasiswaForm mahasiswa, Model model) {
		logger.info("Received request to add new mahasiswa");
		
		List<MahasiswaForm> mahasiswas = new ArrayList<MahasiswaForm>();
    	
   		model.addAttribute("mahasiswas", mahasiswas);
    		
   		return "mahasiswapage";    	
	}
    
    @RequestMapping(value = "/mahasiswadelete.htm", method = RequestMethod.GET)
    public String delete(@RequestParam(value="id", required=true) String id, Model model) {   
		logger.info("Received request to delete existing mahasiswa");
		
		List<MahasiswaForm> mahasiswas = new ArrayList<MahasiswaForm>();
    	
    	model.addAttribute("mahasiswas", mahasiswas);
    	
    	return "mahasiswapage";
	}
    
    @RequestMapping(value = "/mahasiswaedit.htm", method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to show edit page");
    	
		List<MahasiswaForm> mahasiswas = new ArrayList<MahasiswaForm>();
		
    	model.addAttribute("mahasiswaAttribute", mahasiswas);
    	
    	return "mahasiswaedit";
	}
    
    @RequestMapping(value = "/mahasiswaedit.htm", method = RequestMethod.POST)
    public String saveEdit(@Valid @ModelAttribute("mahasiswaAttribute") MahasiswaForm mahasiswa, @RequestParam(value="id", required=true) String id, Model model) {
    	logger.info("Received request to update mahasiswa");
    
		List<MahasiswaForm> mahasiswas = new ArrayList<MahasiswaForm>();
    	
    	model.addAttribute("mahasiswas", mahasiswas);
    	
    	return "mahasiswapage";
	}
    
}
