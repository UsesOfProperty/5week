package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {
	
	@GetMapping("/hello")
	public String index() {
		
		return "Hello!!!";
	}
}
