package com.apredizagem.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "9090");
		SpringApplication.run(DemoApplication.class, args);
	}

}
