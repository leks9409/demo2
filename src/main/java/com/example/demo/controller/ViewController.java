package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/")
	public String login() {
		
		return "account/login";
	}
	
	@GetMapping("/home")
	public String home() {

		return "views/user/contents";
	}

	@GetMapping("/userInfo")
	public String userInfo() {

		return "views/user/userInfo";
	}
	
}
