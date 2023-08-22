package com.smartcompany.product;

import com.smartcompany.product.models.Produit;
import com.smartcompany.product.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProduitRepository produitRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		return  args -> {
			produitRepository.save(new Produit(null,"ORDINATEUR PORTABLE","DELL",200000,50));
			produitRepository.save(new Produit(null,"ORDINATEUR FIXE","HP",150000,100));
			produitRepository.save(new Produit(null,"IMPRIMANTE MATRICIEL","CAMON",300000,15));
		};
	}
}
