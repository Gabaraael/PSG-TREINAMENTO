package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
	
	@GetMapping("/get")
	public String Testar() {return "<h1 stye='background-color:red;'>Hello World da vida, né</h1>";}
	
	
}
