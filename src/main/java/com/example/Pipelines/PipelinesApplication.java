package com.example.Pipelines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class PipelinesApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Java";
	}

	public static void main(String[] args) {
		SpringApplication.run(PipelinesApplication.class, args);
	}

}
