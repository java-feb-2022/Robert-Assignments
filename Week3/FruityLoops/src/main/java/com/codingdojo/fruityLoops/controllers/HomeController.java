package com.codingdojo.fruityLoops.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fruityLoops.models.Fruit;

@Controller
public class HomeController {
	@RequestMapping
	public String homePage(Model model) {
		Fruit apple = new Fruit("Apple", 1.50);
		Fruit orange = new Fruit("Orange", 2.25);
		Fruit banana = new Fruit("Banana", 4.00);
		model.addAttribute("fruits", Fruit.getFruits());
		return "index.jsp";
	}
}
