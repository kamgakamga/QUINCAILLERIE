package com.smartcompany.billingservice.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.smartcompany.billingservice.models.ProduitItem;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProduitItem, Long>{
	public Collection<ProduitItem> findByBillId(Long id);

}
