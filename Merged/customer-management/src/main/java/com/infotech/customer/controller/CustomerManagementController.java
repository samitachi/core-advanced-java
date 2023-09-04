package com.infotech.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerManagementController {
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, World!";
	}
}
