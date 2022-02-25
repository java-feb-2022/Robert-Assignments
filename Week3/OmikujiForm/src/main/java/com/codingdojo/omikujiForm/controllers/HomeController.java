package com.codingdojo.omikujiForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {		
		return "index.jsp";
	}
	
	@PostMapping("/sendOmikuji")
	public String getOmiData(@RequestParam Integer num, @RequestParam String city,
			@RequestParam String person, @RequestParam String hobby,
			@RequestParam String living, @RequestParam String nice,
			HttpSession session) {
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("nice", nice);
		
		return "redirect:/results";
	}
	
	@GetMapping("/results")
	public String results() {
		return "results.jsp";
	}
}
