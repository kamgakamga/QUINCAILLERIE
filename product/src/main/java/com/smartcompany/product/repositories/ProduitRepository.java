package com.smartcompany.product.repositories;

import com.smartcompany.product.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 14:52
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project product
 * Package : @package com.smartcompany.product.repositories
 */
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
