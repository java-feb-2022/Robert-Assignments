package com.codingdojo.sessionCounter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	@GetMapping("/")
	public String counter(HttpSession session) {
		if(session.getAttribute("counter") != null) {
			session.setAttribute("counter", (Integer) session.getAttribute("counter") + 1);
		}
		else {
			session.setAttribute("counter", 1);
		}
		return "index.jsp";
	}
}
