package com.smartcompany.billingservice.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartcompany.billingservice.models.Produit;

@FeignClient(name = "PRODUCTS-SERVICE")
public interface ProductItemClient {
	
	@GetMapping(path = "/produits")
	PagedModel<Produit> pageProduct(@RequestParam(value="page") int page,
			                        @RequestParam(value="size") int size);
	
	@GetMapping(path = "/produits/{id}")
	Produit getProductById(@PathVariable(name = "id") Long id);

}
