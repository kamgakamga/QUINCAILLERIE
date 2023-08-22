package com.smartcompany.billingservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smartcompany.billingservice.feign.CostomerRestClient;
import com.smartcompany.billingservice.feign.ProductItemClient;
import com.smartcompany.billingservice.models.Bill;
import com.smartcompany.billingservice.models.Costomer;
import com.smartcompany.billingservice.repositories.BillRepository;
import com.smartcompany.billingservice.repositories.ProductItemRepository;

@RestController
public class BillController {
	
	public final ProductItemClient productItemClient;
	public final ProductItemRepository productItemRepository;
	public final CostomerRestClient costomerRestClient;
	public final BillRepository billRepository;
	public BillController(ProductItemClient productItemClient, ProductItemRepository productItemRepository,
			CostomerRestClient costomerRestClient, BillRepository billRepository) {
		this.productItemClient = productItemClient;
		this.productItemRepository = productItemRepository;
		this.costomerRestClient = costomerRestClient;
		this.billRepository = billRepository;
	}
	
	
	@GetMapping(path= "/fullBill/{id}")
	Bill getBill(@PathVariable(name = "id") Long id) {
		Bill bill= billRepository.findById(id).get();
		Costomer costomer = costomerRestClient.getCostomerById(bill.getCostomerID());
		bill.setCostomer(costomer);
		return bill;
	}
	

}
