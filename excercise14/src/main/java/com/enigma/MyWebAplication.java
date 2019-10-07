package com.enigma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class MyWebAplication extends SpringBootServletInitializer implements WebApplicationInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(MyWebAplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyWebAplication.class, args);
	}

}
