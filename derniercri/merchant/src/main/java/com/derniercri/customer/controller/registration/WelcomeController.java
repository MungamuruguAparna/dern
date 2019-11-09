package com.derniercri.customer.controller.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public String showWelcome() {
		System.out.println("-------------------------------welcome controller------------------------");
		return "welcome";
	}
	
	@RequestMapping("/index")
	public String showIndexWithTiles() {
		System.out.println("----------------------------------index controller---------------------------");
		return "index";
	}

}
