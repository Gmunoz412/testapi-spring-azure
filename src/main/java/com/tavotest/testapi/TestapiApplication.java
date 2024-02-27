package com.tavotest.testapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class TestapiApplication {

	@GetMapping("/message")
	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}


}
