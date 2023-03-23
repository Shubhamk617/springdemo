package com.shubham;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMongoDbCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbCrud1Application.class, args);
	}

	@GetMapping("/getMessage")
	private String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
