package com.vijayant.vydhaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VYDhabaController {

	@RequestMapping("/")
	public String home() {

		//System.out.println("in controller");
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String login() {

		//System.out.println("in controller");
		return "login.jsp";
	}

	@RequestMapping("/logout-success")
	public String logout() {

		//System.out.println("in controller");
		return "logout.jsp";
	}


}
