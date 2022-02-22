package com.codingdojo.queryparam;

import java.lang.annotation.Repeatable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value = "name", required = false) String firstName, @RequestParam(value = "lastname", required = false) String lastName, @RequestParam(value = "repeat", required = false) Integer repeatTimes) {
		String greeting;
		String giveGreeting = "";
		if (firstName != null) {
			if(lastName != null) {
				greeting = sayHello(firstName, lastName);
			}
			else {
				greeting = sayHello(firstName);
			}
		}
		else if (lastName != null) {
			greeting = sayHello("Mr/Mrs. ".concat(lastName));
		}
		else {
			greeting = sayHello("Human");
		}
		
		if(repeatTimes != null && repeatTimes > 0) {
			for(int i = 1; i <= repeatTimes; i++) {
				giveGreeting = giveGreeting.concat(greeting);
			}
		}
		else {
			return greeting;
		}
		return giveGreeting;
	}
	
	public String sayHello(String name) {
		return "Hello ".concat(name + "!");
	}
	public String sayHello(String firstName, String lastName) {
		return sayHello(firstName + " " + lastName);
	}
}
