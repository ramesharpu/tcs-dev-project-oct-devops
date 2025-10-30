package com.tcs.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TcsDevProjectOctDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsDevProjectOctDevopsApplication.class, args);
	}

	@GetMapping("/")
	public String greet() {
		return "<h1>Hello, welcome to TCS Dev Project!</h1>";
	}
}
