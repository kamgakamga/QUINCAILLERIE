package com.smartcompany.costomer;

import com.smartcompany.costomer.models.Costomer;
import com.smartcompany.costomer.repositories.CostomerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CostomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostomerApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CostomerRepository costomerRepository,RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.exposeIdsFor(Costomer.class);
		return  args -> {
			costomerRepository.save(new Costomer(null,"KAMGA","Serges","serges@gmail.com","676728992"));
			costomerRepository.save(new Costomer(null,"KAMBU","Silviane","silviane@gmail.com","676728992"));
			costomerRepository.save(new Costomer(null,"DJEMNA","Sergiane","sergiane@gmail.com","676728992"));
		};
	}
}
