package com.ws;

import com.ws.entities.Persona;
import com.ws.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ws.repository")
@SpringBootApplication
public class BdH2Application {

	@Autowired
	private PersonaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BdH2Application.class, args);
	}


	@Bean
	void upStart(){

		repository.save(new Persona("JHONATAN","MALLQUI","DIAZ"));

	}

}
