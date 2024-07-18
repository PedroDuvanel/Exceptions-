package com.exceptions.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Lista;

@SpringBootApplication
public class ExceptionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionsApplication.class, args);
	
		Lista ex3 = new Lista();
		ex3.ex03();
	
	}

}
