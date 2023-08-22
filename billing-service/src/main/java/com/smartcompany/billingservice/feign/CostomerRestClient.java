package com.smartcompany.billingservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smartcompany.billingservice.models.Costomer;

@FeignClient(name = "COSTOMERS-SERVICE")
public interface CostomerRestClient {
	
	@GetMapping(path = "/costomers/{id}")
   public Costomer getCostomerById(@PathVariable(name = "id") Long id);
}
