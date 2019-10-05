package com.enigma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.enigma")
public class MyWebAplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAplication.class, args);
	}

}
