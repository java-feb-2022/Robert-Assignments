package com.codingdojo.loginRegistration.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.loginRegistration.models.LoginUser;
import com.codingdojo.loginRegistration.models.User;
import com.codingdojo.loginRegistration.services.UserServices;

@Controller
public class HomeController {
	private final UserServices userServ;
	
	public HomeController(UserServices userServices) {
		this.userServ = userServices;
	}
	
	@GetMapping("/")
	public String homePage(@ModelAttribute("newUser") User user, @ModelAttribute("loginUser") LoginUser logUser) {
		return "index.jsp";
	}
	
	@PostMapping("/tryRegister")
	public String tryRegister(@Valid @ModelAttribute("newUser") User user, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		else {
			User newUser = userServ.createUser(user);
			if (newUser != null) {
				return "redirect:/";
			}
			else {
				return "index.jsp";
			}
		}
	}
	
	@PostMapping("/tryLogin")
	public String tryLogin(@Valid @ModelAttribute("loginUser") LoginUser logUser, BindingResult result) {
		
	}
}
