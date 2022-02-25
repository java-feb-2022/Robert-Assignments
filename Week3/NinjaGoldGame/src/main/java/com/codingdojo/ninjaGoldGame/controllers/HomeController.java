package com.codingdojo.ninjaGoldGame.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.ninjaGoldGame.models.GoldVenture;

@Controller
public class HomeController {
	private HashMap<String, GoldVenture> ventures = new HashMap<String, GoldVenture>();
	
	@GetMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null || ventures.get("farm") == null) {
			session.setAttribute("gold", (int) 5);
			ventures.put("farm", new GoldVenture(10, 20));
			ventures.put("cave", new GoldVenture(5, 10));
			ventures.put("house", new GoldVenture(2, 5));
			ventures.put("casino", new GoldVenture(-50, 50));
			ventures.put("spa", new GoldVenture(-20, -5));
		}
		return "index.jsp";
	}
	
	@PostMapping("/inputGold")
	public String getResult(@RequestParam String location, HttpSession session) {
		if (session.getAttribute("gold") != null) {
			try {
				session.setAttribute("gold", ventures.get(location).commitVenture((int) session.getAttribute("gold"), location));
				session.setAttribute("logs", GoldVenture.getLogs());
			} catch (Exception e) {
				System.out.println("Problem with App: " + e);
			}
		}
		return "redirect:/";
	}
}
