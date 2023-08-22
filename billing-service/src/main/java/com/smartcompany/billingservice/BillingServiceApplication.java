package com.smartcompany.billingservice;

import java.util.Date;
import java.util.Random;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import com.smartcompany.billingservice.feign.CostomerRestClient;
import com.smartcompany.billingservice.feign.ProductItemClient;
import com.smartcompany.billingservice.models.Bill;
import com.smartcompany.billingservice.models.Costomer;
import com.smartcompany.billingservice.models.Produit;
import com.smartcompany.billingservice.models.ProduitItem;
import com.smartcompany.billingservice.repositories.BillRepository;
import com.smartcompany.billingservice.repositories.ProductItemRepository;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BillRepository billRepository,
			                 ProductItemRepository productItemRepository,
			                 CostomerRestClient costomerRestClient,
			                 ProductItemClient productItemClient) {
		return args->{
			Costomer costomer = costomerRestClient.getCostomerById(2L);
			Bill b1= billRepository.save(new Bill(null,new Date(),null,null,costomer.getId()));
			PagedModel<Produit> pagedModel = productItemClient.pageProduct(0, 10);
			
			pagedModel.forEach(p->{
				ProduitItem item =new ProduitItem();
				
				item.setId(null);
				item.setBill(b1);
				item.setPrice(p.getPrix());
				item.setQuantity(1+new Random().nextInt(100));
				item.setProduitID(p.getId());
				productItemRepository.save(item);
			});
			System.out.println(costomer.getId());
			System.out.println(costomer.getNom());
			System.out.println(costomer.getPrenom());
			System.out.println(costomer.getTelephone());
			
			
		};
		
	}
}
