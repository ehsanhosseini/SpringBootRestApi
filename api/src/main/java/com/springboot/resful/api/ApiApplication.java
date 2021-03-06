package com.springboot.resful.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = SpringApplication.run(ApiApplication.class, args);
		
		
		for(String name:applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
