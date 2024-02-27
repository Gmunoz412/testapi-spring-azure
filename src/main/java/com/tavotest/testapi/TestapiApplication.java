package com.tavotest.testapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class TestapiApplication {

	@GetMapping("/message")
	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}


}
