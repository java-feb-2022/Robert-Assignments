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
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosNinjas.models.Ninja;
import com.codingdojo.dojosNinjas.services.DojoService;
import com.codingdojo.dojosNinjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	enum NinjaFiles{
		NEW("ninja/newNinja.jsp"),
		DETAIL("ninja/ninjaDetail.jsp"),
		EDIT("ninja/editNinja.jsp"),
		DASHBOARD("dojoDashboard.jsp");
		
		String file;
		
		NinjaFiles(String fileRoute) {
			file = fileRoute;
		}
	}
	
	private final NinjaService ninjaServ;
	private final DojoService dojoServ;
	public NinjaController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaServ = ninjaService;
		this.dojoServ = dojoService;
	}
	
//	Create Ninja
	@GetMapping("/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoServ.findAllDojos());
		return NinjaFiles.NEW.file;
	}
	
	@PostMapping("/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("ninja", ninja);
			return NinjaFiles.NEW.file;
		} else {
			ninjaServ.createNinja(ninja);
			return "redirect:/";
		}
	}
	
//	Retrieve Ninja
	@GetMapping("/{id}")
	public String getNinja(@PathVariable Long id, Model model) {
		model.addAttribute("ninja", ninjaServ.findNinja(id));
		if (model.getAttribute("ninja") != null) {
			return NinjaFiles.DETAIL.file;
		} else {
			return "redirect:/";
		}
	}
	
//	Update Ninja
	@GetMapping("/{id}/edit")
	public String editNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model,
			@PathVariable Long id) {
		model.addAttribute("ninja", ninjaServ.findNinja(id));
		model.addAttribute("dojos", dojoServ.findAllDojos());
		if (model.getAttribute("ninja") != null) {
			return NinjaFiles.EDIT.file;
		} else {
			return "redirect:/";
		}
	}
	
	@PutMapping("/{id}/edit")
	public String updateNinja(@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("ninja", ninja);
			return NinjaFiles.EDIT.file;
		} else {
			ninjaServ.updateNinja(ninja);
			return "redirect:/";
		}
	}
}
