package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@GetMapping("/greet")
	public ResponseEntity<String> welcomeMsg() {
		return new ResponseEntity<String>("Good Night", HttpStatus.OK);
	}
}
