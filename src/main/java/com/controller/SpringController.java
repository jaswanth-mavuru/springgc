package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping("/fetch")
	public String name()
	{
		return "Hello";
	}
	
	@GetMapping("/fetchh")
	public String namee()
	{
		return "Hellooooo";
	}

}
