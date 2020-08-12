package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.restservice"})
public class GreetingRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingRestServiceApplication.class, args);
	}

}
