package com.smartcompany.costomer.repositories;

import com.smartcompany.costomer.models.Costomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 14:44
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project costomer
 * Package : @package com.smartcompany.costomer.repositories
 */
@RepositoryRestResource
public interface CostomerRepository extends JpaRepository<Costomer,Long> {
}
