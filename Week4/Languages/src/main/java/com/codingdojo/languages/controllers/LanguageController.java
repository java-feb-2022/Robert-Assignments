package com.codingdojo.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@Controller
public class LanguageController {

	private final LanguageService langServ;
	
	public LanguageController(LanguageService languageService) {
		this.langServ = languageService;
	}
	
//	Home Page Controls
	@GetMapping("/")
	public String homePage(@ModelAttribute("language") Language language, Model model) {
		model.addAttribute("langs", langServ.getAllLanguages());
		return "index.jsp";
	}
	
//	Detail Page
	@GetMapping("/language/{id}")
	public String detailPage(@PathVariable Long id, Model model) {
		model.addAttribute("language", langServ.getLanguageById(id));
		if(model.getAttribute("language") != null) {
			return "detailLanguage.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
//	Edit Page
	@GetMapping("/edit/{id}")
	public String editPage(@PathVariable Long id, Model model) {
		model.addAttribute("language", langServ.getLanguageById(id));
		if(model.getAttribute("language") != null) {
			return "editLanguage.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
	@PutMapping("/edit/{id}/commit")
	public String commitEditLanguage(@PathVariable Long id, @Valid @ModelAttribute("language") Language language,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("language", language);
			return "editLanguage.jsp";
		}
		else {
			langServ.updateLanguage(language);
			return "redirect:/";
		}
	}
	
//	Create/Delete Routes
	@PostMapping("/createLanguage")
	public String createLanguage(@Valid @ModelAttribute("language") Language language,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAllAttributes(langServ.getAllLanguages());
			return "index.jsp";
		} else {
			langServ.createLanguage(language);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable Long id) {
		langServ.deleteLanguageById(id);
		return "redirect:/";
	}
}
