package com.sitech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sitech")
public class CustServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustServiceApplication.class, args);
	}
}
