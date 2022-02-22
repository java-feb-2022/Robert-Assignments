package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@RequestMapping("/travel/{destination}")
	public String travelTo(@PathVariable("destination") String destination) {
		return "Congradulations! You will soon travel to " + destination;
	}
	
	@RequestMapping("/lotto/{num}")
	public String getLotto(@PathVariable("num") Integer num) {
		if (num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
