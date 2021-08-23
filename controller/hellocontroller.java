package com.helloworld.hello.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class hellocontroller {
	
	@GetMapping
	public String hello() {
		return "/nhello Generation!!!!"+"/nessa semana usaresmos mentalidades de persistencia, orinetação ao futuro , trabalho em equipe e atenção aos detalhes ";
	}
	@GetMapping("/app_2")
	public String segundaap() {
	return "meus objetivos de aprendizagem essa semana :"+"mentalidade de crescimento,tentar aprender o maximo de spring boot,persistencia";
	}	
	
	public static void main(String[] args) {
		 SpringApplication.run(hellocontroller.class, args);
	}
      	
}
