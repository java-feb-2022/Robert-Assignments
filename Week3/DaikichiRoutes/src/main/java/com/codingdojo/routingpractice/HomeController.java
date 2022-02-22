package com.codingdojo.routingpractice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("")
	public String home() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find lusk in all your endevavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an oppotunity will arise, so be sure to be open to new ideas!";
	}
}
