package com.neel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NeelRestServiceApplication {
	
	@GetMapping("/")
	public String getName() {
		return "Hello world!";
	}
	
	@GetMapping("/{name}")
	public String getName(@PathVariable("name") String name) {
		return "Hello "+name;
	}

	public static void main(String[] args) {
		SpringApplication.run(NeelRestServiceApplication.class, args);
	}

}
