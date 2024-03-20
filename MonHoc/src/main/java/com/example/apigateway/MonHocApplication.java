package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.apigateway")
public class MonHocApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonHocApplication.class, args);
	}

}
