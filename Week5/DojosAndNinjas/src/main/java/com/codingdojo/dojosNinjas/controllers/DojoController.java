package com.codingdojo.dojosNinjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.dojosNinjas.models.Dojo;
import com.codingdojo.dojosNinjas.services.DojoService;

@Controller
public class DojoController {
	enum DojoFiles{
		NEW("dojo/newDojo.jsp"),
		DETAIL("dojo/dojoDetail.jsp"),
		EDIT("dojo/editDojo.jsp"),
		DASHBOARD("dojoDashboard.jsp");
		
		String file;
		
		DojoFiles(String fileRoute){
			file = fileRoute;
		}
	}
	private final DojoService dojoServ;
	public DojoController(DojoService dojoService) {
		this.dojoServ = dojoService;
	}
	@GetMapping("/")
	public String getDashboard(Model model) {
		model.addAttribute("dojos", dojoServ.findAllDojos());
		return DojoFiles.DASHBOARD.file;
	}
	
//	Create Dojo
	@GetMapping("dojo/new")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return DojoFiles.NEW.file;
	}
	
	@PostMapping("dojo/new")
	public String createNewDojo(@Valid @ModelAttribute Dojo dojo, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojo", dojo);
			return DojoFiles.NEW.file;
		} else {
			dojoServ.createDojo(dojo);
			return "redirect:/";
		}
	}
	
//	Retrieve Dojo Info
	@GetMapping("dojo/{id}")
	public String dojoDetails(@PathVariable Long id, Model model) {
		model.addAttribute("dojo", dojoServ.findDojo(id));
		if(model.getAttribute("dojo") != null) {
			return DojoFiles.DETAIL.file;
		}
		else {
			return "redirect:/";
		}
	}
	
//	Update Dojo
	@GetMapping("dojo/{id}/edit")
	public String editDojoForm(@ModelAttribute("dojo") Dojo dojo, Model model,
			@PathVariable Long id) {
		model.addAttribute("dojo", dojoServ.findDojo(id));
		if (model.getAttribute("dojo") != null) {
			return DojoFiles.EDIT.file;
		} else {
			return "redirect:/";
		}
	}
	
	@PutMapping("dojo/{id}/edit")
	public String updateDojoInfo(@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result, Model model, @PathVariable Long id) {
		if (result.hasErrors()) {
			model.addAttribute("dojo", dojo);
			return DojoFiles.EDIT.file;
		} else {
			dojoServ.updateDojo(dojo);
			return "redirect:/";
		}
	}
}
